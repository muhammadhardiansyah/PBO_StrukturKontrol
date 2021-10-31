/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class SisiMiring {
    void hasil(){
        System.out.println("\nMENGHITUNG SISI MIRING");
        System.out.println("Masukan");
        Scanner masukan = new Scanner(System.in);
        System.out.print("A : ");
        double a = masukan.nextDouble();
        System.out.print("B : ");
        double b = masukan.nextDouble();
        double c = Math.sqrt((a * a) + (b * b));
        System.out.println("Sisi miring dari "+a+" dan "+b+" adalah "+c+"\n");
    }
}
