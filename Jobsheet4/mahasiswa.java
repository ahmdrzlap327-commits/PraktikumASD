package Jobsheet4;

public class mahasiswa {
    String nama;
    int nim, tahunMasuk, nilaiUTS, nilaiUAS;

    mahasiswa(String nm, int nim, int thn, int uts, int uas){
        nama = nm;
        this.nim = nim;
        tahunMasuk = thn;
        nilaiUTS = uts;
        nilaiUAS = uas;
    }

    int cariMaxUTS(mahasiswa[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].nilaiUTS; 
        }
        int mid = (l + r) / 2; 
        int maxL = cariMaxUTS(mhs, l, mid); 
        int maxR = cariMaxUTS(mhs, mid + 1, r); 
        return (maxL > maxR) ? maxL : maxR; 
    }

    int cariMinUTS(mahasiswa[] mhs, int l, int r) {
        if (l == r) {
            return mhs[l].nilaiUTS;
        }
        int mid = (l + r) / 2;
        int minL = cariMinUTS(mhs, l, mid);
        int minR = cariMinUTS(mhs, mid + 1, r);
        return (minL < minR) ? minL : minR;
    }

    double rataUAS(mahasiswa[] mhs) {
        double total = 0;
        for (int i = 0; i < mhs.length; i++) {
            total += mhs[i].nilaiUAS; // Iteratif Brute Force [cite: 164, 165]
        }
        return total / mhs.length;
    }
}
