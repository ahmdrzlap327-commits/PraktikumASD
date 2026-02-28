package Jobsheet3;

import java.util.Scanner;

public class mataKuliah02 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public mataKuliah02(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(Scanner sc) {
        System.out.print("Kode       : ");
        this.kode = sc.nextLine();
        System.out.print("Nama       : ");
        this.nama = sc.nextLine();
        System.out.print("Sks        : ");
        this.sks = sc.nextInt(); 
        sc.nextLine();
        System.out.print("Jumlah Jam : ");
        this.sks = sc.nextInt(); 
        sc.nextLine();
        System.out.println("--------------------------------");
    }

}
