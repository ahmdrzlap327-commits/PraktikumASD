package Jobsheet11;

public class QueueLinkedList {
    nodeTugas head;
    nodeTugas tail;
    int size;
    int max;

    public QueueLinkedList(int n) {
        max = n;
        size = 0;
        head = null;
        tail = null;
    }

    // bagian poin D
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    // bagian poin D
    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    // bagian poin D
    public void mengosongkanAntrian() {
        head = tail = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    //bagian poin E
    public void Enqueue(mahasiswaTugas02 input) {
        if (isFull()) {
            System.out.println("Queue Linked list sudah penuh");
        } else {
            nodeTugas ndInput = new nodeTugas(input, null);
            if (isEmpty()) {
                head = ndInput;
                tail = ndInput;
            } else {
                tail.next = ndInput;
                tail = ndInput;
            }
            size++;
            System.out.println(input.nama + " berhasil masuk ke antrian.");
        }
    }

    // bagian memanggil antrian poin f
    public void Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            mahasiswaTugas02 mhsKeluar = head.data;
            
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            size--;
            
            System.out.print("Melayani mahasiswa (Keluar antrian): ");
            mhsKeluar.tampilInformasi();
        }
    }

    // bagian poin g
    public void tampilDepanDanAkhir() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            System.out.print("Mahasiswa Terdepan (Front/Head): ");
            head.data.tampilInformasi();
            System.out.print("Mahasiswa Terbelakang (Rear/Tail): ");
            tail.data.tampilInformasi();
        }
    }

    //bagian poin h
    public void tampilkanJumlahAntrean() {
        System.out.println("Jumlah elemen = " + size);
    }

    public void printAntrian() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            nodeTugas tmp = head;
            System.out.println("Daftar Mahasiswa dalam Antrian:");
            int i = 1;
            while (tmp != null) {
                System.out.print(i + ". ");
                tmp.data.tampilInformasi();
                tmp = tmp.next;
                i++;
            }
        }
    }
}