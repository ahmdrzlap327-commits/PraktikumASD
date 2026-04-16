package cm1;

public class peminjaman {
    mahasiswa mhs;
    buku buku;
    int lamaPinjam, terlambat, denda;
    int batasPinjam = 5;

    peminjaman(mahasiswa mhs, buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * 2000;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampilPeminjaman() {
        System.out.printf("%-10s %-15s | Lama: %d | Terlambat: %d | Denda: %d\n", 
            mhs.nama, buku.judul, lamaPinjam, terlambat, denda);
    }
}
