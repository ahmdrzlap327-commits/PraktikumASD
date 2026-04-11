package Jobsheet5;

public class mahasiswaBerprestasi02 {
    mahasiswa02 [] listMhs = new mahasiswa02[5];
    int idx;

    void tambah (mahasiswa02 m){
        if (idx < listMhs.length){
            listMhs [idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil (){
        for (mahasiswa02 m : listMhs) {
            m.tampilInformasi();
            System.out.println("---------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk ) {
                    mahasiswa02 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            mahasiswa02 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];;
            listMhs[i] = tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            mahasiswa02 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk > temp.ipk ) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
