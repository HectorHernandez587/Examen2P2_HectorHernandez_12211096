/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_hectorhernandez_12211096;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hector
 */
public class Hilo implements Runnable {
    Random r = new Random();

    private String [][] matriz;
    private String instrucciones;
    private String bananas;

    public Hilo() {
    }

    public Hilo(String[][] matriz, String instrucciones, String bananas) {
        this.matriz = matriz;
        this.instrucciones = instrucciones;
        this.bananas = bananas;
    }

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public String getBananas() {
        return bananas;
    }

    public void setBananas(String bananas) {
        this.bananas = bananas;
    }

    @Override
    public String toString() {
        return "Hilo{" + "matriz=" + matriz + ", instrucciones=" + instrucciones + ", bananas=" + bananas + '}';
    }

    @Override
    public void run() {
        int largo = 0;
        if (largo < instrucciones.length()) {
            String ultimo = instrucciones.substring(instrucciones.length() - 1);
            char[] lastChar = ultimo.toCharArray();
            //int coor_x = 1 + r.nextInt(11);
            //int coor_y = 1 + r.nextInt(31);
            int coor_x = 5;
            int coor_y = 5;
            
            matriz[coor_x][coor_y] = "@";
            matriz[coor_x - 1][coor_y] = "X";
            matriz[coor_x - 2][coor_y] = "X";
            

            if (lastChar[lastChar.length - 1] == 'W' || lastChar[lastChar.length - 1] == 'w') {
                try {
                    //Arriba
                    

                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (lastChar[lastChar.length - 1] == 'S' || lastChar[lastChar.length - 1] == 's') {
                try {
                    //Abajo

                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (lastChar[lastChar.length - 1] == 'A' || lastChar[lastChar.length - 1] == 'a') {
                try {
                    //Izquierda

                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (lastChar[lastChar.length - 1] == 'D' || lastChar[lastChar.length - 1] == 'd') {
                try {
                    //Derecha

                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }

    }

}
