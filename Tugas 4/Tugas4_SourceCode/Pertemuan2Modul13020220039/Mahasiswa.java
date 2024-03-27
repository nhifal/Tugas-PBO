package Pertemuan2Modul413020220014;

/*
@author 13020220039
Nama : Nifal
Materi : Tugas 4 Evaluasi Praktikum 1
Waktu : 27/03/2024, 14.01
*/

public class Mahasiswa extends Orang {
    private String stb;

    public Mahasiswa() {
        super();
        this.stb = "13020220014";
    }

    public Mahasiswa(String stb, String nama) {
        this.nama = nama;
        this.stb = stb;
    }

    public static void info() {
        System.out.println("Ini adalah class Mahasiswa");
    }
}