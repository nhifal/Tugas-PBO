package contohhash;

/*
@author 13020220039
Nama : Nifal
Materi : Tugas 4 Evaluasi Praktikum 1
Waktu : 27/03/2024, 13.04
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContohHash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> hashMap = new HashMap<>();

        System.out.println("Masukkan jumlah data yang ingin dimasukkan:");
        int jumlahData = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Masukkan kunci (key) ke-" + (i + 1) + ":");
            String key = scanner.nextLine();
            System.out.println("Masukkan nilai ke-" + (i + 1) + ":");
            int value = scanner.nextInt();
            scanner.nextLine();

            hashMap.put(key, value);
        }
        System.out.println("Isi HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

