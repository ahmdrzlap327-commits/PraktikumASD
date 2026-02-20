package Minggu2;

public class mahasiswaMain02 {
    public static void main(String[] args) {
        mahasiswa02 mhs1 = new mahasiswa02();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();
    }
   
}
