package Jobsheet6;

public class mahasiswa {
    String nim;
    String nama;
    String kelas;
    double ipk;

    mahasiswa(String ni, String nm, String kls, double ip) {
        nim = ni;
        nama = nm;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("NIM\t: " + nim);
        System.out.println("Nama\t: " + nama);
        System.out.println("Kelas\t: " + kelas);
        System.out.println("IPK\t: " + ipk);
    }
}
