import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JogoTest {
    @Test
    void deveRetornarConceitoJogo() {
        Jogo jogo = new Jogo();
        jogo.setAvaliacao("Fantástico");

        assertEquals("Fantástico", jogo.getAvaliacao());
    }

    @Test
    void deveRetornarEstrelasJogo() {
        Jogo jogo = new Jogo();
        jogo.setAvaliacao("Fantástico");

        assertEquals(5, jogo.getEstrelas());
    }

    @Test
    void deveRetornarConceitoMedianoPara2Estrelas() {
        Jogo jogo = new Jogo();
        jogo.setAvaliacao("Mediano");

        assertEquals("Mediano", jogo.getAvaliacao());
    }

    @Test
    void deveRetornar2EstrelasParaConceitoMediano() {
        Jogo jogo = new Jogo();
        jogo.setAvaliacao("Mediano");

        assertEquals(2, jogo.getEstrelas());
    }
}