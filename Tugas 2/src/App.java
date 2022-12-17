import java.util.Scanner;

public class App {

    public static void numberRange(int input){
        if (input >= 5 && input <= 20){
            return;
        } else {
            System.out.println("Nomor harus diantara 5 sampai dengan 20!");
            System.exit(0);
        }
    }

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
        Scanner myObj = new Scanner(System.in);
        Integer value;

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.print("Masukan Sembarang Angka [5..20] : ");
        value = myObj.nextInt();
        numberRange(value);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        //Deret Bilangan Genap
        System.out.println(value + " Bilangan Genap : ");
        System.out.println(bilanganGenap(value));

        //Deret Bilangan Ganjil
        System.out.println(value + " Bilangan Ganjil : ");
        System.out.println(bilanganGanjil(value));
        
        //Deret Bilangan Fibonacci
        System.out.println(value + " Bilangan Fibonacci : ");
        System.out.println(fibonacciCount(value));

        myObj.close();
    }

}
