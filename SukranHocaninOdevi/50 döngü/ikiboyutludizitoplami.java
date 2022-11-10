import java.util.Scanner;

public class ikiboyutludizitoplami {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[][] dizi = new int[5][3];
        int toplam;
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print("Bir sayi giriniz: ");
                dizi[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i < 5; i++)
        {
            toplam = 0;
            
        System.out.println("\t  SAYILAR  \tTOPLAM");
            for(int j = 0; j < 3; j++)
            {
                toplam += dizi[i][j];
                System.out.print(dizi[i][j] + "\t");
            }
            System.out.println(toplam + "\n");
        }
    }
}
