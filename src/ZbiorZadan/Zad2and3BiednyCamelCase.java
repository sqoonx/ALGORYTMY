package ZbiorZadan;

import java.util.Scanner;

public class Zad2and3BiednyCamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] arr = input.split(" ");
        char [] arrToReplace = {'a', 'ą', 'b', 'c', 'ć', 'd', 'e', 'ę', 'f',
                'g', 'h', 'i', 'j', 'k', 'l', 'ł', 'm', 'n', 'ń', 'o', 'ó',
                'p', 'q', 'r', 's', 'ś', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'ź', 'ż'};
        char [] arrReplaced = {'a', 'a', 'b', 'c', 'c', 'd', 'e', 'e', 'f',
                'g', 'h', 'i', 'j', 'k', 'l', 'l', 'm', 'n', 'n', 'o', 'o',
                'p', 'q', 'r', 's', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'z', 'z'};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            char[] text = arr[i].toCharArray();
            for (int j = 0; j < text.length; j++) {
                for (int k = 0; k < arrToReplace.length; k++) {
                    if (text[j] == arrToReplace[k]) {
                        if (j == 0) {
                            text[j] = Character.toUpperCase(arrReplaced[k]);
                            sb.append(text[j]);
                            break;
                        } else {
                            text[j] = arrReplaced[k];
                            sb.append(text[j]);
                            break;
                        }
                    }
                }
            }
            arr[i] = sb.toString();
            sb.setLength(0);
        }
        for (String output : arr) {
            sb.append(output);//.append(" ");    //w tym miejscu zadania 3 w string builderze będzie połączony w jeden
                                                // ciag napis,
                                                //jeśli doda się do wpisu obok append dodający spację to będzie
                                                // to zadanie nr 2 tyle że z dodatkową obsługą wycinania polskich znaków
        }
        input = sb.toString();
        System.out.println(input);
    }
}



