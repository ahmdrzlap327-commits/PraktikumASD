package cm2;

public class pesanan {
    int kodePesanan;
    String namaPesanan;
    int harga;

    public pesanan(int kodePesanan, String namaPesanan, int harga) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
    }

    public void tampil() {
        System.out.printf("%-15d %-15s Rp%,d\n", kodePesanan, namaPesanan, harga);
    }
}
