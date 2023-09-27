public class AvaliacaoConceitoJogo implements IAvaliacaoJogo {
    private String conceito;

    @Override
    public String getAvaliacao() {
        return this.conceito;
    }

    @Override
    public void setAvaliacao(String conceito) {
        this.conceito = conceito;
    }
}
