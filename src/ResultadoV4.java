import java.util.ArrayList;
import java.util.List;

// Classe responsável por armazenar o resultado da análise.
// Ela guarda a pontuação final, o nível de risco
// e todos os motivos encontrados durante a verificação.
public class ResultadoV4 {

    // Armazena a pontuação total da mensagem analisada.
    private int pontuacao;

    // Armazena a classificação do risco
    // (SEGURO, BAIXO, MODERADO, ALTO...).
    private String nivel;

    // Lista que guarda todos os indícios encontrados
    // durante a análise da mensagem.
    private List<String> motivos;

    // Construtor da classe.
    // Sempre que um objeto ResultadoV4 é criado,
    // a lista de motivos também é inicializada vazia.
    public ResultadoV4() {

        motivos = new ArrayList<>();

    }

    // Retorna a pontuação da análise.
    public int getPontuacao() {

        return pontuacao;

    }

    // Define a pontuação calculada pelo analisador.
    public void setPontuacao(int pontuacao) {

        this.pontuacao = pontuacao;

    }

    // Retorna o nível de risco da mensagem.
    public String getNivel() {

        return nivel;

    }

    // Define o nível de risco da mensagem.
    public void setNivel(String nivel) {

        this.nivel = nivel;

    }

    // Retorna todos os motivos encontrados
    // durante a análise.
    public List<String> getMotivos() {

        return motivos;

    }

    // Adiciona um novo motivo à lista.
    // Este método é chamado sempre que o analisador
    // identifica um indício de golpe.
    public void adicionarMotivo(String motivo) {

        motivos.add(motivo);

    }

}
