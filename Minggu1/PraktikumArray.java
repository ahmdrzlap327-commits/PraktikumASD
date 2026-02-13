package Minggu1;
import java.util.Scanner;
public class PraktikumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("Program menghitung IP Semester");
        System.out.println("===============================");

        String[] mataKuliah = {
            "Pancasila", 
            "Konsep Teknologi Informasi", 
            "Critical Thinking dan Problem Solving", 
            "Matematika Dasar", 
            "Bahasa Inggris", 
            "Dasar Pemrograman", 
            "Praktikum Dasar Pemrograman", 
            "Keselamatan dan Kesehatan Kerja"
        };

        //bobot sks per mata kuliah sesuai urutan array mataKuliah
        int[] sks = {2, 2, 2, 3, 2, 2, 3, 2};

        //Untuk menyimpan nilai angka, huruf dan bobot nilai per mata kuliah sesuai dengan urutan penyimpanan di array mata kuliah
        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mataKuliah[i] + ": "); 
            nilaiAngka[i] = sc.nextDouble();

            // Logika Konversi Nilai sesuai tabel niai
            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A"; bobotNilai[i] = 4.00;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+"; bobotNilai[i] = 3.50;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B"; bobotNilai[i] = 3.00;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+"; bobotNilai[i] = 2.50;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C"; bobotNilai[i] = 2.00;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D"; bobotNilai[i] = 1.00;
            } else {
                nilaiHuruf[i] = "E"; bobotNilai[i] = 0.00;
            }
        }

        System.out.println("==============================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("==============================");
        System.out.printf("%-40s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai"); //menggunakan stakeholder agar tampilan lebih rapi

        double totalBobotSKS = 0;
        int totalSKS = 0;

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n", 
                mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]); //untuk menampilkan output  nilai mata kuliah per baris dengan rapi
            
            // Formula IP Semester: Σ(Nilai Setara * SKS) / ΣSKS 
            totalBobotSKS += (bobotNilai[i] * sks[i]);
            totalSKS += sks[i];
        }

        double ipSemester = totalBobotSKS / totalSKS;//untuk menghitung nilai akhir IP
        System.out.println("==============================");
        System.out.printf("IP : %.2f\n", ipSemester); 
        System.out.println("==============================");

    }
}
