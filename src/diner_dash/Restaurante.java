package diner_dash;

import Juego.Cola_FilaEntrada;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kleve
 */
public class Restaurante {
     Cola_FilaEntrada app = new Cola_FilaEntrada();
    private int Mesas [][] = new int [15][6];
    
    public void Mesas(){

        for(int x = 0; x < Mesas.length; x++) {
            for (int y = 0; y < Mesas[x].length; y++) {
                Mesas[x][y] = 0;//problemas con éste valor, no retorna el valor del primero de la cola
            }
        }
        for (int x = 0; x < Mesas.length; x++) {
            for (int y = 0; y < Mesas[x].length; y++) {
                System.out.print(Mesas[x][y] + "  ");
            }
            System.out.println();
        }
    } 
}
