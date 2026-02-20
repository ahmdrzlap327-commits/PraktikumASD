package Minggu2;

public class dosen02 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public dosen02() {
    }

    public dosen02(String id, String nm, boolean status, int thn, String bidang) {
        this.idDosen = id;
        this.nama = nm;
        this.statusAktif = status;
        this.tahunBergabung = thn;
        this.bidangKeahlian = bidang;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        this.statusAktif = status;
        System.out.println("Status dosen telah diperbarui."); 
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - tahunBergabung; 
    }

    void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
    }
}
