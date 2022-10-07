
package notortalamasihesaplama;

import java.util.Scanner;


public class NotOrtalamasiHesaplama {
    
    /*
 Not Ortalaması Hesaplayan Program
*Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını 
kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Ödev
*Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması
60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...

 */

    
    public static void main(String[] args) {
        
        int mat;
        int fiz;
        int kim;
        int turk;
        int tar;
        int muz;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Lütfen Matamatik notunuzu giriniz: ");
        
        mat = sc.nextInt();
        
        System.out.print("Lütfen Fizik notunuzu giriniz: ");
        
        fiz = sc.nextInt();
        
        System.out.print("Lütfen Kimya notunuzu giriniz: ");
        
        kim = sc.nextInt();
        
        System.out.print("Lütfen Türkçe notunuzu giriniz: ");
        
        turk = sc.nextInt();
        
        System.out.print("Lütfen Tarih notunuzu giriniz: ");
        
        tar = sc.nextInt();
        
        System.out.print("Lütfen Müzik notunuzu giriniz: ");
        
        muz = sc.nextInt();
        
        int ortalama = (mat + fiz + kim + turk + tar + muz)/6;
        
        boolean sonuc = ortalama >60;
        
        System.out.println(sonuc ? "Sınıfı geçti.":"Sınıfta kaldı.");
        
        
        
        
        
        
        
    }
    
}
