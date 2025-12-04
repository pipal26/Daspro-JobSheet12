1. Apakah fungsi tanpa parameter selalu harus bertipe void?
Tidak, fungsi tanpa parameter tidak selalu harus bertipe void. Void berpengaruh jika memiliki nilai return atau tidak.
2. Apakah daftar menu pada program kafe dapat ditampilkan tanpa menggunakan fungsi
Menu()? Modifikasi kode program tersebut untuk dapat menampilkan daftar menu
tanpa menggunakan fungsi!
Bisa, dengan cara memindahkan kode untuk print menu yang ada di function menu() ke function main
3. Jelaskan keuntungan menggunakan fungsi Menu() dibandingkan menulis semua
perintah penampilan menu langsung di dalam fungsi main.
 -   kode menjadi lebih rapi, menghindari duplikasi kode, misal jika ingin memakai kode suatu fitur lebih dari satu, tidak perlu menulis ulang kode tersebut, kita hanya perlu memanggil function.
4. Uraikan secara singkat alur eksekusi program ketika fungsi Menu() dipanggil dari main
(mulai dari program dijalankan sampai daftar menu tampil di layar).
Mulai di main(): Program jalan, dan eksekusi dimulai dari fungsi main().

Panggil Menu(): main() menginstruksikan CPU untuk melompat ke awal fungsi Menu().

Jalankan Menu(): CPU menjalankan semua kode di dalam Menu(), yang menyebabkan daftar menu tampil di layar.

Kembali ke main(): Setelah Menu() selesai, CPU melompat kembali ke baris berikutnya di main() untuk melanjutkan eksekusi program.