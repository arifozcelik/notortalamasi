import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //değişkenle oluştu
        int mat, fizik, kimya, turkce, tarih, muzik;
        //scanner sınıfı tanımlandı
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan değer al
        System.out.println("mat notu:");
        mat = inp.nextInt();

        System.out.println("fizik notu:");
        fizik = inp.nextInt();

        System.out.println("kimya notu:");
        kimya = inp.nextInt();

        System.out.println("turkce notu:");
        turkce = inp.nextInt();

        System.out.println("tarih notu:");
        tarih = inp.nextInt();

        System.out.println("muzik notu:");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + tarih + turkce + muzik);
        double sonuc = toplam / 6;
        System.out.println("ortalamaniz :" + sonuc);

    }
}
