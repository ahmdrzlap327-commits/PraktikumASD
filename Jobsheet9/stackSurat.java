package Jobsheet9;

public class stackSurat {
    surat[] tumpukan;
    int size;
    int top;

    public stackSurat (int size) {
        this.size = size;
        tumpukan = new surat[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(surat s) {
        if (!isFull()) {
            top++;
            tumpukan[top] = s;
        } else {
            System.out.println("Gagal! Tumpukan surat sudah penuh.");
        }
    }

    public surat pop() {
        if (!isEmpty()) {
            surat s = tumpukan[top];
            top--;
            return s;
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public surat peek() {
        if (!isEmpty()) {
            return tumpukan[top];
        }
        return null;
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (tumpukan[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat Ditemukan pada tumpukan ke-" + (top - i + 1));
                System.out.println("ID: " + tumpukan[i].idSurat + " | Jenis: " + tumpukan[i].jenisIzin);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
