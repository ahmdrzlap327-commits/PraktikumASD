package Jobsheet11;
import java.util.Scanner;

public class mainTugas {
    public static void menu() {
        System.out.println("\n=== Menu Antrian Layanan Akademik ===");
        System.out.println("1. Tambah Mahasiswa ke Antrian (Enqueue)");
        System.out.println("2. Layani Mahasiswa (Dequeue)");
        System.out.println("3. Lihat Mahasiswa Terdepan & Paling Belakang");
        System.out.println("4. Jumlah Mahasiswa dalam Antrian");
        System.out.println("5. Lihat Semua Antrian");
        System.out.println("6. Kosongkan Antrian (Clear)");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas maksimum antrian: ");
        int kapasitas = sc.nextInt();
        
        QueueLinkedList antrian = new QueueLinkedList(kapasitas);
        int pilihan;

        do {
            menu();
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : "); String nim = sc.nextLine();
                    System.out.print("Nama  : "); String nama = sc.nextLine();
                    System.out.print("Prodi : "); String prodi = sc.nextLine();
                    System.out.print("IPK   : "); double ipk = sc.nextDouble();
                    sc.nextLine();
                    
                    mahasiswaTugas02 mhs = new mahasiswaTugas02(nim, nama, prodi, ipk);
                    antrian.Enqueue(mhs);
                    break;
                case 2:
                    antrian.Dequeue();
                    break;
                case 3:
                    antrian.tampilDepanDanAkhir();
                    break;
                case 4:
                    antrian.tampilkanJumlahAntrean();
                    break;
                case 5:
                    antrian.printAntrian();
                    break;
                case 6:
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