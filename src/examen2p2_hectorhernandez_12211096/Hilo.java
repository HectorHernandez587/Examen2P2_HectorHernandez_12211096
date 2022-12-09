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

    private String[][] matriz;
    private String instrucciones;
    private String bananas;
    private Banana_Suprema bs;

    public Hilo() {
    }

    public Hilo(String[][] matriz, String instrucciones, String bananas, Banana_Suprema bs) {
        this.matriz = matriz;
        this.instrucciones = instrucciones;
        this.bananas = bananas;
        this.bs = bs;
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

    public Banana_Suprema getBs() {
        return bs;
    }

    public void setBs(Banana_Suprema bs) {
        this.bs = bs;
    }

    @Override
    public String toString() {
        return "Hilo{" + "matriz=" + matriz + ", instrucciones=" + instrucciones + ", bananas=" + bananas + ", bs=" + bs + '}';
    }

    @Override
    public void run() {

        int largo = 0;
        if (largo < instrucciones.length()) {
            String ultimo = instrucciones.substring(instrucciones.length() - 1);
            char[] lastChar = ultimo.toCharArray();
            //int coor_x = 1 + r.nextInt(11);
            //int coor_y = 1 + r.nextInt(31);
            int coor_x = bs.getX();
            int coor_y = bs.getY();

            while (true) {
                if (lastChar[lastChar.length - 1] == 'W' || lastChar[lastChar.length - 1] == 'w') {
                    try {
                        //Arriba
                        bs.setY(coor_y - 1);
                        coor_y = bs.getY();

                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {

                    }

                } else if (lastChar[lastChar.length - 1] == 'S' || lastChar[lastChar.length - 1] == 's') {
                    try {
                        //Abajo

                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {

                    }

                } else if (lastChar[lastChar.length - 1] == 'A' || lastChar[lastChar.length - 1] == 'a') {
                    try {
                        //Izquierda

                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {

                    }

                } else if (lastChar[lastChar.length - 1] == 'D' || lastChar[lastChar.length - 1] == 'd') {
                    try {
                        //Derecha

                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {

                    }

                }

            }
        }

    }

}
