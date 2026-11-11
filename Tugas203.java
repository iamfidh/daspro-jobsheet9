import java.util.Scanner;

public class Tugas203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("=== Daftar Menu Kafe ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(menu[i] + " - Rp." + harga[i]);
        }
        System.out.println("========================");

        System.out.println("\n--- Pengecekkan Ketersediaan Menu ---");
        System.out.print("Masukkan nama menu yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println("Manu " + menu[i]+ "tersedia dengan harga Rp." + harga[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Menu " + cari + " tidak tersedia.");
            return;
        }

        System.out.println("\n--- Proses Pemesanan ---");
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        String[] pesanan = new String[jumlah];

        int totalBiaya = 0;
        for (int i = 0; i < pesanan.length; i++) {
            boolean valid = false;
            do {
                System.out.print("Masukkan nama menu ke-" + (i+1) + ": ");
                pesanan[i] = sc.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(pesanan[i])) {
                        pesanan[i] = menu[j];
                        totalBiaya += harga[j];

                        valid = true;
                        break;
                    }
                    
                }
                if (!valid) {
                    System.out.println("Menu tidak tersedia! Silahkan masukkan menu yang benar.");
                }
            } while (!valid);
        }
        System.out.println("=== Struk Pemesanan ===");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.println((i + 1) + ". " + pesanan[i]);
        }
        System.out.println("-----------------------");
        System.out.println("Total biaya: Rp." + totalBiaya);
        System.out.println("=======================");

        sc.close();
    }
}
