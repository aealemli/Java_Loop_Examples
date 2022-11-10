import java.util.Scanner;

public class ucevebesetambolunenler {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = scan.nextInt();
        System.out.println("1. sayıdan 2. sayıya kadar, 3 ve 5'e tam bölünen sayılar şu şekildedir.");
        for(int i = sayi1; i < sayi2; i++)
        {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " sayisi 3 ve 5 in katıdır");
            }
        }
    }
}
