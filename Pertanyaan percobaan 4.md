1. Jelaskan mengapa penulisan parameter di praktikum 4 ditulis dengan String...
namaPengunjung!
Karena tujuan nya adalah memasukkan nama pengunjung ke dalam parameter
2. Modifikasi method daftarPengunjung menggunakan for-each loop.

3. Bisakah menggunakan dua tipe data varaargs dalam satu fungsi? Jelaskan jawaban
Anda berdasarkan aturan varargs di Java, dan berikan contohnya!
Tidak, Anda tidak bisa menggunakan dua tipe data varargs dalam satu fungsi di Java karena hanya satu parameter varargs yang diizinkan dan harus menjadi yang terakhir, seperti yang ditunjukkan oleh contoh kode yang akan menyebabkan kesalahan kompilasi: public static void printData(String... strings, int... integers) { /* Error */ }.

4. Jelaskan apa yang terjadi jika fungsi daftarPengunjung dipanggil tanpa argumen.
Apakah program akan error saat kompilasi, error saat dijalankan, atau tetap berjalan?
Jika tetap berjalan, bagaimana output yang dihasilkan?
Kode tersebut akan tetap berjalan (tidak error saat kompilasi maupun saat dijalankan) jika dipanggil tanpa argumen.
Ketika dipanggil tanpa argumen, namaPengunjung di dalam fungsi diperlakukan sebagai sebuah array String kosong (String[] namaPengunjung = {}).