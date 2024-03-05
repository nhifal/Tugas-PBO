import java.util.Scanner;

public class Jam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        int totalDetik = scanner.nextInt();
        int detikSekarang = totalDetik % 60;
        int totalMenit = totalDetik / 60;
        int menitSekarang = totalMenit % 60;
        int totalJam = totalMenit / 60;
        int jamSekarang = totalJam % 24;

        String waktuFormat =
    String.format("%02d:%02d:%02d", jamSekarang, menitSekarang, detikSekarang);

        System.out.println("Waktu sekarang: " + waktuFormat);

    scanner.close();

    }

}