1. Jelaskan secara singkat kapan suatu fungsi membutuhkan nilai kembalian (return
value) dan kapan fungsi tidak perlu mengembalikan nilai. Berikan minimal satu contoh
dari program kafe pada Percobaan 3 untuk masing-masing kasus.
2. Fungsi hitungTotalHargaNoAbsen saat ini mengembalikan total harga berdasarkan
pilihanMenu dan jumlahPesanan. Sebutkan tipe data nilai kembalian dan dua
buah parameter yang digunakan fungsi tersebut. Jelaskan arti masing-masing
parameter dalam konteks program kafe.
3. Modifikasi kode di atas sehingga fungsi hitungTotalHargaNoAbsen dapat menerima
kodePromo. Jika kodePromo adalah "DISKON50", maka mendapat diskon 50% dari
totalHarga dan tampilkan diskon. Jika kodePromo adalah "DISKON30", maka
mendapat diskon 30% dari totalHarga dan tampilkan diskon. Jika tidak ada kode
promo yang berlaku, tampilkan kode invalid dan tidak ada pengurangan total harga
totalHarga.
4. Modifikasi kode di atas sehingga bisa memilih beberapa jenis menu berbeda serta
menampilkan total keseluruhan pesanan. Bagaimana memodifikasi program sehingga
pengguna dapat: memesan lebih dari satu jenis menu (misalnya menu 1 dan 3
sekaligus), dan menampilkan total keseluruhan pesanan (gabungan dari semua jenis
menu)?

1.fungsi membutuhkan nilai kembalian jika hasil dari fungsi tersebut akan digunakan atau disimpan untuk keperluan aritmatika, logika, output, dll. Fungsi(void) tidak perlu nilai kembalian jika hanya melakukan proses atau tanpa perubahaan.
contoh void:
public static void Menu(String namaPelanggan,String kodePromo, boolean isMember){
        System.out.println("selamat datang, " + namaPelanggan + "!");

        if(isMember){
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
contoh return:
public static int hitungTotalHarga(int pilihanMenu, int banyakPesanan) {
        int [] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItem[pilihanMenu - 1] * banyakPesanan;
        return hargaTotal;
    }
2. type data yang dikembalikan adalah int. pilihanMenu untuk memilih pada array hargaItem, banyakPesanan untuk jumlah yang ingin dipesan.
3.