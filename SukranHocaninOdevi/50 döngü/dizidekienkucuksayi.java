public class dizidekienkucuksayi {

    public static void main(String[] args) {

        double[] dizi = { 223.4, -324.5, 150.0, 433.5, 551.5, 463.7, 59.7, -16.5 };
        double enKucuk = dizi[0];
 
        for (double sayi: dizi) {
            if(enKucuk > sayi)
                enKucuk = sayi;
        }
 
        System.out.format("Dizideki En Küçük Sayı = %.2f \n", enKucuk);
    }
}
