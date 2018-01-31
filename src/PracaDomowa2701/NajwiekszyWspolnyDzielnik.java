package PracaDomowa2701;

import java.util.Scanner;

public class NajwiekszyWspolnyDzielnik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String [] inputX = input.split(" ");
        int [] inputXX = new int[inputX.length];
        for (int i = 0; i < inputX.length; i++) {
            inputXX[i] = Integer.parseInt(inputX[i]);
        }
//        System.out.println(NWD(inputXX[0], inputXX[1]));
    }
//    public static int NWD(int x, int y){
//        if (x == 0)
//            return y;
//        else
//            return NWD(y%x, y);
}

