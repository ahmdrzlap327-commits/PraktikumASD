package Jobsheet3;
import java.util.Scanner;
public class mataKuliahDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah matakuliah: ");
        int jml = sc.nextInt();
        sc.nextLine(); 
        mataKuliah02[] arrayOfMatakuliah = new mataKuliah02[jml];
        

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            arrayOfMatakuliah[i] = new mataKuliah02("", "", 0, 0);
            arrayOfMatakuliah[i].tambahData(sc);
        }

        System.out.println("\n======= HASIL INPUT (CETAK INFO) =======");
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo(); 
        }
    }
}
