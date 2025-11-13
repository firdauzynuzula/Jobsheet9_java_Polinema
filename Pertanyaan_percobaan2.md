# Pertanyaan Percobaan 2

1. Ubah statement pada langkah nomor 5 menjadi seperti berikut ini:

    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.print("Masukkan nilai ke-" + (i) + ": ");
        nilaiAkhir[i] = input.nextInt();
    }

Jalankan program. Apakah terjadi perubahan? Mengapa demikian?

2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?

3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program
hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70 )

4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan
nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus,
seperti ilustrasi output berikut:

Masukkan nilai ke-0: 80
Masukkan nilai ke-1: 90
Masukkan nilai ke-2: 60
Masukkan nilai ke-3: 65
Masukkan nilai ke-4: 50
Masukkan nilai ke-5: 55
Masukkan nilai ke-6: 60
Masukkan nilai ke-7: 90
Masukkan nilai ke-8: 95
Masukkan nilai ke-9: 85

Nilai-nilai yang telah diinputkan:
Mahasiswa index ke-0 lulus
Mahasiswa index ke-1 lulus
Mahasiswa index ke-2 tidak lulus
Mahasiswa index ke-3 tidak lulus
Mahasiswa index ke-4 tidak lulus
Mahasiswa index ke-5 tidak lulus
Mahasiswa index ke-6 tidak lulus
Mahasiswa index ke-7 lulus
Mahasiswa index ke-8 lulus
Mahasiswa index ke-9 lulus

