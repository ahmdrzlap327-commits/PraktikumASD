package Jobsheet11;
import java.util.Scanner;
public class SLLmain02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        singleLinkedList02 sll = new singleLinkedList02();

        System.out.println("=== INPUT DATA MAHASISWA (LINKED LIST) ===");
        System.out.print("Masukkan Jumlah Mahasiswa yang ingin diinput: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : "); 
            String nim = sc.nextLine();
            System.out.print("Nama  : "); 
            String nama = sc.nextLine();
            System.out.print("Kelas : "); 
            String kelas = sc.nextLine();
            System.out.print("IPK   : "); 
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            // Buat objek mahasiswa berdasarkan input keyboard
            mahasiswa02 mhsBaru = new mahasiswa02(nim, nama, kelas, ipk);

            // Contoh otomatis ditambahkan ke urutan paling belakang (addLast)
            sll.addLast(mhsBaru);
        }

        System.out.println("\n=================================");
        sll.print();

        mahasiswa02 mhs1= new mahasiswa02("24212200", "Alvaro", "1A", 4.0);
        mahasiswa02 mhs2 = new mahasiswa02("23212201", "Bimon", "2B", 3.8);
        mahasiswa02 mhs3 = new mahasiswa02("22212202", "Cintia", "3C", 3.5);
        mahasiswa02 mhs4 = new mahasiswa02("21212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        
        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
