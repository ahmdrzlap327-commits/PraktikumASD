package Jobsheet3;

public class dataDosen {
    public void dataSemuaDosen(dosen02[] arrayOfDosen) {
        System.out.println("\n======= DATA SEMUA DOSEN =======");
        for (dosen02 d : arrayOfDosen) {
            String jk = d.jenisKelamin ? "Pria" : "Wanita";
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + jk);
            System.out.println("Usia          : " + d.usia);
            System.out.println("--------------------------------");
        }
    }

    public void jumlahDosenPerJenisKelamin(dosen02[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (dosen02 d : arrayOfDosen) {
            if (d.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public void rerataUsiaDosenPerJenisKelamin(dosen02[] arrayOfDosen) {
        int sumPria = 0, sumWanita = 0, totalPria = 0, totalWanita = 0;
        for (dosen02 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                sumPria += d.usia;
                totalPria++;
            } else {
                sumWanita += d.usia;
                totalWanita++;
            }
        }
        System.out.println("Rata-rata Usia Pria   : " + (totalPria > 0 ? (double)sumPria/totalPria : 0));
        System.out.println("Rata-rata Usia Wanita : " + (totalWanita > 0 ? (double)sumWanita/totalWanita : 0));
    }

    public void infoDosenPalingTua(dosen02[] arrayOfDosen) {
        dosen02 tertua = arrayOfDosen[0];
        for (dosen02 d : arrayOfDosen) {
            if (d.usia > tertua.usia) tertua = d;
        }
        System.out.println("Dosen Paling Tua: " + tertua.nama + " (Usia: " + tertua.usia + ")");
    }

    public void infoDosenPalingMuda(dosen02[] arrayOfDosen) {
        dosen02 termuda = arrayOfDosen[0];
        for (dosen02 d : arrayOfDosen) {
            if (d.usia < termuda.usia) termuda = d;
        }
        System.out.println("Dosen Paling Muda: " + termuda.nama + " (Usia: " + termuda.usia + ")");
    }
}
