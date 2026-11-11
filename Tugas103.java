import java.util.Scanner;

public class Tugas103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Program Pengelolaan Nilai Mahasiswa ===");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();

        int[] nilai = new int[jumlah];
        int total = 0;
        double rata2;

        System.out.println("\n--- Input Nilai Mahasiswa ---");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();

            total += nilai[i];
        }

        rata2 = (double) total / nilai.length;

        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        
        System.out.println("\n===== REKAP NILAI MAHASISWA =====");
        System.out.println("Rata-rata: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        System.out.println("---- Daftar Nilai dan Status ----");

        for (int i = 0; i < nilai.length; i++) {
            String status;
            if (nilai[i] >= 75) {
                status = "Lulus";
            } else {
                status = "Tidak Lulus";
            }
            System.out.println("Mahasiswa ke-" + (i + 1) + " " + nilai[i] + " Status: " + status);
        }
        System.out.println("=================================");
    sc.close();
    }
}
