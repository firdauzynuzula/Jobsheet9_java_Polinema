1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. 
Apa yang terjadi? Mengapa bisa demikian?

2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus 
pada saat deklarasi array.

3. Ubah statement pada langkah No 4 menjadi seperti berikut
  for (int i = 0; i < 4; i++) {
            System.out.println(bil[i]);
        }

4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran 
    dari program? Mengapa demikian? 

jawab:

1. error , karena tipe data array adalah integer sedangkan value yang ada di dalam array berupa double tetapi bisa tidak error kalau tipe data array nya adalah double.

2. sudah
      int[] bil = {1,2,3,4,5,6,7,8,9,10};

3. sudah 
    for (int i = 0; i < 4; i++) {
            System.out.println(bil[i]);
        }

4. keluaran dari program tersebut berupa 5 angka atau 5 data,  karena perulangan nya dijalankan ketika 
    int i = 0. Sedangkan operator yang digunakan adalah <= (kurang dari sama dengan) yang artinya perulangan akan mencetak angka atau output sampai i = 4; 