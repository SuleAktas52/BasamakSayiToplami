import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        int sayi, basamakSayisi=0;
        int basamakDegeri;
        int basamakToplami=0;

        Scanner input= new Scanner(System.in);

        System.out.print("Sayi Giriniz: ");
        sayi= input.nextInt();

        while (sayi != 0){
            basamakDegeri=sayi %10;
            basamakToplami=basamakToplami+basamakDegeri;
            sayi=sayi/10;
            basamakSayisi++;
        }

        System.out.println("Basamak Sayisi: " + basamakSayisi);
        System.out.println("Sayinin Bsamak Degerlerinin Toplami: " + basamakToplami);
    }

}

/*
 Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
 Ornek : 1643 = 1 + 6 + 4 + 3 = 14
*/