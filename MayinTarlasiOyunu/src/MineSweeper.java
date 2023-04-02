
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class MineSweeper {

    private final Scanner sc = new Scanner(System.in);
    private final Random rm = new Random();
    private int row;
    private int col;
    private String[][] mineField;
    private String[][] revealed;

    private int mineCount;

    public void start() {

        // Burada mayın tarlamızı belirledik, mayınlarımızı hazırlayıp tarlamıza yerleştirdik.
        System.out.println("Mayın tarlası oyununa hoşgeldiniz.");

        System.out.print("Satır Sayısını Belirleyiniz : ");
        row = sc.nextInt();
        System.out.print("Sütun Sayısını Belirleyiniz : ");
        col = sc.nextInt();

        mineCount = (row * col) / 4;

        mineField = new String[row][col];
        revealed = new String[row][col];

        for (int i = 0; i < mineField.length; i++) {
            for (int j = 0; j < mineField[i].length; j++) {

                mineField[i][j] = "-";
                revealed[i][j] = "-";
            }

        }

        while (mineCount > 0) {

            int i = rm.nextInt(row);
            int j = rm.nextInt(col);

            if (mineField[i][j].equals("-")) {

                mineField[i][j] = "*";
                mineCount--;

            }

        }
        //Burada haritamızı bastırıyoruz.
        printRevealed();

        //Burada while ile döngümüzü başlatıyoruz.
        play();

    }

    private void play() {
        boolean finish = false;
        while (!finish) {

            System.out.print("Satır Giriniz : ");
            int seRow = sc.nextInt();
            System.out.print("Sutun Giriniz : ");
            int seCol = sc.nextInt();

            int number = 0;

            if (seRow < row && seCol < col) {

                if (mineField[seRow][seCol].equals("-") && revealed[seRow][seCol].equals("-")) {

                    for (int i = seRow - 1; i < seRow + 2; i++) {
                        for (int j = seCol - 1; j < seCol + 2; j++) {

                            if (i >= 0 && j >= 0 && i < row && j < col && mineField[i][j].equals("*")) {
                                number++;
                                revealed[seRow][seCol] = Integer.toString(number);
                            } else {
                                revealed[seRow][seCol] = Integer.toString(number);
                            }

                        }

                    }
                     printRevealed();

                    if (!checkWin()) {

                        System.out.println("Tebrikler kazandınız.");
                        printMine();
                        finish = true;

                    }

                   

                } else if (mineField[seRow][seCol].equals("*")) {

                    System.out.println("Mayına bastınız. Oyun bitti.");
                    printMine();
                    finish = true;

                } else if (!revealed[seRow][seCol].equals("-")) {

                    System.out.println("Lütfen farklı bir kare seçiniz.\nBu kare daha önce seçildi.");

                }

            } else {
                System.out.println("Lütfen alan dışından seçim yapmayınız.\nHatalı seçim.");
            }

        }

    }

    private void printRevealed() {
        System.out.println("---------------------------------");

        for (int i = 0; i < revealed.length; i++) {
            for (int j = 0; j < revealed[i].length; j++) {

                System.out.print(revealed[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("---------------------------------");
    }

    private void printMine() {
        System.out.println("---------------------------------");
        for (int i = 0; i < mineField.length; i++) {
            for (int j = 0; j < mineField[i].length; j++) {
                System.out.print(mineField[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("---------------------------------");
    }

    private boolean checkWin() {
        int count = 0;
        int mineNumber = 0;
        for (int i = 0; i < revealed.length; i++) {
            for (int j = 0; j < revealed[i].length; j++) {

                if (revealed[i][j].equals("-")) {

                    count++;

                }
                if (mineField[i][j].equals("*")) {

                    mineNumber++;

                }

            }

        }

        if (mineNumber == count) {

            return false;

        }

        return true;
    }

}
