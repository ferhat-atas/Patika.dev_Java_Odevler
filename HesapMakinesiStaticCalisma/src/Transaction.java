
public class Transaction {

    public static double total(double number1, double number2) {

        return number1 + number2;

    }

    public static double subtract(double number1, double number2) {

        return number1 - number2;
    }

    public static double product(double number1, double number2) {

        return number1 * number2;
    }

    public static double divide(double number1, double number2) {

        if (number2 == 0) {

            System.out.println("Sıfıra bölme hatası!");
            return 0;
        } else {
            return number1 / number2;

        }

    }

}
