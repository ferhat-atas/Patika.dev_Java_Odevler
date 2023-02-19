
public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    boolean vurusSirasi;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void basla() {

        if (kiloKontrol()) {

            while (this.f1.health >= 0 && this.f2.health >= 0) {

                System.out.println("***************** ROUND ***************** ");
                if (vurusSirasi()) {

                    this.f1.health = f2.alinanDarbe(f1);
                    if (kazanan()) {
                        break;

                    }

                } else {

                    this.f2.health = f1.alinanDarbe(f2);
                    if (kazanan()) {
                        break;

                    }

                }
                if (vurusSirasi()) {

                    this.f1.health = f2.alinanDarbe(f1);
                    if (kazanan()) {
                        break;

                    }

                } else {

                    this.f2.health = f1.alinanDarbe(f2);
                    if (kazanan()) {
                        break;

                    }

                }
                kalanCanlar();
            }

        } else {

            System.out.println("Dövüşçülerin sikletleri uyumsuz.");
        }

    }

    boolean kiloKontrol() {

        if (this.f1.weight >= minWeight && this.f1.weight <= maxWeight && this.f2.weight >= minWeight && this.f2.weight <= maxWeight) {

            return true;
        }
        return false;
    }

    boolean vurusSirasi() {

        vurusSirasi = Math.random() * 2 <= 1;

        return vurusSirasi;

    }

    boolean kazanan() {

        if (f1.health == 0) {

            System.out.println("Kazanan " + f2.name);
            return true;
        } else if (f2.health == 0) {

            System.out.println("Kazanan " + f1.name);
            return true;

        }

        return false;
    }
    
   void kalanCanlar(){
       
       System.out.println(this.f1.name + " Kalan canı: " + this.f1.health);
                System.out.println(this.f2.name + " Kalan canı: " + this.f2.health);
        
    }

}
