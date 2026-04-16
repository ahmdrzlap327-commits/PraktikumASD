package cm1;

import java.util.Scanner;

public class sistemPinjaman {
    public static void main(String[] args) {
        mahasiswa[] daftarMhs = {
            new mahasiswa("22001", "Andi", "Teknik Informatika"),
            new mahasiswa("22002", "Budi", "Teknik Informatika"),
            new mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

        buku[] daftarBuku = {
            new buku("B001", "Algoritma", 2020),
            new buku("B002", "Basis Data", 2019),
            new buku("B003", "Pemrograman", 2021),
            new buku("B004", "Fisika", 2024)
        };

        peminjaman[] daftarPinjam = {
            new peminjaman(daftarMhs[0], daftarBuku[0], 7),
            new peminjaman(daftarMhs[1], daftarBuku[1], 3),
            new peminjaman(daftarMhs[2], daftarBuku[2], 10),
            new peminjaman(daftarMhs[2], daftarBuku[3], 6),
            new peminjaman(daftarMhs[0], daftarBuku[1], 4)
        };

        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa\n2. Tampilkan Buku\n3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda\n5. Cari Berdasarkan NIM\n0. Keluar");
            System.out.print("Pilih: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    for (mahasiswa m : daftarMhs) m.tampilMahasiswa();
                    break;
                case 2:
                    for (buku b : daftarBuku) b.tampilBuku();
                    break;
                case 3:
                    for (peminjaman p : daftarPinjam) p.tampilPeminjaman();
                    break;
                case 4:
                    // Insertion Sort (Denda Terbesar ke Terkecil)
                    for (int i = 1; i < daftarPinjam.length; i++) {
                        peminjaman temp = daftarPinjam[i];
                        int j = i - 1;
                        while (j >= 0 && daftarPinjam[j].denda < temp.denda) {
                            daftarPinjam[j + 1] = daftarPinjam[j];
                            j--;
                        }
                        daftarPinjam[j + 1] = temp;
                    }
                    System.out.println("Setelah diurutkan (Denda terbesar):");
                    for (peminjaman p : daftarPinjam) p.tampilPeminjaman();
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cari = sc.next();
                    boolean found = false;
                    for (peminjaman p : daftarPinjam) {
                        if (p.mhs.nim.equals(cari)) {
                            p.tampilPeminjaman();
                            found = true;
                        }
                    }
                    if (!found) System.out.println("Data tidak ditemukan.");
                    break;
            }
        } while (menu != 0);
        sc.close();
    }
}
