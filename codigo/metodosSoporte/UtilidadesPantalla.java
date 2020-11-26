package codigo.metodosSoporte;

import java.io.IOException;

/**
 * utilidadesPantalla
 */
public class UtilidadesPantalla {

    static void limpiarPantalla() throws IOException, InterruptedException
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
