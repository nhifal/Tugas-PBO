//NIM = 13020220039
//Nama = Nifal
//Hari/Tanggal = Minggu 10/03/2024
//Waktu Pengerjaan = 13.00 - 23.30

import java.util.Scanner;
public class KasusSwitch {
    /**
    * @param args
    */
        public static void main(String[] args) {

    char cc;
    Scanner masukan=new Scanner(System.in);

        System.out.print ("Ketikkan sebuah huruf, akhiri dengan RETURN \n");
        cc=masukan.next().charAt(0);
            switch (cc) {
            case 'a': { System.out.print (" Yang anda ketik adalah a\n"); break;}
            case 'u': { System.out.print (" Yang anda ketik adalah u\n"); break;}
            case 'e': { System.out.print (" Yang anda ketik adalah e\n"); break;}
            case 'i': { System.out.print (" Yang anda ketik adalah i\n"); break;}
            case 'o': { System.out.print (" Yang anda ketik adalah o\n"); break;}
            default:

        System.out.print (" Yang anda ketik adalah huruf mati\n");

        }
}

}