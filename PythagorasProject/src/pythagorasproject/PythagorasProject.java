/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class PythagorasProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true){
            System.out.println("MENU");
            System.out.println("1. Cek Triple Pythagoras");
            System.out.println("2. Menentukan Sisi Miring Segitiga");
            System.out.println("3. Menentukan Sisi Siku-Siku Segitiga");
            System.out.println("4. Exit");
            Scanner pilih = new Scanner(System.in);
            System.out.print("Pilih : ");
            int select = pilih.nextInt();
            
            //mencegah error ketika di Enter
            pilih.nextLine();
            
            switch (select){
                case 1:
                    CheckTriplePyth cekPyth = new CheckTriplePyth();
                    cekPyth.checking();
                    break;
                case 2:
                    SisiMiring sm = new SisiMiring();
                    sm.hasil();
                    break;
                case 3:
                    SisiSiku sk = new SisiSiku();
                    sk.hasil();
                    break;
                case 4:
                    System.out.println("TERIMAKASIH...");
                    System.exit(0);
                default:
                    System.out.println("Pilih dengan BENAR!\n");
                    
            }
        }
  
    
 }
}