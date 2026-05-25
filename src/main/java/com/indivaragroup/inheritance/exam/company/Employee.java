package com.indivaragroup.inheritance.exam.company;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;




/*
         1. BUAT KAN SAYA STRUKTUR ORGANISASI DIDALAM SEBUAH PERUSAHAAN
            PT JDT 17 MAJU SEJAHERA MANDIRI

            * MELIPUTI KARYAWAN LENGKAP DENGAN NAMA, UMUR, GAJI, POSISI

         2. SECARA STRUKTUR ORGANISASI NYA KARYAWAN HARUS DIGOLONGKAN BERDASARKAN
            UMUR NYA EG: KALO UMUR NYA MASIH MUDA 20 - 25 _ INI POSISI JUNIOR
            25 - 35 - INI POSISI MIDDLE TO SENIOR

         3. SECARA LEVEL DAN STRUKTUR ORGANISASI HARUS BISA MENTARGETKAN JUGA GAJI NYA
            BERDASARKAN LEVEL / POSISI, TAMBAHAN KLO ADA KARYAWAN DIATAS UMUR 55.
            BILANG POSISI HEAD HRD SURUH PENSIUN.

         4. BUAT KAN CLASS INHERINTANCE / EXTENDS DAN OBJECT NYA DARI POINT 1,2 DAN 3

         NP: NAMA ATTRIBUTE, TIPE DATA HARUS BENAR ya
          1. KALO DUIT ( BIG DECIMAL ) kalo diprint bentuk nya gaji 10,000,000
          2. NAMA ORANG DIBUAT UPPERCASE ini bisa make (Object) .toUpperCase()
         */

class Employee implements InfoKaryawan {

    String nama;
    int umur;
    BigDecimal gaji;
    String posisi;

    public Employee(String nama, int umur, BigDecimal gaji, String posisi) {
        this.nama = nama.toUpperCase();
        this.umur = umur;
        this.gaji = gaji;
        this.posisi = posisi;
    }

    // IMPLEMENT METHOD DARI INTERFACE
    @Override
    public void tampilkanData() {

        NumberFormat rupiah =
                NumberFormat.getCurrencyInstance(new Locale("id", "ID"));

        System.out.println("================================");
        System.out.println("Nama    : " + nama);
        System.out.println("Umur    : " + umur);
        System.out.println("Posisi  : " + posisi);
        System.out.println("Gaji    : " + rupiah.format(gaji));

        // penggolongan berdasarkan umur
        if (umur >= 20 && umur <= 25) {
            System.out.println("Level   : JUNIOR");
        }

        if (umur > 25 && umur <= 35) {
            System.out.println("Level   : MIDDLE - SENIOR");
        }

        if (umur > 35 && umur <= 55) {
            System.out.println("Level   : SENIOR");
        }

        // aturan pensiun
        if (umur > 55 && posisi.equalsIgnoreCase("HEAD HRD")) {
            System.out.println("Keterangan : HEAD HRD SUDAH WAKTUNYA PENSIUN");
        }
    }
}


