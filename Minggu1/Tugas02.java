package Minggu1;
import java.util.Scanner;
public class Tugas02 {
    static Scanner sc = new Scanner(System.in);
    static int jumlahInputan = 0;
    static String[][] jadwal = new String[100][4];
    public static void main(String[] args) {

        System.out.println("=========================");
        System.out.println("Selamat datang di Siakad");
        System.out.println("=========================");

        boolean a = true;
        do {
            System.out.println("\n=== MENU PENGELOLA JADWAL ===");
            System.out.println("1. Input Data Jadwal");
            System.out.println("2. Tampilkan Seluruh Jadwal");
            System.out.println("3. Cari Jadwal Berdasarkan Hari");
            System.out.println("4. Cari Jadwal Berdasarkan Mata Kuliah");
            System.out.println("5. Keluar (Exit)");
            System.out.print("Pilih menu (1-5): ");

            System.out.print("Silahkan pilih menu yang akan anda pilih: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
            case 1:
                inputData(jadwal);
                break;
            case 2:    
                tampilkanSeluruhJadwal(jadwal);
                break;
            case 3:
                System.out.print("Masukkan Hari yang ingin dicari: ");
                String hariCari = sc.nextLine();
                cariBerdasarkanHari(jadwal, hariCari);
                break;
            case 4:
                System.out.print("Masukkan Nama Mata Kuliah yang ingin dicari: ");
                String mkCari = sc.nextLine();
                cariBerdasarkanMK(jadwal, mkCari);
                break;
            case 5:
                System.out.println("Terima kasih telah menggunakan program kami. Selamat tinggal!");
                a = false;
                break;
            default:
                System.out.println("Maaf input anda salah, silahkan pilih menu 1-5");
                break;
            }
        } while (a);   
    } 

    public static void inputData(String[][] data) {
        if (jumlahInputan < data.length) {
            System.out.println("Input Jadwal ke-" + (jumlahInputan + 1));
            System.out.print("Nama Mata Kuliah: ");
            data[jumlahInputan][0] = sc.nextLine();
            System.out.print("Ruang: ");
            data[jumlahInputan][1] = sc.nextLine(); 
            System.out.print("Hari: ");
            data[jumlahInputan][2] = sc.nextLine();
            System.out.print("Jam Kuliah (Contoh: 08.00-10.00): ");
            data[jumlahInputan][3] = sc.nextLine(); 
            
            jumlahInputan++;
            System.out.println("Data anda berhasil disimpan!");
        } else {
            System.out.println("Kapasitas jadwal penuh!");
        }
    }
    
    public static void tampilkanSeluruhJadwal(String [][] data) {
        if (jumlahInputan == 0) {
            System.out.println("Belum ada jadwal yang tersedia");
            return;
        }

        System.out.println("\n-------------------------------------------------------------------------");
        System.out.printf("%-20s | %-15s | %-10s | %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("-------------------------------------------------------------------------");

        for (int i = 0; i < jumlahInputan; i++) {
            System.out.printf("%-20s | %-15s | %-10s | %-15s\n", data[i][0], data[i][1], data[i][2], data[i][3]);
        }
    }

    public static void cariBerdasarkanHari (String [][] data, String hari){
        System.out.println("Hasil pencarian jadwal untuk hari: " + hari);
        boolean ketemu = false;
        for (int i = 0; i < jumlahInputan; i++) {
            if (data[i][2].equalsIgnoreCase(hari)) {
                System.out.printf("- %s | %s | %s\n", data[i][0], data[i][1], data[i][3]);
                ketemu = true;
            }
        }
        if (!ketemu) System.out.println("Tidak ada jadwal pada hari tersebut.");
    }

    public static void cariBerdasarkanMK (String [][] data, String mk){
        System.out.println("\\nHasil pencarian untuk mata kuliah: " + mk);
        boolean ketemu = false;

        for (int i = 0; i < jumlahInputan; i++) {
            if (data[i][0].equalsIgnoreCase(mk)) {
                System.out.printf("Ditemukan: %s | Ruang: %s | Hari: %s | Jam: %s\n", 
                                  data[i][0], data[i][1], data[i][2], data[i][3]);
                ketemu = true;
            }
        }
        
        if (!ketemu) System.out.println("Mata kuliah tersebut tidak ditemukan.");
    }
}
