package Jobsheet4;

import java.util.Scanner;

public class mainSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah elemen: ");
        int elemen = input.nextInt();

        sum sm = new sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukan keuntungan ke-" + (i+1) + ": ");
            sm.keuntungan[i] = input.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan BruteForce: " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide anda Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}
