package diner_dash;

import java.util.Random;
/**
 *
 * @author kleve
 */
public class Logica {
     
       public void Random(){
            Random generador = new Random();
            Cola_FilaEntrada app = new Cola_FilaEntrada();

        do {
            int indice_random = generador.nextInt(6); 
            app.enqueue(indice_random + 1);
        }
        while (app.contar() < 5);
            app.contar(); 

    }
}