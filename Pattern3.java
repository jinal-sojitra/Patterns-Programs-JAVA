/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apnikakshajava.Patterns;

/**
 *
 * @author Jinal Sojitra
 */
public class Pattern3 {
    public static void main(String[] args){
        byte n=5;
        for (byte i=1;i<=n;i++){
            for(byte j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
