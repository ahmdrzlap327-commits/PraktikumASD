package Jobsheet10.tugas;
import java.util.Scanner;
public class mainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        antrianKRS antrian = new antrianKRS(10); 
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian KRS Mahasiswa ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Antrian KRS (2 Mahasiswa)");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat 2 Antrian Terdepan");
            System.out.println("5. Lihat Antrian Paling Akhir");
            System.out.println("6. Cetak Jumlah & Statistik KRS");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // Clear buffer biar input String tidak terlewati

            switch (pilihan) {
                case 1:
                    System.out.print("NIM  : "); String nim = sc.nextLine();
                    System.out.print("Nama : "); String nama = sc.nextLine();
                    System.out.print("Prodi: "); String prodi = sc.nextLine();
                    System.out.print("Kelas: "); String kelas = sc.nextLine();
                    mahasiswa mhs = new mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.panggilAntrianKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antrian.tampilkanPalingAkhir();
                    break;
                case 6:
                    antrian.cetakStatistik();
                    break;
                case 7:
                    antrian.mengosongkanAntrian();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        
        sc.close();
    }
}
