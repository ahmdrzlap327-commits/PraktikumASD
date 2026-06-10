package cm2;

public class sistemResto {
    nodePembeli headPembeli;
    nodePembeli tailPembeli;
    nodePesanan headPesanan;
    nodePesanan tailPesanan;
    int noAntrian; 

    public sistemResto() {
        headPembeli = null;
        tailPembeli = null;
        headPesanan = null;
        tailPesanan = null;
        noAntrian = 1;
    }

    public boolean isEmpty() {
        return headPembeli == null;
    }

    // Fitur 1: Tambah Antrian  (add last)
    public void tambahAntrian(pembeli p) {
        p.noAntrian = noAntrian;
        nodePembeli newNode = new nodePembeli(p);
        if (isEmpty()) {
            headPembeli = tailPembeli = newNode;
        } else {
            tailPembeli.next = newNode;
            newNode.prev = tailPembeli;
            tailPembeli = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + noAntrian);
        noAntrian++;
    }

    // Fitur 2: Cetak Antrian aktif saat ini
    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("=========================================");
        System.out.println("\tDaftar Antrian Pembeli");
        System.out.println("=========================================");
        System.out.printf("%-15s %-15s %-15s\n", "No Antrian", "Nama", "No HP");
        nodePembeli current = headPembeli;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    // Fitur 3: Hapus Antrian terdepan & Input Pesanan (removeFirst + Tambah Pesanan)
    public void hapusAntrianDanPesan(int kode, String namaMenu, int hargaMenu) {
        if (isEmpty()) {
            System.out.println("Tidak ada antrian untuk dilayani.");
            return;
        }

        // 1. Ambil data pembeli terdepan yang sedang dilayani
        nodePembeli pmblKeluar = headPembeli;
        String namaPelanggan = pmblKeluar.data.namaPembeli;

        // 2. Simpan data pesanan baru ke struktur Double Linked List Pesanan
        pesanan pesananBaru = new pesanan(kode, namaMenu, hargaMenu);
        nodePesanan newNodePesanan = new nodePesanan(pesananBaru);
        
        if (headPesanan == null) {
            headPesanan = tailPesanan = newNodePesanan;
        } else {
            tailPesanan.next = newNodePesanan;
            newNodePesanan.prev = tailPesanan;
            tailPesanan = newNodePesanan;
        }

        System.out.println(namaPelanggan + " telah memesan " + namaMenu);

        // 3. Keluarkan pembeli tersebut dari antrian (removeFirst)
        if (headPembeli == tailPembeli) {
            headPembeli = tailPembeli = null;
        } else {
            headPembeli = headPembeli.next;
            headPembeli.prev = null;
        }
    }

    // Fitur 4: Laporan Pesanan Terurut Abjad Manual (Mekanisme Bubble Sort pada DLL)
    public void laporanPesanan() {
        if (headPesanan == null) {
            System.out.println("Belum ada laporan pesanan masuk.");
            return;
        }

        // Lakukan sorting manual sebelum dicetak menggunakan algoritma Bubble Sort
        boolean tukar;
        nodePesanan depan;
        nodePesanan akhir = null;

        do {
            tukar = false;
            depan = headPesanan;

            while (depan.next != akhir) {
                if (depan.data.namaPesanan.compareToIgnoreCase(depan.next.data.namaPesanan) > 0) {
                    // Tukar data internal objek pesanan jika tidak urut alfabet
                    pesanan temp = depan.data;
                    depan.data = depan.next.data;
                    depan.next.data = temp;
                    tukar = true;
                }
                depan = depan.next;
            }
            akhir = depan;
        } while (tukar);

        // Cetak laporan pesanan yang sudah rapi dan tersorting
        System.out.println("=========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("=========================================");
        System.out.printf("%-15s %-20s %-15s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        
        nodePesanan current = headPesanan;
        int totalPendapatan = 0;
        while (current != null) {
            System.out.printf("%-15d %-20s %-15d\n", current.data.kodePesanan, current.data.namaPesanan, current.data.harga);
            totalPendapatan += current.data.harga;
            current = current.next;
        }
        System.out.println("=========================================");
        System.out.println("Total Pendapatan Restoran: Rp " + totalPendapatan);
    }
}
