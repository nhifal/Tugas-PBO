package Evaluasi.HitungNilai;

/*
@author 13020220039
Nama : Nifal
Materi : Tugas 4 Evaluasi Praktikum 1
Waktu : 27/03/2024, 15.30
*/

public class HitungNilaiAkhir {
    public double nilaiTugas(int tugas1, int tugas2) {
        double rataTugas = (tugas1 + tugas2) / 2.0;
        return rataTugas;
    }

    public double nilaiAkhir(double tugas, int mid, int uas) {
        double nilaiAkhir = (tugas * 0.4) + (mid * 0.3) + (uas * 0.3);
        return nilaiAkhir;
    }
}
