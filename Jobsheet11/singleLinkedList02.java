package Jobsheet11;

public class singleLinkedList02 {
    nodeMahasiswa02 head;
    nodeMahasiswa02 tail;

    boolean isEmpty(){
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            nodeMahasiswa02 tmp = head;
            System.out.println("Isi linked list:\t");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(mahasiswa02 input) {
        nodeMahasiswa02 ndInput = new nodeMahasiswa02(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(mahasiswa02 input) {
        nodeMahasiswa02 ndInput = new nodeMahasiswa02(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, mahasiswa02 input) {
        nodeMahasiswa02 ndInput = new nodeMahasiswa02(input, null);
        nodeMahasiswa02 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, mahasiswa02 input){
        if (index < 0) {
            System.out.println("Indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            nodeMahasiswa02 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new nodeMahasiswa02(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
