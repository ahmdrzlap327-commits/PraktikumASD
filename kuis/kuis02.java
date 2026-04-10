package kuis;

public class kuis02 {
    public String nama02;
    public double harga02;
    public int stok02;
    public double diskon02;

    public kuis02(){

    }

    public kuis02 (String nama, double harga, int stok, double diskon){
        this.nama02 = nama;
        this.harga02 = harga;
        this.stok02 = stok;
        this.diskon02 = diskon; 
    }

    void tampilkanInformasi(){
        System.out.println("nama: " + nama02);
        System.out.println("Harga: " + harga02);
        System.out.println("Stok: " + stok02);
        System.out.println("Diskon: " + diskon02 + "%");
    }

    double hitungHargaDiskon (){
        double hargaDiskon = harga02 - ((harga02 * diskon02)/100);
        return hargaDiskon;
    }
}
