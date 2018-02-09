package ZbiorZadan;

import java.util.Scanner;

public class zad4SpacjeCamelCaseOdwrotnosc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        char [] input = sc.nextLine().toCharArray();
        int [] inputX = new int[input.length];


        for (int i = 0; i < input.length; i++) {    //sprawdzenie czy wystepują duże litery
            if (Character.isUpperCase(input[i]))    //od których maja się zaczynać wyrazy
                inputX[i]++;
        }
        int sum = 0;                                //zsumowanie ilości wystąpień dużych liter
        for (int i :inputX) {
            sum += i;
        }
        String [] inp = new String[sum];            //pomocnicza tablica na wydzielone słowa - długość tablicy zależna
        int counter = -1;                           //od ilości duzych liter
        for (int i = 0; i < input.length; i++) {
            if (Character.isUpperCase(input[i])){               //zastosowany algorytm zapisuje wyraz do pomocniczej
                try {                                           //tablicy stringów wtedy gdy pojawia się duża litera
                    inp[counter] = sb.toString();               //w stringu podanym przez użytkownika
                }catch(ArrayIndexOutOfBoundsException ex){ }    //try catch wyłapuje moment przy pierwszej dużej literze
                sb.setLength(0);                                //bo nie ma potrzeby tworzyć pustego stringa i go zapisywać
                sb.append(Character.toLowerCase(input[i]));
                counter++;
            }else{
                sb.append(input[i]);
            }
        }
        inp[counter] = sb.toString();           //w tym miejscu algorytm zapisuje ostatni utworzony wyraz
        sb.setLength(0);                        //do ostatniej pustej komórki pomocniczej tablicy

        String arr = "";                                            //ten algorytm rozbija na pojedyncze litery
        for (int i = 0; i < inp[0].length(); i++) {                 //pierwszy utworzony wyraz i zmienia jego pierwsza
            if (i == 0) {                                           //literę na dużą
                arr = inp[0].substring(i, i + 1).toUpperCase();     //string builder na nowo składa pierwszy wyraz...
                sb.append(arr);
            }else {
                arr = inp[0].substring(i, i + 1);
                sb.append(arr);
            }
        }
        inp[0]=sb.toString();                                       //... i zapisuje spowrotem do właściwej tablicy
        for (String s :inp) {
            System.out.printf("%s ", s);
        }

    }
}

