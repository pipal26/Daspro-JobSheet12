1. Sebutkan tahapan dan urutan eksekusi program pada Percobaan 5, mulai dari program
dijalankan hingga menampilkan luas persegi panjang dan volume balok!
2. Tuliskan output yang dihasilkan program HitungBalokNoAbsen jika pengguna
memasukkan panjang = 4, lebar = 3, dan tinggi = 5. Jelaskan secara singkat alur
jalannya program sampai output tersebut muncul.
3. Apakah output dari program di bawah ini kemudian jelaskan alur jalannya program
tersebut!
4. Pada saat apakah fungsi yang kita buat harus menggunakan parameter atau tidak?
Pada saat apakah fungsi yang kita buat harus memiliki nilai kembalian atau tidak?
Jelaskan!
5. Jelaskan kapan sebuah fungsi sebaiknya menggunakan parameter dan kapan fungsi
boleh tanpa parameter, dengan mengacu pada fungsi hitungLuas dan hitungVolume
di Percobaan 5.
6. Jelaskan kapan sebuah fungsi sebaiknya memiliki nilai kembalian (return value) dan
kapan tidak perlu memiliki nilai kembalian, dengan mengacu pada fungsi main,
hitungLuas, dan hitungVolume.

1.Tentu, berikut adalah urutan eksekusi program tersebut yang disajikan dalam bentuk kalimat per tahap:
- Program memulai eksekusi di metode `main`, kemudian membuat objek `Scanner` untuk input dan mendeklarasikan variabel yang dibutuhkan (`p`, `l`, `t`, `L`, `vol`).
- Program meminta dan menerima nilai integer dari pengguna untuk disimpan dalam variabel
- Program meminta dan menerima nilai integer dari pengguna untuk disimpan dalam variabel 
- Program meminta dan menerima nilai integer dari pengguna untuk disimpan dalam variabel 
- Program memanggil fungsi hitungluas(p, l) yang mengalikan panjang dan lebar, kemudian menyimpan hasilnya ke variabel L.
- Program mencetak hasil perhitungan yang tersimpan dalam variabel L sebagai "Luas Persegi Panjang Adalah: [Nilai Luas]".
- Program memanggil fungsi hitungVolume(t, p, l), di mana fungsi ini secara internal memanggil kembali hitungluas(p, l) untuk mendapatkan luas alas, dan kemudian mengalikannya dengan tinggi (t), lalu menyimpan hasil akhirnya ke variabel vol.
Tampilan Volume:Program mencetak hasil perhitungan volume yang tersimpan dalam variabel vol sebagai "Volume Balok Adalah: [Nilai Volume]".
Selesai: Program menutup objek Scanner dan mengakhiri eksekusi.
2. Luas Persegi Panjang Adalah: 12
Volume Balok Adalah: 60
- 4 * 3 akan dihitung pada fungsi luas hasilnya 12 lalu diprint
- 5 * 12 dihitung pada fungsi volume dan hasilnya 60 lalu diprint
3.
- int temp adalah fungsi jumlah 1 + 1 = 2
- fungsi tampilJumlah dipanggil dengan parameter temp = 2, 5
- didalam tampilJumlah terdapat penjumlahan 2 + 5 = 7
- lalu memanggil fungsi tampilhinggakei
- parameter tampilhinggake i menjadi 7
- printout 1 sampai 7
4. Fungsi membutuhkan parameter jika ia perlu menerima data eksternal untuk diproses. Fungsi membutuhkan nilai kembalian jika hasil dari pemrosesannya harus diberikan kembali ke bagian program lain yang memanggilnya.
5. karena menggunakan data eksternal pada HitungBalok14.java kita harus mengunakan parameter agar fleksibel dan memiliki nilai kembalian. Jika tidak maka akan hanya memiliki variabel tetap didalam fungsi dan jika dipanggil hanya akan memberikan proses didalam fungsi
6. karena menggunakan data eksternal pada HitungBalok14.java kita harus mengunakan parameter agar fleksibel dan memiliki nilai kembalian. Jika tidak maka akan hanya memiliki variabel tetap didalam fungsi dan jika dipanggil hanya akan memberikan proses didalam fungsi