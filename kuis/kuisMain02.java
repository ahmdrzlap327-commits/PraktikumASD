package kuis;

public class kuisMain02 {
    public static void main(String[] args) {
        kuis02 [] arrayKuis02s = new kuis02[4];

        arrayKuis02s [0] = new kuis02("beras", 75000, 23, 5);
        arrayKuis02s [1] = new kuis02("Gula", 17500, 58, 5);
        arrayKuis02s [2] = new kuis02("Roti", 22000, 26, 2);
        arrayKuis02s [3] = new kuis02("Susu", 12000, 64, 3);

        for (int i = 0; i < arrayKuis02s.length; i++) {
            System.out.println("Data produk ke-" + (i + 1));
            arrayKuis02s[i].tampilkanInformasi(); 
            System.out.println("------------------------------------");
        }

        for (int i = 0; i < arrayKuis02s.length; i++) {
            System.out.println("total harga akhir produk ke-" + (i + 1) +" adalah: Rp." + arrayKuis02s[i].hitungHargaDiskon());
            System.out.println("------------------------------------");
        }
        
        
    }
}
