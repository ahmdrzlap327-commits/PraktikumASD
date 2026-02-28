package Jobsheet3;
import java.util.Scanner;
public class mataKuliahDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mataKuliah02[] arrayOfMatakuliah = new mataKuliah02[2]; // Membuat array kapasitas 3
        // String kode, nama, dummy;
        // int sks, jumlahJam;

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            arrayOfMatakuliah[i] = new mataKuliah02("", "", 0, 0);
            arrayOfMatakuliah[i].tambahData(sc);
        }

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMatakuliah[i].nama);
            System.out.println("Sks        : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("--------------------------------");
        }
    }
}
