public class AvaliacaoJogoAdapter extends AvaliacaoEstrelasJogo {
    private IAvaliacaoJogo avaliacaoConceito;

    public AvaliacaoJogoAdapter(IAvaliacaoJogo avaliacaoConceito) {
        this.avaliacaoConceito = avaliacaoConceito;
    }

    public String recuperarAvaliacao() {
        int estrelas = this.getEstrelas();
        if (estrelas == 5) {
            avaliacaoConceito.setAvaliacao("Fantástico");
        } else if (estrelas == 4) {
            avaliacaoConceito.setAvaliacao("Ótimo");
        } else if (estrelas == 3) {
            avaliacaoConceito.setAvaliacao("Bom");
        } else if (estrelas == 2) {
            avaliacaoConceito.setAvaliacao("Mediano");
        } else {
            avaliacaoConceito.setAvaliacao("Fraco");
        }
        return avaliacaoConceito.getAvaliacao();
    }
    public void salvarAvaliacao() {
        String conceito = avaliacaoConceito.getAvaliacao();
        if ("Fantástico".equals(conceito)) {
            this.setEstrelas(5);
        } else if ("Ótimo".equals(conceito)) {
            this.setEstrelas(4);
        } else if ("Bom".equals(conceito)) {
            this.setEstrelas(3);
        } else if ("Mediano".equals(conceito)) {
            this.setEstrelas(2);
        } else {
            this.setEstrelas(1);
        }
    }
}
