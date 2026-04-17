package Jobsheet4;

public class mainMahasiswa {
    public static void main(String[] args) {
        mahasiswa[] daftar = {
            new mahasiswa("Ahmad", 220101001, 2022, 78, 82),
            new mahasiswa("Budi", 220101002, 2022, 85, 88),
            new mahasiswa("Cindy", 220101003, 2021, 90, 87),
            new mahasiswa("Dian", 220101004, 2021, 76, 79),
            new mahasiswa("Eko", 220101005, 2023, 92, 95),
            new mahasiswa("Fajar", 220101006, 2020, 88, 85),
            new mahasiswa("Gina", 220101007, 2023, 80, 83),
            new mahasiswa("Hadi", 220101008, 2020, 82, 84)
        };

        mahasiswa helper = daftar[0];
        System.out.println("=== HASIL LATIHAN PRAKTIKUM ===");
        System.out.println("UTS Tertinggi (DC): " + helper.cariMaxUTS(daftar, 0, daftar.length - 1));
        System.out.println("UTS Terendah  (DC): " + helper.cariMinUTS(daftar, 0, daftar.length - 1));
        System.out.println("Rata-rata UAS (BF): " + helper.rataUAS(daftar));

    }
}
