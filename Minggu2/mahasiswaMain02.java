package Minggu2;

public class mahasiswaMain02 {
    public static void main(String[] args) {
        mahasiswa02 mhs1 = new mahasiswa02();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        mahasiswa02 mhs2 = new mahasiswa02("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30); 
        mhs2.tampilkanInformasi(); 

        mahasiswa02 mhsPasha = new mahasiswa02("Ahmad Rizal Ali Pasha", "254107020146", 3.85, "TI-1C");
        mhsPasha.tampilkanInformasi();
    }
   
}
