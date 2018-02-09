package ZbiorZadan;

import java.util.Scanner;

public class Zad9WeryfikacjaDowodu {
    public static void main(String[] args) {
        char[] arr1 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B',
                'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().trim().toUpperCase().toCharArray();

        int [] wagi = {7, 3, 1, 9, 7, 3, 1, 7, 3};
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (input[i] == arr1[j]){
                    sum += j*wagi[i];
                    break;
                }
            }
        }
        if (sum%10 == 0)
            System.out.println("Dowód OK");
        else
            System.out.println("Dowód NOK");
    }
}