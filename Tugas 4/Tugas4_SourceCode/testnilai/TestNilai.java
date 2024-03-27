package testnilai;

/*
@author 13020220039
Nama : Nifal
Materi : Tugas 4 Evaluasi Praktikum 1
Waktu : 27/03/2024, 12.04
*/

import java.util.Scanner;

public class TestNilai {

    public static void main(String[] args) {
        HitungRata hitung = new HitungRata();
        Scanner input = new Scanner(System.in);
        int banyakData;

        System.out.print("Masukkan Jumlah Data : ");
        banyakData = input.nextInt();
        int nilai[] = new int[banyakData];
        
        System.out.println("Menu:");
        System.out.println("1. Input Nilai");
        System.out.println("2. Input Nilai Baru");
        System.out.print("Pilih opsi: ");
        int pilihan = input.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Nilai : ");
                hitung.inputNilai(nilai);
                System.out.print("Daftar Nilai : ");
                hitung.cetakNilai(nilai);
                System.out.println("Rata Nilai : "+ hitung.rataNilai(banyakData));
                break;
            case 2:
                System.out.print("Masukkan Nilai Baru: ");
                hitung.inputNilaiBaru(banyakData);
                System.out.print("Daftar Nilai Baru : ");
                hitung.cetakNilaiBaru();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}