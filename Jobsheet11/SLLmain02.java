package Jobsheet11;
import java.util.Scanner;
public class SLLmain02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        singleLinkedList02 sll = new singleLinkedList02();

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
    }
}
