
public class Book {
    // Burada değerlerimizi private yaparak dışardan direk müdahaleleri engelliyoruz.

    private String kitapAdi;
    private int kitapSayfasi;

    private void Book(String kitapAdi, int kitapSayfasi) {

        this.kitapAdi = kitapAdi;
        this.kitapSayfasi = kitapSayfasi;
    }

    // Burada getter - setter metotlerımızla Encapsulation uyguluyoruz.
    public int getKitapSayfasi() {

        return this.kitapSayfasi;
    }
    
    // Burada if değeriyle dışardan girilecek hatalı bir değeri sınırlayarak sistemimizi anlamsız grişlere karşı koruma altına aldık.
    public void setKitapSayfasi(int kitapSayfasi) {
        if (kitapSayfasi < 0) {

            this.kitapSayfasi = 0;

        } else {
            this.kitapSayfasi = kitapSayfasi;
        }

    }

    public String getKitapAdi() {

        return this.kitapAdi;

    }

    public void setKitapAdi(String kitapAdi) {

        this.kitapAdi = kitapAdi;
    }

}
