

import java.util.Scanner;

//Sınıf geçme Durumu Programı:

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        int toplamKurs = 5;


        Scanner input = new Scanner(System.in);

        //Kullanıcı Notları giriyor...

        System.out.print("Matematik notunuz : ");
        mat = input.nextInt();
        if (mat < 0||mat >100) {
            System.out.println("Geçersiz not ! ");
            mat = 0;
            toplamKurs -= 1;

        }

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();
        if(fizik < 0||fizik >100) {
            System.out.println("Geçersiz not");
            fizik = 0;
            toplamKurs -= 1;

        }

        System.out.println("Türkçe notunuz : ");
        turkce = input.nextInt();
        if(turkce < 0||turkce >100) {
            System.out.println("Geçersiz not : ");
            turkce = 0;
            toplamKurs -= 1;



        }

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();
        if(kimya < 0||kimya >100) {
            System.out.println("Geçersiz not : ");
            kimya = 0;
            toplamKurs -= 1;
        }

        System.out.print("Muzik notunuz : ");
        muzik = input.nextInt();
        if(muzik < 0||muzik >100) {
            System.out.println("Geçersiz not : ");
            muzik = 0;
            toplamKurs -= 1;


        }

        //Ortalama Formülü :

        double avarage = (mat + fizik + turkce + kimya + muzik) / toplamKurs;
        if (avarage < 55) {

            System.out.println("Sınıfta kaldınız,seneye tekrar görüşmek üzere...");

        } else {
            System.out.println("Tebrikler sınıfı geçtiniz ! ");

            System.out.println("Ortalamanız :" + avarage);




        }

    }
}