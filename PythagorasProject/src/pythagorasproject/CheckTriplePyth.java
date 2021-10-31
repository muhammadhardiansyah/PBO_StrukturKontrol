package pythagorasproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class CheckTriplePyth {
    void checking(){
        System.out.println("\nCEK TRIPLE PYTHARGORAS");
        System.out.println("Masukan");
        Scanner masukan = new Scanner(System.in);
        System.out.print("A : ");
        double a = masukan.nextDouble();
        System.out.print("B : ");
        double b = masukan.nextDouble();
        System.out.print("C : ");
        double c = masukan.nextDouble();
        if (Math.sqrt((a * a) + (b * b)) % (c) == 0){
            System.out.println("\nTriple Pythagoras \n");
        }
        else {
            System.out.println("\nBukan \n");
        }
    }
}
