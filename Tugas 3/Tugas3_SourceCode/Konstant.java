//NIM = 13020220039
//Nama = Nifal
//Hari/Tanggal = Minggu 10/03/2024
//Waktu Pengerjaan = 13.00 - 23.30

import java.util.Scanner;

public class Konstant {
    /**
    * @param args
    */
        public static void main(String[] args) {

        final float PHI = 3.1415f;
        float r;
        Scanner masukan=new Scanner(System.in);

        System.out.print ("Jari-jari lingkaran =");
        r = masukan.nextFloat();

            System.out.print ("Luas lingkaran = "+ (PHI * r * r)+"\n");
            System.out.print ("Akhir program \n");
    }

}