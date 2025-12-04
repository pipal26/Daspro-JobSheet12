1. Apakah kegunaan parameter di dalam fungsi?
2. Jelaskan mengapa pada percobaan ini fungsi Menu() menggunakan parameter
namaPelanggan dan isMember?
3. Apakah parameter sama dengan variabel? Jelaskan.
4. Jelaskan bagaimana cara kerja parameter isMember pada fungsi Menu(). Apa
perbedaan output ketika isMember bernilai true dan ketika false?
5. Apa yang akan terjadi jika memanggil fungsi Menu() tanpa menyertakan parameter
namaPelanggan dan isMember?
6. Modifikasi kode di atas dengan menambahkan parameter baru kodePromo (String).
Jika kodePromo adalah "DISKON50", tampilkan berikan diskon 50%. Jika kodePromo
adalah "DISKON30", tampilkan berikan diskon 30%. Jika tidak ada kode promo yang
berlaku, tampilkan kode invalid.
7. Berdasarkan fungsi Menu() di atas, jika nama pelanggan adalah "Budi", pelanggan
tersebut member, dan menggunakan kode promo "DISKON30", tuliskan satu baris
perintah pemanggilan fungsi menu yang benar.
8. Menurut Anda, apakah penggunaan parameter namaPelanggan dan isMember
pada fungsi Menu() membuat program lebih mudah dibaca dan dikembangkan
dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi tanpa parameter?
Jelaskan alasan Anda.

1.  Parameter digunakan untuk mengirim data dari luar fungsi ke dalam fungsi, supaya fungsi bisa bekerja berdasarkan nilai yang diberikan.
2.  Agar function Menu(parameter) dapat mengoutputkan pelanggan yang dapat diskon atau tidak
3.  Parameter dan variale mirip namun tidak sama:
    -   parameter dideklarasikan di definisi fungsi, sedangkan variable dideklarasikan di dalam blok code(funsi, loop, dll)
    -   fungsi parameter untuk menerima nilai dari luar fungsi, sedangkan variable untuk menyimpan data sementara di dalam program
4. Parameter isMember bekerja sebagai variabel boolean yang mengontrol percabangan di dalam fungsi Menu(), jika true akan mengeluarkan output tersebut, jika false tidak terjadi apa apa karena tidak ada else.
5. kode tidak bids dijalankan.
8. Iya, karena fungsi tersebut dapat dipanggil kapan saja tanpa menuliskan kode baru lagi.