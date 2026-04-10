package Jobsheet5;

public class sortingMain02 {
    public static void main(String[] args) {
        int a [] = {20, 10, 2, 7, 12};
        int b [] = {30, 20, 2, 8, 14};

        sorting02 dataurut1 = new sorting02(a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleshort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SHORT (ASC)");
        dataurut1.tampil();

        sorting02 dataurut2 = new sorting02(a,  b.length);
        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.selectionsort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();
    }
}
