package Jobsheet5;

public class mahasiswa02 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    mahasiswa02(){

    }

    mahasiswa02(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        kelas =  kls;
        ipk = ip;
    }

    void tampilInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("Ipk: " + ipk);
    }
}
