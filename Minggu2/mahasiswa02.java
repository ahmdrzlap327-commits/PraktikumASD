package Minggu2;

public class mahasiswa02 {
    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi (){
        System.out.println("Nama: " + nama);
        System.out.println("Nim: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas (String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk (double ipkBaru) {
        ipk = ipkBaru;
    }

    String nilaiKinerja () {
        if (ipk > 0 || ipk < 4) {
            return "IPK tidak valid. Harus antara 0.0 dan 4.0";
        } else {
            if (ipk >= 3.5) {
                return "Kinerja Sangat Baik";
            } else if (ipk >= 3.0) {
                return "Kinerja Baik";
            } else if (ipk >= 2.5) {
                return "Kinerja Cukup";
            } else {
                return "Kinerja Kurang";
            }
        }
        
    }
    
}
