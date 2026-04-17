package Jobsheet4;

import   java.util.Scanner;

public class mainFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai : ");
        int nilai =input.nextInt();

        Faktorial fk = new Faktorial();
        System.out.println("Nilai Faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
    }
}
