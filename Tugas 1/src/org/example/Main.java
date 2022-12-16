package org.example;
import java.util.Scanner;;

public class Main {

    public static void main(String[] args) {
        System.out.println("Selamat Siang...");
        System.out.println("Selamat Datang di Restoran BUNGAR \n");

        Scanner in = new Scanner(System.in);

        System.out.print("Pesan untuk berapa orang    : ");
        int person = Integer.parseInt(in.nextLine());

        System.out.print("Pesanan atas nama           : ");
        String name = in.nextLine();

        System.out.println("\nMenu special hari ini");
        System.out.println("=====================");

        System.out.println("1.\tNasi Goreng Spesial     @ Rp. 9999,99");
        System.out.println("2.\tAyam Bakar Spesial      @ Rp. 12345,67");
        System.out.println("3.\tSteak Sirloin Spesial   @ Rp. 21108,40");
        System.out.println("4.\tKwetiaw Siram Spesial   @ Rp. 13579,13");
        System.out.println("5.\tKambing Guling Spesial  @ Rp. 98765,43");

        System.out.println("\n");
        System.out.println("Pesanan anda [batas pesanan 0-10 porsi]");
        // Nasi Goreng
        System.out.print("1.\tNasi Goreng Spesial = ");
        int nasgor = in.nextInt();
        intRange(nasgor);
        double priceNasgor = nasgor * 9999.99;

        // Ayam Bakar
        System.out.print("2.\tAyam Bakar Spesial = ");
        int ayamBakar = in.nextInt();
        intRange(ayamBakar);
        double priceAyamBakar = ayamBakar * 12345.67;

        // Steak Sirloin
        System.out.print("3.\tSteak Sirloin Spesial = ");
        int steak = in.nextInt();
        intRange(steak);
        double priceSteak = steak * 21108.40;

        // Kwetiauw Siram
        System.out.print("4.\tKwetiaw Siram Spesial = ");
        int kwetiauw = in.nextInt();
        intRange(kwetiauw);
        double priceKwetiauw = kwetiauw * 13579.13;

        // Kambing Guling
        System.out.print("5.\tKambing Guling Spesial = ");
        int kambing = in.nextInt();
        intRange(kambing);
        double priceKambing = kambing * 98765.43;

        double price = priceNasgor + priceAyamBakar + priceSteak + priceKwetiauw + priceKambing;
        double discPrice = (price*10)/100;
        double totalPrice = price-discPrice;
        double pricePerson = totalPrice/person;

        System.out.println("\n Selamat Menikmati Pesanan Anda... \n");
        System.out.println("Pembelian: ");
        System.out.println("1.\tNasi Goreng Spesial \t" + nasgor + " porsi" + " * Rp. 9999,99" + "\t = \t" + "Rp. " + round(priceNasgor));
        System.out.println("2.\tAyam Bakar Spesial \t\t" + ayamBakar + " porsi" + " * Rp. 12345,67" + "\t = \t" + "Rp. " + round(priceAyamBakar));
        System.out.println("3.\tSteak Sirloin Spesial \t" + steak + " porsi" + " * Rp. 21108,40" + "\t = \t" + "Rp. " + round(priceSteak));
        System.out.println("4.\tKwetiaw Siram Spesial \t" + kwetiauw + " porsi" + " * Rp. 13579,13" + "\t = \t" + "Rp. " + round(priceKwetiauw));
        System.out.println("5.\tKambing Guling Spesial \t" + kambing + " porsi" + " * Rp. 98765,43" + "\t = \t" + "Rp. " + round(priceKambing) + " + ");
        System.out.println("========================================================================");
        System.out.println("Total Pembelian \t\t\t\t\t\t\t\t\t = Rp. " + price);
        System.out.println("Disc. 10% <Masa Promosi> \t\t\t\t\t\t\t = Rp. " + discPrice + " - ");
        System.out.println("========================================================================");
        System.out.println("Total pembelian setelah discount  \t\t\t\t\t = Rp. " + round(totalPrice));
        System.out.println("Pembelian per " + person + " orang  \t\t\t\t\t\t\t\t = Rp. " + round(pricePerson));
        System.out.println("\n");

        System.out.println("                   Terima kasih atas kunjungan anda...");
        System.out.println("                   ...tekan ENTER untuk keluar...");
    }

    public static double round(double num) {
        return (Math.round(num * 100.0) / 100.0);
    }

    public static void intRange(int input){
        if (input > 0 && input < 11){
            return;
        } else {
            System.out.println("Pesanan tidak boleh lebih dari 10");
            System.exit(0);
        }
    }
}
