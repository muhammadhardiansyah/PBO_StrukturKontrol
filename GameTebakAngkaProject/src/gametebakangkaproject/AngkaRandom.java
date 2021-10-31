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
import java.util.Random;
public class AngkaRandom {
    int randomNum(){
        Random rand = new Random();
        int nilaiRandom = rand.nextInt((100-0) + 1) + 0;
        return nilaiRandom;
    }
}
