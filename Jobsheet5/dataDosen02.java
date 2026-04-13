package Jobsheet5;

public class dataDosen02 {
    dosen02[] dataDosen = new dosen02[10]; // Kapasitas 10 dosen 
    int idx;

    void tambah(dosen02 dsn) { 
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data Dosen sudah penuh!");
        }
    }

    void tampil() { 
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    dosen02 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = tmp;
                }
            }
        }
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            dosen02 tmp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }

    
}
