public class Jogo {
    IAvaliacaoJogo avaliacao;
    AvaliacaoJogoAdapter persistencia;

    public Jogo() {
        avaliacao = new AvaliacaoConceitoJogo();
        persistencia = new AvaliacaoJogoAdapter(avaliacao);
    }

    public void setAvaliacao(String conceito) {
        avaliacao.setAvaliacao(conceito);
        persistencia.salvarAvaliacao();
    }

    public String getAvaliacao() {
        return persistencia.recuperarAvaliacao();
    }

    public int getEstrelas() {
        return persistencia.getEstrelas();
    }
}
