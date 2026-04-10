package Jobsheet5;

public class sortingMain02 {
    public static void main(String[] args) {
        int a [] ={20, 10, 2, 7, 12};

        sorting02 dataurut1 = new sorting02(a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleshort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SHORT (ASC)");
        dataurut1.tampil();
    }
}
