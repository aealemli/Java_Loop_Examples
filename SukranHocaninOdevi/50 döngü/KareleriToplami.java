import java.util.Scanner;
 
public class KareleriToplami {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int kare;

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        for(int i = 1; i <= sayi; i++)
        {
            kare = i * i;
            System.out.println(i + " sayısının karesi = " + kare);
        }
    }
}