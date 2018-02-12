package ZbiorZadan;

import java.util.Random;
import java.util.Scanner;

public class zad6BajtockieSwietoTrojkata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numberOfTests = Integer.parseInt(sc.nextLine());
        int count1 = 0;
        double [] testResult = new double[numberOfTests];
        do{
            String [] input = sc.nextLine().split(" ");
            int players = Integer.parseInt(input[0]);
            int chalkPerSquareMeter = Integer.parseInt(input[1]);
            double [][] triangles = new double[players][3];
            int count2 = 0;
            do{
                for (int i = 0; i < 3; i++) {
                    triangles[count2][i] = (rand.nextInt(201)+10)/100.0;
                }
                count2++;
            }while (players!=count2);
            double [] fields = new double[players];
            int count3 = 0;
            double var1, var2, var3, var4;
            int zaokr = (int)Math.pow(10, 2);
            do{
                for (int i = 0; i < players; i++) {
                    if (triangles[i][0]+triangles[i][1]>triangles[i][2]&&
                            triangles[i][0]+triangles[i][2]>triangles[i][1]&&
                            triangles[i][1]+triangles[i][2]>triangles[i][0]) {
                        var1 = triangles[i][0] + triangles[i][1] + triangles[i][2];
                        var2 = triangles[i][0] + triangles[i][1] - triangles[i][2];
                        var3 = triangles[i][0] - triangles[i][1] + triangles[i][2];
                        var4 = -(triangles[i][0]) + triangles[i][1] + triangles[i][2];
                        fields[i] = Math.sqrt(var1 * var2 * var3* var4) / 4.0;
                        fields[i] *= zaokr;
                        fields[i] = Math.round(fields[i]);
                        fields[i] /= zaokr;
                    }else{
                        fields[i] = 0;
                    }
                }
            count3++;
            }while (players!=count3);
            double[] chalkPerTriangle = new double[players];
            double sum = 0;
            for (int i = 0; i < players; i++) {
                chalkPerTriangle[i] = fields[i] * chalkPerSquareMeter;
                sum += chalkPerTriangle[i];
            }
            sum *= zaokr;
            sum = Math.round(sum);
            sum /= zaokr;
            testResult[count1] = sum;
            count1++;
        }while (numberOfTests!=count1);
        int count5 = 0;
        do{
            System.out.println("W teście " + (count5+1) + " zużyto " + testResult[count5] + " kg kredy.");
            count5++;
        }while (numberOfTests!=count5);
    }
}
