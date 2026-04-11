package Jobsheet5;

public class mahasiswaDemo02 {
    public static void main(String[] args) {
        mahasiswaBerprestasi02 list = new mahasiswaBerprestasi02();
        mahasiswa02 m1 = new mahasiswa02 ("123","Zidan", "2A", 3.2);
        mahasiswa02 m2 = new mahasiswa02 ("124","Ayu", "2A", 3.5);
        mahasiswa02 m3 = new mahasiswa02 ("125","Sofi", "2A", 3.1);
        mahasiswa02 m4 = new mahasiswa02 ("126","Sita", "2A", 3.9);
        mahasiswa02 m5 = new mahasiswa02 ("127","Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();
    }
}
