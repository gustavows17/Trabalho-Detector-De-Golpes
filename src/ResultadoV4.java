import java.util.ArrayList;
import java.util.List;

public class ResultadoV4 {

    private int pontuacao;
    private String nivel;
    private List<String> motivos;

    public ResultadoV4() {
        motivos = new ArrayList<>();
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public List<String> getMotivos() {
        return motivos;
    }

    public void adicionarMotivo(String motivo) {
        motivos.add(motivo);
    }
}