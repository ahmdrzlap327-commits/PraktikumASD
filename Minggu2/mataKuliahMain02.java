package Minggu2;

public class mataKuliahMain02 {
    public static void main(String[] args) {
        mataKuliah02 mk1 = new mataKuliah02();
        mk1.kodeMk = "ASD";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 2;
        mk1.jumlahJam = 4;

        mataKuliah02 mk2 = new mataKuliah02("BD", "Basis Data", 3, 6);

        mk1.tampilkanInformasi();
        mk1.ubahSks(3);
        mk1.tambahJam(2);
        mk1.tampilkanInformasi();
        System.out.println();

        mk2.tampilkanInformasi();
        mk2.ubahSks(3);
        mk2.kurangiJam(2);
        mk2.tampilkanInformasi();  
        System.out.println();
    }
}
