/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FERHAT ATAŞ
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1.Program başlatılıyor");
        Users u1 = new Users("Ferhat");
        Users u2 = new Users("Hamza");
        
        System.out.println("Counter son değer: "+ Users.counter);
        System.out.println("Program bitti.");
              
    }
    
}
