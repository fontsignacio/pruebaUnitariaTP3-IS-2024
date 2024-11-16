import org.example.PiedraPapelTijera;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PiedraPapelTijeraTest {
    //COMPLEJIDAD CICLOMATICA = 10

    @Test
    public void testJugador1GanaConPiedra(){
        //Arrenge -> Preparar
        PiedraPapelTijera juego = new PiedraPapelTijera();
        PiedraPapelTijera.Jugada jugaro1 = PiedraPapelTijera.Jugada.PIEDRA;
        PiedraPapelTijera.Jugada jugaro2 = PiedraPapelTijera.Jugada.TIJERA;
        String resultadoEsperado = "Jugador 1";

        //Act -> Ejecutar
        String resultadoActual = juego.jugar(jugaro1, jugaro2);

        //Assert -> Corroborar
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    public void testJugador1GanaConPapel(){
        //Arrenge -> Preparar
        PiedraPapelTijera juego = new PiedraPapelTijera();
        PiedraPapelTijera.Jugada jugaro1 = PiedraPapelTijera.Jugada.PAPEL;
        PiedraPapelTijera.Jugada jugaro2 = PiedraPapelTijera.Jugada.PIEDRA;
        String resultadoEsperado = "Jugador 1";

        //Act -> Ejecutar
        String resultadoActual = juego.jugar(jugaro1, jugaro2);

        //Assert -> Corroborar
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    public void testJugador1GanaConTijera(){
        //Arrenge -> Preparar
        PiedraPapelTijera juego = new PiedraPapelTijera();
        PiedraPapelTijera.Jugada jugaro1 = PiedraPapelTijera.Jugada.TIJERA;
        PiedraPapelTijera.Jugada jugaro2 = PiedraPapelTijera.Jugada.PAPEL;
        String resultadoEsperado = "Jugador 1";

        //Act -> Ejecutar
        String resultadoActual = juego.jugar(jugaro1, jugaro2);

        //Assert -> Corroborar
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    public void testJugador2GanaConPiedra(){
        //Arrenge -> Preparar
        PiedraPapelTijera juego = new PiedraPapelTijera();
        PiedraPapelTijera.Jugada jugaro1 = PiedraPapelTijera.Jugada.TIJERA;
        PiedraPapelTijera.Jugada jugaro2 = PiedraPapelTijera.Jugada.PIEDRA;
        String resultadoEsperado = "Jugador 2";

        //Act -> Ejecutar
        String resultadoActual = juego.jugar(jugaro1, jugaro2);

        //Assert -> Corroborar
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    public void testJugador2GanaConPapel(){
        //Arrenge -> Preparar
        PiedraPapelTijera juego = new PiedraPapelTijera();
        PiedraPapelTijera.Jugada jugaro1 = PiedraPapelTijera.Jugada.PIEDRA;
        PiedraPapelTijera.Jugada jugaro2 = PiedraPapelTijera.Jugada.PAPEL;
        String resultadoEsperado = "Jugador 2";

        //Act -> Ejecutar
        String resultadoActual = juego.jugar(jugaro1, jugaro2);

        //Assert -> Corroborar
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    public void testJugador2GanaConTijera(){
        //Arrenge -> Preparar
        PiedraPapelTijera juego = new PiedraPapelTijera();
        PiedraPapelTijera.Jugada jugaro1 = PiedraPapelTijera.Jugada.PAPEL;
        PiedraPapelTijera.Jugada jugaro2 = PiedraPapelTijera.Jugada.TIJERA;
        String resultadoEsperado = "Jugador 2";

        //Act -> Ejecutar
        String resultadoActual = juego.jugar(jugaro1, jugaro2);

        //Assert -> Corroborar
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    public void testEmpateConPiedra(){
        //Arrenge -> Preparar
        PiedraPapelTijera juego = new PiedraPapelTijera();
        PiedraPapelTijera.Jugada jugaro1 = PiedraPapelTijera.Jugada.PIEDRA;
        PiedraPapelTijera.Jugada jugaro2 = PiedraPapelTijera.Jugada.PIEDRA;
        String resultadoEsperado = "Empate";

        //Act -> Ejecutar
        String resultadoActual = juego.jugar(jugaro1, jugaro2);

        //Assert -> Corroborar
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    public void testEmpateConPapel(){
        //Arrenge -> Preparar
        PiedraPapelTijera juego = new PiedraPapelTijera();
        PiedraPapelTijera.Jugada jugaro1 = PiedraPapelTijera.Jugada.PAPEL;
        PiedraPapelTijera.Jugada jugaro2 = PiedraPapelTijera.Jugada.PAPEL;
        String resultadoEsperado = "Empate";

        //Act -> Ejecutar
        String resultadoActual = juego.jugar(jugaro1, jugaro2);

        //Assert -> Corroborar
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    public void testEmpateConTijera(){
        //Arrenge -> Preparar
        PiedraPapelTijera juego = new PiedraPapelTijera();
        PiedraPapelTijera.Jugada jugaro1 = PiedraPapelTijera.Jugada.TIJERA;
        PiedraPapelTijera.Jugada jugaro2 = PiedraPapelTijera.Jugada.TIJERA;
        String resultadoEsperado = "Empate";

        //Act -> Ejecutar
        String resultadoActual = juego.jugar(jugaro1, jugaro2);

        //Assert -> Corroborar
        assertEquals(resultadoEsperado, resultadoActual);
    }

    @Test
    public void testError(){
        //Arrenge -> Preparar
        PiedraPapelTijera juego = new PiedraPapelTijera();
        PiedraPapelTijera.Jugada jugaro1 = PiedraPapelTijera.Jugada.PIEDRA;
        PiedraPapelTijera.Jugada jugaro2 = PiedraPapelTijera.Jugada.TIJERA;
        String error = "Error";

        //Act -> Ejecutar
        String resultadoActual = juego.jugar(jugaro1, jugaro2);

        //Assert -> Corroborar
        assertNotEquals(error, resultadoActual);
    }
}
