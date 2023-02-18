
public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {

        if (isChack()) {
            while (this.f1.health >= 0 && this.f2.health >= 0) {
                
                System.out.println("******** YENİ ROUND ********");

                f1.health = f2.hit(f1);


                if (isWin()) {
                    break;
                }

                f2.health = f1.hit(f2);
                System.out.println(this.f2.name + " " + this.f2.health + " kalan canı");
                System.out.println(this.f1.name + " " + this.f1.health + " kalan canı");
                if (isWin()) {
                    break;
                }

            }

        } else {
            System.out.println("Boksör sikletleri uyumsuz.");
        }
    }

    boolean isChack() {

        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (f1.health <= 0) {

            System.out.println(this.f2.name + " kazandı.");

            return true;

        }
        if (f2.health <= 0) {

            System.out.println(this.f1.name + " kazandı.");

            return true;

        }

        return false;
    }
}
