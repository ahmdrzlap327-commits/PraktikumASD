package Jobsheet11;

public class mahasiswa02 {
    String nim, nama, kelas;
    double ipk;

    mahasiswa02(){

    }

    mahasiswa02(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi(){
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}
