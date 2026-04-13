package Jobsheet5;

import java.util.Scanner;

public class mainDosen02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dataDosen02 data = new dataDosen02();
        int pilih;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Seluruh Data");
            System.out.println("3. Sorting ASC (Usia - Bubble Sort)");
            System.out.println("4. Sorting DSC (Usia - Selection Sort)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilih = sc.nextInt();
            sc.nextLine(); // buffer

            switch (pilih) {
                case 1:
                    System.out.print("Kode: "); String kd = sc.nextLine();
                    System.out.print("Nama: "); String nm = sc.nextLine();
                    System.out.print("Jenis Kelamin (Pria = true, Wanita = false): "); boolean jk = sc.nextBoolean();
                    System.out.print("Usia: "); int us = sc.nextInt();
                    data.tambah(new dosen02(kd, nm, jk, us));
                    break;
                case 2:
                    System.out.println("\n--- Daftar Dosen ---");
                    data.tampil();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("Data berhasil diurutkan (ASC)!");
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Data berhasil diurutkan (DSC)!");
                    break;
            }
        } while (pilih != 5);
    }
}
