/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FERHAT ATAŞ
 */
public class Memur extends Calisan {
    private String departman;
    private String mesai;

    public Memur(String departman, String mesai, String adSoyad, String telefon, String eposta) {
        super(adSoyad, telefon, eposta);
        this.departman = departman;
        this.mesai = mesai;
    }
    
    public void Calıs(){
        
        System.out.println(this.getAdSoyad()+" "+this.departman+" departmanında çalışmaya başladı.");
    }
    
}
