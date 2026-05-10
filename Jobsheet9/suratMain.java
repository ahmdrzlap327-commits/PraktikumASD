package Jobsheet9;
import java.util.Scanner;
public class suratMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stackSurat stack = new stackSurat(10);
        int pilih;

        do {
            System.out.println("\n--- Menu Admin Prodi ---");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin (Validasi)");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: "); String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: "); String nama = sc.nextLine();
                    System.out.print("Kelas: "); String kls = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): "); char jns = sc.next().charAt(0);
                    System.out.print("Durasi (hari): "); int dur = sc.nextInt();
                    stack.push(new surat(id, nama, kls, jns, dur));
                    break;
                case 2:
                    surat diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat " + diproses.idSurat + " milik " + diproses.namaMahasiswa);
                    }
                    break;
                case 3:
                    surat terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat teratas: " + terakhir.idSurat + " [" + terakhir.namaMahasiswa + "]");
                    } else {
                        System.out.println("Belum ada surat masuk.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cariNama = sc.nextLine();
                    stack.cariSurat(cariNama);
                    break;
            }
        } while (pilih != 5);
    }
}
