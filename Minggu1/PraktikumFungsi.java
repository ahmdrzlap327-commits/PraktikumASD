package Minggu1;
import java.util.Scanner;
public class PraktikumFungsi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("PENDAPATAN DAN STATUS CABANG ROYAL GARDEN");
        System.out.println("=========================================");
        tampilkanPendapatanDanStatus();

    }

    static int[][] stock = { //Fungsi untuk menyimpan stok bunga di setiap tokonya
        {10, 5, 15, 7},  // RoyalGarden 1
        {6, 11, 9, 12},  // RoyalGarden 2
        {2, 10, 10, 5},  // RoyalGarden 3
        {5, 7, 12, 9}    // RoyalGarden 4
    };


    static int[] harga = {75000, 50000, 60000, 10000}; // untuk menyimpan harga bunga sesuai dengan urutan bunga (Aglonema, Keladi, Alocasia, Mawar)

    public static void tampilkanPendapatanDanStatus() {
        for (int i = 0; i < stock.length; i++) {
            int pendapatan = 0;
            
            // Menghitung pendapatan per baris (cabang)
            for (int j = 0; j < stock[i].length; j++) {
                pendapatan += stock[i][j] * harga[j];
            }

            // Menentukan status baik/kurangnya berdasarkan pendapatan seyiap cabang
            String status = (pendapatan > 1500000) ? "Sangat Baik" : "Perlu Evaluasi";

            System.out.printf("RoyalGarden %d | Pendapatan: Rp %,d | Status: %s\n", (i + 1), pendapatan, status);
        }
    }
}
