package Jobsheet6;

import java.util.Scanner;

public class mahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mahasiswaBerprestasi list = new mahasiswaBerprestasi(); 
        int jumMhs = 5; 

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("--------------------");
            list.tambah(new mahasiswa(nim, nama, kelas, ipk));
        }

        System.out.println("Seluruh Data Mahasiswa:");
        list.tampil();
        System.out.println("----------------------------------");
        System.out.println("Pencarian Data ");
        System.out.println("----------------------------------");
        System.out.println("Masukkan IPK yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("----------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("----------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss); 
        list.tampilDataSearch(cari, pss);  
    }
}
