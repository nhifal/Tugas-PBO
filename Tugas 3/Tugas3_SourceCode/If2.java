//NIM = 13020220039
//Nama = Nifal
//Hari/Tanggal = Minggu 10/03/2024
//Waktu Pengerjaan = 13.00 - 23.30

import java.util.Scanner;

public class If2 {
/**
* @param args
*/
public static void main(String[] args) {

        int a;
        Scanner masukan=new Scanner(System.in);

    System.out.print ("Contoh IF dua kasus \n");

    System.out.print ("Ketikkan suatu nilai integer :");
    a=masukan.nextInt();

    if (a >= 0){
        System.out.println ("Nilai a positif "+ a);
    }else /* a< 0 */
    {
        System.out.println ("Nilai a negatif "+ a);
    }

    }
    
}