//NIM = 13020220039
//Nama = Nifal
//Hari/Tanggal = Minggu 10/03/2024
//Waktu Pengerjaan = 13.00 - 23.30

import java.util.Scanner;

public class PrintIterasi {
        /**
        * @param args
        */
    public static void main(String[] args) {

        int N;
        int i;
        Scanner masukan=new Scanner(System.in);

            System.out.print ("Nilai N >0 = "); /* Inisialisasi*/
                N = masukan.nextInt();
                i = 1; 
            System.out.print ("Print i dengan ITERATE : \n");
                for (;;){
            System.out.println(i); 
                if (i == N)
                break;
                else {
                        i++; 
                             }

        }
    
    }

}