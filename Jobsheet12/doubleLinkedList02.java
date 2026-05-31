package Jobsheet12;

public class doubleLinkedList02 {
    node02 head;
    node02 tail;

    public doubleLinkedList02() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst (mahasiswa02 data) {
        node02 newNode = new node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(mahasiswa02 data) {
        node02 newNode = new node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, mahasiswa02 data) {
        node02 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        } 
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        node02 newNode = new node02(data);

        //jika current adalah tail, node baru ditambahkan di akhir
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah nim " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        node02 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong.");
            return;
        } 

        mahasiswa02 tmp = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data berhasil dihapus.");
        tmp.tampil();
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list kosong.");
            return;
        }

        mahasiswa02 tmp = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data berhasil dihapus.");
        tmp.tampil();
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        System.out.println("=== CETAK DARI BELAKANG (TAIL -> HEAD) ===");
        node02 current = tail;
        while (current != null) {
            current.data.tampil();
            System.out.println("--------------------");
            current = current.prev;
        }
    }


}
