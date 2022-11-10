import java.util.Scanner;

public class sayiyiterscevirme {
    public static void main(String[] args) {
        int  tersi = 0;
        
        System.out.println("Sayı gir: ");
        Scanner scanner = new Scanner(System.in);
        int sayi; 
        sayi = scanner.nextInt();
        int yedek=sayi;
        for(;sayi != 0; sayi /= 10) {
            int basamak = sayi % 10;
            tersi = tersi * 10 + basamak;
        }
        System.out.println("Sayının      : " + yedek);
        System.out.println("Sayının Tersi: " + tersi);
    } 
}
