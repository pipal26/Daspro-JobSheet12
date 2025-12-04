import java.util.Scanner;

public class Kafe14 {
    public static void Menu(String namaPelanggan, String kodePromo, boolean isMember) {
        System.out.println("selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member. dapatkan diskon 10% untuk setiap pembelian.");
        }
        if (kodePromo.equals("DISKON50")) {
            System.out.println("🎉 Selamat! Anda berhak mendapatkan DISKON 50% untuk total pembelian!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("🎁 Selamat! Anda berhak mendapatkan DISKON 30% untuk total pembelian!");
        } else {
            System.out.println("Kode promo: " + kodePromo + " INVALID. Silakan coba kode lain.");
        }

        System.out.println("===== MENU RESTO KAFE24 =====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappuccino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie GOreng - Rp 18.000");
        System.out.println("===============================");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        final int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};
        
        if (pilihanMenu < 1 || pilihanMenu > hargaItem.length) {
            System.out.println("Pilihan menu tidak valid.");
            return 0; 
        }

        int hargaSubTotal = hargaItem[pilihanMenu - 1] * banyakItem;
        int hargaSetelahDiskon = hargaSubTotal;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            int diskon = hargaSubTotal * 50 / 100;
            hargaSetelahDiskon -= diskon;
            System.out.println("Kode promo berlaku: Diskon 50%! Potongan Rp " + diskon);
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            int diskon = hargaSubTotal * 30 / 100;
            hargaSetelahDiskon -= diskon;
            System.out.println("Kode promo berlaku: Diskon 30%! Potongan Rp " + diskon);
        } else {
            System.out.println("Kode promo tidak valid untuk item ini.");
        }
        
        return hargaSetelahDiskon;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalKeseluruhan = 0;
        String jawabanLagi = "";
        
        System.out.print("Masukkan nama Anda: ");
        String namaPelanggan = scanner.nextLine();
        System.out.print("Apakah Anda member? (y/n): ");
        boolean isMember = scanner.nextLine().equalsIgnoreCase("y");
        System.out.print("Masukkan kode promo (jika ada, cth: DISKON50): ");
        String kodePromo = scanner.nextLine();
        
        Menu(namaPelanggan, kodePromo, isMember);

        do {
            System.out.println("--- PESANAN BARU ---");
            System.out.print("Masukkan nomer menu yang ingin anda pesan: ");
            int pilihanMenu;
            if (scanner.hasNextInt()) {
                pilihanMenu = scanner.nextInt();
            } else {
                System.out.println("Input tidak valid. Membatalkan pesanan ini.");
                scanner.nextLine();
                continue;
            }
            
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem;
            if (scanner.hasNextInt()) {
                banyakItem = scanner.nextInt();
            } else {
                System.out.println("Input tidak valid. Membatalkan pesanan ini.");
                scanner.nextLine();
                continue;
            }
            
            scanner.nextLine(); 

            int hargaItemSaatIni = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            
            if (isMember) {
                 int diskonMember = hargaItemSaatIni * 10 / 100;
                 hargaItemSaatIni -= diskonMember;
                 System.out.println("Diskon Member 10% diterapkan. Potongan Rp " + diskonMember);
            }
            
            System.out.println("Harga item ini (setelah semua diskon): Rp " + hargaItemSaatIni);
            
            totalKeseluruhan += hargaItemSaatIni;
            
            System.out.print("Pesan menu lain? (y/n): ");
            jawabanLagi = scanner.nextLine();

        } while (jawabanLagi.equalsIgnoreCase("y"));

        System.out.println("\n================================================");
        System.out.println("🎉 Total keseluruhan pesanan Anda: Rp " + totalKeseluruhan);
        System.out.println("================================================");
        
        scanner.close();
    }
}