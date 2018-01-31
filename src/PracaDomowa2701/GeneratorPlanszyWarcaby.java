package PracaDomowa2701;

import java.util.Scanner;

public class GeneratorPlanszyWarcaby {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj wymiary pola\n");

        System.out.println("X: (poziomo)");
        int x = Integer.parseInt(sc.nextLine());

        System.out.println("Y: (pionowo)");
        int y = Integer.parseInt(sc.nextLine());

        System.out.println("Podaj kolor pierwszego pola. \"C\" - czarny, \"B\" - biały");
        String color = sc.next().toUpperCase();

        String [] colorX = {"C", "B"};
        String [][] deck = new String[x][y];
        if (color.equals(colorX[0])){
            System.out.println("Kolor startowy C");
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if ((i+j)%2 == 0)
                        deck[i][j] = colorX[0];
                    else
                        deck[i][j] = colorX[1];
                    System.out.printf("%2s", deck[i][j]);
                }
                System.out.println();
            }
        }else if(color.equals(colorX[1])){
            System.out.println("kolor startowy B");
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    if ((i+j)%2 == 0)
                        deck[i][j] = colorX[1];
                    else
                        deck[i][j] = colorX[0];
                    System.out.printf("%2s", deck[i][j]);
                }
                System.out.println();
            }
        }else{
            System.out.println("Wybrano nieprawidłowy kolor pola");
        }
    }
}
