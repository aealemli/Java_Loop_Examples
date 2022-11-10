public class enbuyukeleman {
    public static void main(String[] args) {

        double[] dizi = { 223.4, -324.5, 150.0, 433.5, 551.5, 463.7, 59.7, -16.5 };
        double enBuyuk = dizi[0];
 
        for (double sayi: dizi) {
            if(enBuyuk < sayi)
                enBuyuk = sayi;
        }
 
        System.out.format("Dizideki En Büyük Sayı = %.2f \n", enBuyuk);
    }

}
