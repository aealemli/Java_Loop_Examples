import java.util.Scanner;

public class basamakbulma {
    public static void main(String[] args) {
        int x;
        System.out.println("Girilen sayının kaç basamak olduğunu öğrenme");
        Scanner scanner = new Scanner(System.in);
    System.out.println("Sayı giriniz:");
        x=scanner.nextInt();
 
        if(x<10)//İf else koşulları ile basamaklara göre şartlarımızı belirttik.
            System.out.println("Sayı 1 basamaklı");
 
        else if(x<100)
            System.out.println("Sayı 2 basamaklı");
 
        else if(x<1000)
            System.out.println("Sayı 3 basamaklı");

        else if(x<10000)
            System.out.println("Sayı 4 basamaklı");

        else if (x<100000)
            System.out.println("Sayı 5 basamaklı");

        else
            System.out.println("Sayı 6 basamaklı");
    }
}
