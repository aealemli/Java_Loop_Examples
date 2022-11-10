import java.util.Scanner;

public class kelimedenharfbulma {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);

        System.out.println("Bir Kelime Giriniz");
        String kelime=klavye.next();

        System.out.println("Hangi Karakteri Aramak İstiyorsunuz:");
        String karakter=klavye.next();

        int sayaç=0;

        for (int i = 0; i < kelime.length(); i++) {
            if (kelime.charAt(i)==karakter.charAt(0)) {
                sayaç++;

            }

        }

        if (sayaç==0) {
            System.out.println("Girilen Karakter Kelimede Bulunmamaktadır.");
        } else {
                System.out.println("Girilen Karakter "+sayaç+" adet Vardır.");
        }
    klavye.close();

    }
}
