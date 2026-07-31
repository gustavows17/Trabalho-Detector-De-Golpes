import javax.swing.JFileChooser;
import java.io.File;
import java.nio.file.Files;

public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("================================");
        System.out.println("     DETECTOR DE GOLPES V4");
        System.out.println("================================");

        // Cria o seletor de arquivos
        JFileChooser seletor = new JFileChooser();
        seletor.setDialogTitle("Selecione um arquivo TXT");

        // Abre a janela
        int opcao = seletor.showOpenDialog(null);

        // Verifica se o usuário selecionou um arquivo
        if (opcao != JFileChooser.APPROVE_OPTION) {
            System.out.println("Nenhum arquivo foi selecionado.");
            return;
        }

        // Obtém o arquivo escolhido
        File arquivo = seletor.getSelectedFile();

        // Lê todo o conteúdo do arquivo
        String mensagem = Files.readString(arquivo.toPath());

        // Cria o analisador
        AnalisadorGolpesV4 analisador = new AnalisadorGolpesV4();

        // Analisa a mensagem
        ResultadoV4 resultado = analisador.analisar(mensagem);

        // Exibe informações do arquivo
        System.out.println("\nArquivo selecionado: " + arquivo.getName());

        // Exibe o relatório
        System.out.println("\n========== RELATÓRIO ==========");
        System.out.println("Pontuação: " + resultado.getPontuacao());
        System.out.println("Risco: " + resultado.getNivel());

        System.out.println("\nMotivos encontrados:");

        if (resultado.getMotivos().isEmpty()) {

            System.out.println("Nenhum indício encontrado.");

        } else {

            for (String motivo : resultado.getMotivos()) {
                System.out.println("✔ " + motivo);
            }

        }

        System.out.println("\n===============================");
        System.out.println("Análise concluída.");
    }
}