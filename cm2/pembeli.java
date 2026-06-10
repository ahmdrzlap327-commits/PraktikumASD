package cm2;

public class pembeli {
    String namaPembeli;
    String noHp;
    int noAntrian;

    public pembeli(int noAntrian, String namaPembeli, String noHp) {
        this.noAntrian = noAntrian;
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }

    public pembeli(String namaPembeli, String noHp) {
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }

    public void tampil() {
        System.out.printf("%-15d %-15s %-15s\n", noAntrian, namaPembeli, noHp);
    }
}
