public class mukemmelsayi {
        public static void main(String[] args) {
          int i; 
          int j; 
      int sayi; 
      System.out.println("10000'e kadar olan pozitif tam sayılar şu şekildedir \n");
      for(i = 1; i < 10000; i++) {
        sayi = 0;
        for(j = 1; j < i; j++) {
         if(i % j == 0) {
          sayi += j;
         } 
        }
        if(sayi == i) {
         System.out.println(sayi + " bir mükemmel sayıdır");
        }
      }
        }
      
}
