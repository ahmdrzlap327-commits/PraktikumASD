package Minggu2;

public class dosenMain02 {
    public static void main(String[] args) {
        dosen02 dsn1 = new dosen02();
        dsn1.idDosen = "D001";
        dsn1.nama = "Ahmad Rizal Ali Pasha";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2021;
        dsn1.bidangKeahlian = "Java Back-End";

        dosen02 dsn2 = new dosen02("D002", "Rayana Jaka", false, 2015, "Data Science");
        
        dsn1.tampilInformasi();
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2026) + " tahun");
        System.out.println();

        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Machine Learning");
        dsn2.tampilInformasi();
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2026) + " tahun");
    }
}
