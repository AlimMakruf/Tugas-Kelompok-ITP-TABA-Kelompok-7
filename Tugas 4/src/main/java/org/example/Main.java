package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static int[] randInt = new int[5];

    public static void main(String[] args) {
        while (true) {
            int pilihan;

            System.out.println("\nSelamat Datang di Program Simulasi\nMenu");
            System.out.println("1. Random Data");
            System.out.println("2. Simulasi Bubble Sort - Ascending");
            System.out.println("3. Simulasi Selection Sort - Ascending");
            System.out.println("4. Simulasi Bubble Sort - Descending");
            System.out.println("5. Simulasi Selection Sort - Descending");
            System.out.println("6. Keluar");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = input.nextInt();
            switchPilihan(pilihan);
        }
    }

    public static void switchPilihan (int pilihan){
        switch (pilihan){
            case 1:
                randomInt();
                break;
            case 2:
                bubleAsc(randInt, 5);
                break;
            case 3:
                selectionAsc(randInt, 5);
                break;
            case 4:
                bubbleDesc(randInt, 5);
                break;
            case 5:
                selectionDesc(randInt, 5);
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Silahkan pilih antara 1 sampai 6");
                break;
        }
    }

    public static void randomInt(){

        Random intRandom = new Random();
        System.out.print("Batas Bawah: ");
        int min = input.nextInt();
        System.out.print("Batas Atas: ");
        int max = input.nextInt();

        if(min >= max) {
            System.out.println("Batas bawah harus lebih kecil dari batas atas!!");
        } else {
            int rangeInt = max - min;
            for (int i = 0; i < 5; i++) {
                randInt[i] = intRandom.nextInt(rangeInt) + min;
                System.out.print(randInt[i] + " ");
            }
        }
    }

    public static void bubleAsc(int[] data, int sum) {
        //sebelum sort
        System.out.println("Data sebelum di sorting: ");
        for(int i = 0 ; i < sum; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("");

        // sort
        System.out.println("Proses Bubble Sort Ascending");
        for(int i = 0; i < sum; i++) {
            System.out.println("Pass " + (i + 1));
            for (int j = 0; j < sum; j++){
                System.out.print(data[j] + " ");
            }
            System.out.println();
            for (int j = 0; j < sum - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
                if (j < sum - (i + 1)) {
                    for (int k = 0; k < sum; k++) {
                        System.out.print(data[k] + " ");
                    }
                }
                System.out.println();
            }
            System.out.println("\nResult of Pass " + (i + 1));
            for (int j = 0; j < sum; j++){
                System.out.print(data[j] + " ");
            }
            System.out.println();
        }
    }

    private static void selectionAsc(int [] data, int sum){
        // sebelum sort
        System.out.println("Data sebelum disorting: ");
        for(int i = 0; i < sum; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");

        // sort
        System.out.println("Proses Selection Sort Ascending");
        for(int i = 0; i < sum; i++){
            System.out.println("Pass " + (i + 1));
            for(int j = 0; j < sum; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println("");

            boolean swap = false;
            int index = 0;
            int min = data[i];
            for(int j = i + 1; j < sum; j++){
                if(min > data[j]){
                    swap = true;
                    index = j;
                    min = data[j];
                }
            }
            if(swap){
                int temp = data[i]; data[i] = data[index]; data[index] = temp;
            }
            System.out.println("Result of Pass " + (i + 1));
            for(int j = 0; j < sum; j++){
                System.out.print(data[j] + " ");
            }
            System.out.println("");
        }
    }

    private static void bubbleDesc(int [] data, int sum){
        // sebelum sorting
        System.out.print("Data sebelum di sorting: ");
        for(int i = 0 ; i < sum; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("");

        // proses sort
        System.out.println("Proses Bubble Sort Descending");
        for(int i = 0; i < sum; i++){
            System.out.println("\nPass " + (i + 1));
            for(int j = 0; j < sum; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println();

            for(int j = 0; j < sum - 1; j++){
                if(data[j] < data[j + 1]){
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
                if(j < sum - (i + 1)){
                    for(int k = 0; k < sum; k++) {
                        System.out.print(data[k] + " ");
                    }
                }
                System.out.println();
            }
            System.out.println("Result of Pass " + (i + 1));
            for(int j = 0; j < sum; j++){
                System.out.print(data[j] + " ");
            }
        }
    }

    private static void selectionDesc(int [] data, int sum) {
        // sebelum sorting
        System.out.println("Data sebelum disorting: ");
        for (int i = 0; i < sum; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");

        // proses  sort
        System.out.println("Proses Selection Sort Descending");
        for (int i = 0; i < sum - 1; i++) {
            System.out.println("Pass " + (i + 1));
            for (int j = 0; j < sum; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println("");

            boolean swap = false;
            int index = 0;
            int min = data[i];
            for (int j = i + 1; j < sum; j++) {
                if (min < data[j]) {
                    swap = true;
                    index = j;
                    min = data[j];
                }
            }
            if (swap) {
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
            }
            System.out.println("Result of Pass " + (i + 1));
            for (int j = 0; j < sum; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println("");
        }
    }
}