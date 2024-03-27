package Pertemuan2Modul413020220014;

/*
@author 13020220039
Nama : Nifal
Materi : Tugas 4 Evaluasi Praktikum 1
Waktu : 27/03/2024, 14.01
*/

public class Utama {
    public static void main(String[] args) {
        Orang orang = new Orang();
        orang.nama = "Raihan";
        System.out.println("Stb : " + orang.nama);
        
        Orang.info();
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Apriansyah";
        System.out.println("Stb Mahasiswa : " + mahasiswa.nama);
        
        Mahasiswa.info();
    }
}