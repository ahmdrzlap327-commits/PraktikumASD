package Jobsheet5;

public class dosen02 {
    String kode, nama;
    boolean jenisKelamin; // true: Pria, false: Wanita
    int usia;

    dosen02(String kd, String name, boolean jk, int age) { // [cite: 519, 520]
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() { // [cite: 521]
        String jk = (jenisKelamin) ? "Pria" : "Wanita";
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jk);
        System.out.println("Usia: " + usia);
        System.out.println("--------------------");
    }
}
