import java.util.HashMap;

public class PalavrasSuspeitas {

    public static HashMap<String, Integer> carregar() {

        HashMap<String, Integer> palavras = new HashMap<>();

        // =========================
        // Financeiro
        // =========================

        palavras.put("pix", 10);
        palavras.put("transferencia", 4);
        palavras.put("pagamento", 4);
        palavras.put("taxa", 10);
        palavras.put("deposito", 4);
        palavras.put("boleto", 4);
        palavras.put("juros", 10);
        palavras.put("encargos", 10);
        palavras.put("regularizacao", 10);

        // =========================
        // Dados pessoais
        // =========================

        palavras.put("senha", 10);
        palavras.put("cpf", 10);
        palavras.put("rg", 10);
        palavras.put("token", 10);
        palavras.put("codigo", 10);
        palavras.put("verificacao", 10);
        palavras.put("documento", 10);
        palavras.put("foto", 10);
        palavras.put("dados", 10);
        palavras.put("cadastrais", 10);
        palavras.put("gov", 10);

        // =========================
        // Urgência
        // =========================

        palavras.put("urgente", 20);
        palavras.put("urgencia", 20);
        palavras.put("imediatamente", 20);
        palavras.put("imediata", 20);
        palavras.put("agora", 10);
        palavras.put("hoje", 10);
        palavras.put("prazo", 10);
        palavras.put("expira", 5);
        palavras.put("vence", 5);

        // =========================
        // Links
        // =========================

        palavras.put("clique", 5);
        palavras.put("link", 10);
        palavras.put("acesse", 5);
        palavras.put("http", 15);
        palavras.put("https", 15);

        // =========================
        // Prêmios
        // =========================

        palavras.put("premio", 20);
        palavras.put("gratuito", 10);
        palavras.put("ganhou", 10);
        palavras.put("parabens", 20);
        palavras.put("sorteio", 15);
        palavras.put("brinde", 15);
        palavras.put("vale-compras", 10);

        // =========================
        // Governo
        // =========================

        palavras.put("detran", 30);
        palavras.put("cnh", 20);
        palavras.put("receita federal", 20);
        palavras.put("inss", 15);
        palavras.put("tribunal", 15);
        palavras.put("justica", 15);
        palavras.put("policia", 15);
        palavras.put("governo", 10);

        // =========================
        // Infrações
        // =========================

        palavras.put("infracao", 15);
        palavras.put("grave", 10);
        palavras.put("gravissima", 15);
        palavras.put("suspensao", 15);
        palavras.put("bloqueio", 15);
        palavras.put("cancelamento", 15);
        palavras.put("restricao", 15);
        palavras.put("apreensao", 15);
        palavras.put("multa", 10);
        palavras.put("penalidade", 10);
        palavras.put("licenciamento", 10);
        palavras.put("renovacao", 10);
        palavras.put("pendencia", 10);

        // =========================
        // Linguagem de ameaça
        // =========================

        palavras.put("regularize", 10);
        palavras.put("evite", 10);
        palavras.put("consequencias", 10);
        palavras.put("protocolo", 10);
        palavras.put("status", 10);
        palavras.put("situacao", 10);
        palavras.put("natureza", 10);
        palavras.put("registrado", 10);
        palavras.put("registro", 10);
        palavras.put("atencao", 10);
        palavras.put("automaticamente", 4);

        // =========================
        // Golpes comuns
        // =========================

        palavras.put("beneficio", 10);
        palavras.put("cadastro", 10);
        palavras.put("atualizacao", 10);
        palavras.put("confirme", 10);
        palavras.put("verifique", 10);
        palavras.put("conta", 5);
        palavras.put("acesso", 10);
        palavras.put("liberacao", 10);
        palavras.put("liberar", 10);
        palavras.put("validar", 10);
        palavras.put("validacao", 10);

        return palavras;
    }
}