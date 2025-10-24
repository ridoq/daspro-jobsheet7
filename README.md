# Percobaan - 1

Di dalam Sistem Informasi Akademik (SIAKAD), dosen mengisi nilai mata kuliah Praktikum
Dasar Pemrograman yang ditempuh oleh mahasiswa. Dosen tersebut ingin mencari nilai
tertinggi dan terendah Kuis dari 10 mahasiswa di dalam satu kelas. Dosen tersebut harus
memasukkan nilai dari setiap siswa, kemudian menentukan dan menampilkan nilai tertinggi
dan terendah. Perhatikan flowchart berikut ini:

![ketentuan](assets/img/percobaan1.png)

---
## Soal

1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1!
2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!

![ketentuan](assets/img/p1-no3.png)

4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60). Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi dan terendah!

5. Commit dan push kode program ke Github

---
## Jawaban

1. Komponen for ada tiga, pada kasus ini yaitu inisialisasi, kondisi, increment
    - Inisialisasi: int i = 1 (variabel penghitung dimulai dari 1.)
    - Kondisi: i <= 10 (perulangan akan terus dijalankan selama i kurang dari atau sama dengan 10.)
    - Increment: i++ (setiap selesai satu putaran, nilai i akan bertambah 1.)
2. Nilai tertinggi di awal dianggap 0 agar nilai mahasiswa pertama pasti lebih besar dan menggantikan nilai awal. Nilai terendah di awal dianggap 100 agar nilai mahasiswa pertama pasti lebih kecil dan menggantikan nilai awal.
3. Fungsi dari codenya adalah sebagi berikut:
    - if pertama memeriksa apakah nilai yang diinputkan pengguna lebih besar dari nilai tertinggi sebelumnya. Jika iya maka tertinggi diperbarui dengan nilai tersebut.
    - if kedua kebalikannya yaitu memeriksa apakah nilai yang diinputkan pengguna lebih kecil dari nilai terendah sebelumnya. Jika iya maka terendah diperbarui dengan nilai tersebut.
4. 