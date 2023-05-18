import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenleri oluşturmak
        int mat,fizik,kimya,turkce,tarih,muzik;
        //scanner sınıfı tanımla
        Scanner input = new Scanner(System.in);
        //kullanıcıdan değerleri al
        System.out.print("MATEMATİK NOTUNUZ : ");
        mat = input.nextInt();

        System.out.print("FİZİK NOTUNUZ : ");
        fizik = input.nextInt();

        System.out.print("KİMYA NOTUNUZ: ");
        kimya = input.nextInt();

        System.out.print("TÜRKÇE NOTUNUZ : ");
        turkce = input.nextInt();

        System.out.print("TARİH NOTU : ");
        tarih = input.nextInt();

        System.out.print("MÜZİK NOTU : ");
        muzik = input.nextInt();

         int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
         double sonuc = toplam / 6.0;
        System.out.println("ORTALAMA : " + sonuc);
        boolean kosul1 = 60 == sonuc;

        boolean kosul2 = 60 >= sonuc;

        boolean netice =!(kosul1 || kosul2);
        System.out.println(" DURUM : " +netice);











        }
    }
