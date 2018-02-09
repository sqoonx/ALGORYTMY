package ZbiorZadan;

import java.util.Scanner;

public class Zad12WeryfikacjaPesel {
    public static void main(String[] args) {
        int [] waga = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length(); i++){
            sum += Integer.parseInt(input.substring(i, i+1))*waga[i];
        }
        if (sum%10 == 0)
            System.out.println("PESEL ok");
        else
            System.out.println("PESEL nok");
    }
}
