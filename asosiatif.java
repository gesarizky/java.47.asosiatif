
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gesa Rizky Nugraha
 */
public class asosiatif {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" *************************************************************");
        System.out.println(" *Masukkan Nilai A  ");
        System.out.println(" *************************************************************");

        double a = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai B  ");
        System.out.println(" ************************************************************* ");

        double b = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai c  ");
        System.out.println(" ************************************************************* ");

        double c = sc.nextInt();

        double hasilplus = a + b + c;
        double hasilkali = a * b * c;

        System.out.println(" *********************************************************** ");
        System.out.println(" Jika Penjumlahan (" + a + " + " + b + ")+ " + c + " = " + a + " + (" + b + " + " + c + ") = d");
        System.out.println(" Maka Hasilnya = " + hasilplus);
        System.out.println(" *********************************************************** ");
        System.out.println(" Jika Perkalian  (" + a + " x " + b + ") x " + c + " = " + c + " x (" + b + " x " + c + ") = d");
        System.out.println(" Maka Hasilnya = " + hasilkali);
        System.out.println(" *********************************************************** ");
    }
}
