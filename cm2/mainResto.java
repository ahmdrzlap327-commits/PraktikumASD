package cm2;

import java.util.Scanner;

public class mainResto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sistemResto royalDelish = new sistemResto();
        int pilihan;

        do {
            System.out.println("\n=========================================");
            System.out.println("       SISTEM ANTRIAN ROYAL DELISH       ");
            System.out.println("=========================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();
                    royalDelish.tambahAntrian(new pembeli(nama, hp));
                    break;
                case 2:
                    royalDelish.cetakAntrian();
                    break;
                case 3:
                    System.out.print("Kode Pesanan : ");
                    int kode = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Nama Pesanan : ");
                    String menuMakanan = sc.nextLine();
                    System.out.print("Harga        : ");
                    int harga = sc.nextInt();
                    
                    royalDelish.hapusAntrianDanPesan(kode, menuMakanan, harga);
                    break;
                case 4:
                    royalDelish.laporanPesanan();
                    break;
                case 0:
                    System.out.println("Program selesai. Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
