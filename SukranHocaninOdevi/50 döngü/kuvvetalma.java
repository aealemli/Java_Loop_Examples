public class kuvvetalma {

        public static void main(String[] args) {
            int taban = 3, kuvvet = 4;
     
            long sonuc = 1;
     
            for (;kuvvet != 0; --kuvvet)
            {
                sonuc *= taban;
            }
     
            System.out.println("CEVAP = " + sonuc);
        }
}
