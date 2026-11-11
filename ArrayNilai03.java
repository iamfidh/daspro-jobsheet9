import java.util.Scanner;

public class ArrayNilai03 {
    public static void main(String[] args) {
    int[] nilaiAkhir = new int[10];
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
        nilaiAkhir[i] = input.nextInt();
    }
    for (int i = 0; i < nilaiAkhir.length; i++) {
        String status = (nilaiAkhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
        System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1) + ": " + nilaiAkhir[i] + " (" + status + ")");
    }
    int jumlahLulus = 0;
    int jumlahTdkLulus = 0;

    for (int i = 0; i < nilaiAkhir.length; i++) {
        if (nilaiAkhir[i] > 70) {
        jumlahLulus++;
        } else {
        jumlahTdkLulus++;
        }
    }  
    System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
    System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTdkLulus);

    input.close();
    }
}
