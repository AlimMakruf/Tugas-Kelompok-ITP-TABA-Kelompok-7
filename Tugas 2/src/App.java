import java.util.Scanner;

public class App {
    public static int bilanganGenap(int value){
        String deret = "0 ";
        int a = 0;
        int total = 0;

        for(int i = 0; i < value; i++){
            a += 2;
            deret += a + " ";
            total += a;
        }
        System.out.println(deret);
        return total;
    }

    public static int bilanganGanjil(int value){
        String deret = "1 ";
        int a = 1;
        int total = 1;

        for(int i = 1; i < value; i++){
            a += 2;
            deret += a + " ";
            total += a;
        }
        System.out.println(deret);
        return total;
    }

    public static int fibonacciCount(int value) {
        //value = 20
        String deret = "";
        int total = 0;
        int a = 0;
        int b = 1;
        int result = 0;

        for(int i = 1; i < value; i++){
            deret += b + " ";
            if(a == 0){
                a += 1;
                total += a+1;
                continue;
            }

            result = a + b ;
            a = b;
            b = result;
            total += b;
        }
        System.out.println(deret);
        return total;

    }

    public static void main(String[] args) throws Exception {
        Scanner input_name = new Scanner(System.in);
        Scanner input_nim = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        Scanner myObj = new Scanner(System.in);
        Integer value;
        boolean running = true;
        String loopingAnswer;


        while (running) {
            System.out.print("Masukkan nama Anda [1..25] : ");
            String name = input_name.nextLine();

            if (name.length() >= 25) {
                System.out.print("Lebih dari 25 Karakter");
            } else {
                System.out.print("Masukkan NIM Anda [Harus 10 Karakter] : ");
                String nim = input_nim.nextLine();
                System.out.println("");

                if (nim.length() == 10) {
                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                    System.out.println("");
                    System.out.println("Registrasi Sukses");
                    System.out.println("Selamat Datang " +name+"[Nim : "+nim+"].. ^^V");
                    System.out.println("");
                    System.out.println("Mari belajar macam-macam deret bilangan..");

                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                    System.out.print("Masukan Sembarang Angka [5..20] : ");
                    value = myObj.nextInt();
                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

                    if(value >= 5 && value <= 20 ){
                        System.out.println("Deret Bilangan");
                        System.out.println("##############");
                        System.out.println("");

                        //Deret Bilangan Genap
                        System.out.println(value + " Bilangan Genap : ");
                        System.out.println("Hasil Penjumlahan = " + bilanganGenap(value));

                        //Deret Bilangan Ganjil
                        System.out.println(value + " Bilangan Ganjil : ");
                        System.out.println("Hasil Penjumlahan = " + bilanganGanjil(value));

                        //Deret Bilangan Fibonacci
                        System.out.println(value + " Bilangan Fibonacci : ");
                        System.out.println("Hasil Penjumlahan = " + fibonacciCount(value));
                    } else {
                        System.out.println("Nomor harus diantara 5 sampai dengan 20!");
                    }
                } else {
                    System.out.print("NIM tidak valid\n");
                }
            }
            System.out.print("Apakah anda ingin mengulang [y/t] : ");
            loopingAnswer = input.nextLine();

            if (loopingAnswer.equalsIgnoreCase("t")) {
                running = false;
            }
        }
    }
}
