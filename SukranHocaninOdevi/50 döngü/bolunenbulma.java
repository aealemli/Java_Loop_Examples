import java.util.Scanner;

public class bolunenbulma {
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);
        int i;
        
        System.out.println("Sayı giriniz ");
        int n = scanner.nextInt();
        System.out.println("Bölen sayıyı giriniz");
        int y = scanner.nextInt();
        for (i=1; i<=n; i++)//For döngümüzdeki koşulları belirttik
        {
            if(i%y==0)//Eğer i' girilen y sayısına bölünüp kalan 0 oluyorsa ekrana yazdır.
            System.out.println(i+" " +y+"'e bölünür");
        }
}
}