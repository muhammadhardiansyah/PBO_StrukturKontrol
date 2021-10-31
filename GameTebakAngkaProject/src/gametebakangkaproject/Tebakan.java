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
public class Tebakan {
    static int random;
    Tebakan (int randomNum){
        random = randomNum;
    }
    void tebak(){
        Scanner masukan = new Scanner(System.in);
        while (true){
            //Tebakan Player
            System.out.print("Masukan Tebakan Anda : ");
            int tebak = masukan.nextInt();
            
            //Hasil Tebakan
            if (tebak == random) {
                System.out.println("\nYeeee... Bilangan tebakan anda benar!! :-) \n");
                break;
            }
            else if (tebak > random && tebak <= 100) {
                System.out.println("\nHehe. Bilangan tebakan anda terlalu besar. Coba Lagi . . \n");
            }
            else if (tebak < random && tebak >= 0 ) {
                System.out.println("\nHaha. Bilangan tebakan anda terlalu kecil. Coba Lagi . . .\n");
            }
            else if (tebak < 0){
                System.out.println("\nTebak dengan benar. Nilai minimum dari bilangan randomnya adalah 0\n");
            }
            else if (tebak > 100){
                System.out.println("\nTebak dengan benar. Nilai maksimal dari bilangan randomnya adalah 100\n");
            }
        }   
    }
}
