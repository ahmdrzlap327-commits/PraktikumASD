package Jobsheet12;
import java.util.Scanner;

public class doubleLinkedListMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        doubleLinkedList02 list = new doubleLinkedList02();
        int pilihan;

        do {
            System.out.println("\n========== MENU DOUBLE LINKED LIST ==========");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (seteleah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    mahasiswa02 mhsAwal = inputMahasiswa(scan);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    mahasiswa02 mhsAkhir = inputMahasiswa(scan);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukan NIM yang dicari : ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukan data baru: ");
                    mahasiswa02 dataBaru = inputMahasiswa(scan);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4: 
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program Selesai");
                default:
                    System.out.println("Menu tidak valid");
                    break;
            }
        } while (pilihan != 0);
        scan.close();
    }

    public static mahasiswa02 inputMahasiswa(Scanner scan) {
        System.out.print("Masukan NIM   : ");
        String nim = scan.nextLine();
        System.out.print("Masukan nama  : ");
        String nama = scan.nextLine();
        System.out.print("Masukan kelas : ");
        String kelas = scan.nextLine();
        System.out.print("Masukan IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        return new mahasiswa02(nim, nama, kelas, ipk);
    }
}
