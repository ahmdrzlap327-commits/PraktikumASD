package Jobsheet9;

public class mahasiswa02 {
    String nama, nim, kelas;
    int nilai;;

    mahasiswa02(String nama, String nim, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
