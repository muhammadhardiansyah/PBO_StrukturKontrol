/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class GameTebakAngkaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // masukan scanner
        Scanner masukan = new Scanner(System.in);
        
        // masukan class AngkaRandom untuk membuat angka random
        AngkaRandom acak = new AngkaRandom();
        int random = acak.randomNum();
        
        //Start Game
        System.out.println("Hai..\nNama saya Mr. Java, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100"
                    + "\nSilahkan tebak ya!\n");
        Tebakan start = new Tebakan(random);
        start.tebak();
    }
    
}
