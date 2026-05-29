package Jobsheet10.tugas;

public class antrianKRS {
    mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;

    int totalSudahKRS = 0; 
    int totalKapasitasDPA = 30;

    public antrianKRS(int maxKapasitas) {
        this.max = maxKapasitas;
        this.data = new mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void mengosongkanAntrian() {
        front = rear = -1;  
        size = 0;
        System.out.println("Antrian berhasil dikosongkan!");
    }

    public void tambahAntrian(mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        
        if (totalSudahKRS + size >= totalKapasitasDPA) {
            System.out.println("Pendaftaran ditolak! Kuota bimbingan DPA sudah penuh.");
            return;
        }

        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public void panggilAntrianKRS() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        } 

        if (size < 2) {
            System.out.println("Antrian kurang dari 2 orang, tidak bisa memproses KRS.");
            return;
        }

        System.out.println("\n--- MEMPROSES KRS UNTUK 2 MAHASISWA TERDEPAN ---");
        for (int i = 0; i < 2; i++) {
            mahasiswa mhs = data[front];
            front = (front + 1) % max;
            size--;
            totalSudahKRS++; // Bertambah setiap ada yang sukses diproses
            System.out.print("Melayani mahasiswa: ");
            mhs.tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            if (data[index] != null) {
                data[index].tampilkanData();
            }
        }
    }

    public void tampilkanDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 orang.");
            return;
        }
        System.out.println("=== 2 ANTRIAN TERDEPAN ===");
        System.out.print("Antrian 1: ");
        data[front].tampilkanData();
        System.out.print("Antrian 2: ");
        data[(front + 1) % max].tampilkanData();
    }

    public void tampilkanPalingAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("=== ANTRIAN PALING AKHIR ===");
        data[rear].tampilkanData();
    }

    public void cetakStatistik() {
        int belumKRS = totalKapasitasDPA - totalSudahKRS;
        System.out.println("\n=== STATISTIK ANTRIAN KRS ===");
        System.out.println("Jumlah dalam antrian               : " + size);
        System.out.println("Jumlah yang sudah proses KRS       : " + totalSudahKRS);
        System.out.println("Jumlah mahasiswa belum proses KRS  : " + belumKRS);
    }
}
