/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FERHAT ATAŞ
 */
public class BilgiIslem extends Memur {
    
    private String gorev;

    public BilgiIslem(String gorev, String departman, String mesai, String adSoyad, String telefon, String eposta) {
        super(departman, mesai, adSoyad, telefon, eposta);
        this.gorev = gorev;
        
        
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }
    
    public void networkKurulum(){
        System.out.println(this.getAdSoyad()+" newtwork kurulumu yaptı.");
    }
    
    
    
}
