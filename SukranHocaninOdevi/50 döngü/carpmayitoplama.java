import java.util.Scanner;

public class carpmayitoplama {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        System.out.print("Bir sayi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.print("Bir sayi giriniz:");
        int sayi2 = scan.nextInt();

        for(int i = 0; i < sayi2; i++)
        {
            toplam += sayi1;
        }
        System.out.println(sayi1 + " X " + sayi2 + "= " + toplam);
    }
}
