import java.text.Normalizer;
import java.util.HashMap;
import java.util.Map;

public class AnalisadorGolpesV4 {

    public ResultadoV4 analisar(String mensagem) {

        ResultadoV4 resultado = new ResultadoV4();

        // Converte para minúsculas e remove acentos
        String texto = Normalizer.normalize(mensagem.toLowerCase(), Normalizer.Form.NFD);
        texto = texto.replaceAll("\\p{M}", "");

        int pontuacao = 0;

        HashMap<String, Integer> palavrasSuspeitas = PalavrasSuspeitas.carregar();

        // Procura palavras suspeitas
        for (Map.Entry<String, Integer> entrada : palavrasSuspeitas.entrySet()) {

            if (texto.contains(entrada.getKey())) {

                pontuacao += entrada.getValue();
                resultado.adicionarMotivo(
                        "Palavra suspeita encontrada: " + entrada.getKey());

            }
        }

        // Procura links
        if (texto.contains("http://") ||
                texto.contains("https://") ||
                texto.contains("www.") ||
                texto.contains(".com")) {

            pontuacao += 20;
            resultado.adicionarMotivo("Mensagem contém link.");
        }

        // Conta exclamações
        int excl = 0;

        for (int i = 0; i < mensagem.length(); i++) {

            if (mensagem.charAt(i) == '!') {
                excl++;
            }
        }

        if (excl >= 3) {

            pontuacao += 10;
            resultado.adicionarMotivo("Uso excessivo de exclamações.");
        }

        // Conta letras maiúsculas
        int maiusculas = 0;
        int letras = 0;

        for (int i = 0; i < mensagem.length(); i++) {

            char c = mensagem.charAt(i);

            if (Character.isLetter(c)) {

                letras++;

                if (Character.isUpperCase(c)) {
                    maiusculas++;
                }
            }
        }

        if (letras > 0) {

            double porcentagem = (double) maiusculas / letras;

            if (porcentagem >= 0.5) {

                pontuacao += 15;
                resultado.adicionarMotivo("Grande quantidade de letras maiúsculas.");
            }
        }

        resultado.setPontuacao(pontuacao);

        if (pontuacao == 0) {

            resultado.setNivel("SEGURO");

        } else if (pontuacao <= 20) {

            resultado.setNivel("BAIXO");

        } else if (pontuacao <= 40) {

            resultado.setNivel("MODERADO");

        } else {

            resultado.setNivel("ALTO");
        }

        return resultado;
    }
}