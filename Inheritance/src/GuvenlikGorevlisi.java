/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FERHAT ATAŞ
 */
public class GuvenlikGorevlisi extends Memur {
    
    private String belge;

    public GuvenlikGorevlisi(String belge, String departman, String mesai, String adSoyad, String telefon, String eposta) {
        super(departman, mesai, adSoyad, telefon, eposta);
        this.belge = belge;
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }
    
    public void nobet(){
        
        System.out.println(this.getAdSoyad()+" "+this.belge+" belgesini doldurdu.");
    }
    
}
