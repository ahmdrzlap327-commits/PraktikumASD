package Jobsheet5;

public class sorting02 {
    int [] data;
    int jumDat;

    sorting02 (int Data[], int jmlData){
        jumDat = jmlData;
        data = new int [jmlData];
        for (int i = 0; i < jumDat; i++) {
            data [i] = Data [i];
        }
    }

    void tampil(){
        for (int i = 0; i < jumDat; i++) {
            System.out.print(data[i] + " ");
        }
        
        System.out.println();
    }

    void bubbleshort(){
        int temp = 0;
        for (int i = 0; i < jumDat-1; i++) {
            for (int j = 1; j < jumDat-i; j++) {
                if (data[j-1] > data[j]) {
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
    }

    void selectionsort(){
        for (int i = 0; i < jumDat-1; i++) {
            int min = i;
            for (int j = i+1; j < jumDat; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }
}
