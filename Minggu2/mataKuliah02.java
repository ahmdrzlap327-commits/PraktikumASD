package Minggu2;

public class mataKuliah02 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    public mataKuliah02() {}

    public mataKuliah02(String kode, String nm, int sks, int jam) {
        this.kodeMk = kode;
        this.nama = nm;
        this.sks = sks;
        this.jumlahJam = jam;
    }

    void tampilkanInformasi (){
        System.out.println("kode Mata Kuliah: " + kodeMk);
        System.out.println("Nama: " + nama);
        System.out.println("sks: " + sks);
        System.out.println("jumlah jam: " + jumlahJam);
    }

    void ubahSks (int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam (int jumlahPenambahan){
        jumlahJam += jumlahPenambahan;
    }

    void kurangiJam (int jumlahPengurangan) {
       if (this.jumlahJam >= jumlahPengurangan ) { 
            this.jumlahJam -= jumlahPengurangan;
            System.out.println("Jumlah jam berhasil dikurangi. Sisa jam: " + jumlahJam); 
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jam tidak mencukupi!"); 
        }
    }
}
