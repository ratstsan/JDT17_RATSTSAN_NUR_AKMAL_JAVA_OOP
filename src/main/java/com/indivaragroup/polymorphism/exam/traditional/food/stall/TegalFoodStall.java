package com.indivaragroup.polymorphism.exam.traditional.food.stall;


    /*
    1. SAYA PUNYA WARUNG MAKAN TEGAL DISINI SAYA HARUS MENAMPILKAN .
     * MENU MAKANAN - INI MINIMAL 5 LAUK MAKANAN AJA INI KALO BISA ADA KATEGORI NYA JUGA
        - DAGING
        - GORENGAN
      SUB KATEGORI
        - IKAN  - BAKWAN
        - AYAM  - TAHU
        - SAPI
      SUB ANEKA KATEGORI NYA
        - GORENG
        - REBUS
     * MENU MINUMAN - INI ADA KATEGORI NYA DINGIN / PANAS / MANIS / KURANG MANIS / TAWAR ???
        1. 1 - 3 ANEKA MINUMAN - 1 - 5 KATEGORI MINUMAN NYA

  2. DARI MENU MAKANAN SAYA HARUS INFO HARGA NYA JUGA BERDASARKAN SUB KATEGORI
    & SUB ANEKA KATEGORI NYA

  NB: BUAT KAN CLASS DENGAN METODE POLYMORPHISM

     */

public class TegalFoodStall {
    public static void main(String[] args) {

        // ================= MAKANAN =================

        Foods m1 = new Foods();
        m1.nama = "Ayam Goreng";
        m1.kategori = "Daging";
        m1.subKategori = "Ayam";
        m1.jenisMasak = "Goreng";
        m1.harga = 15000;

        Foods m2 = new Foods();
        m2.nama = "Ikan Rebus";
        m2.kategori = "Daging";
        m2.subKategori = "Ikan";
        m2.jenisMasak = "Rebus";
        m2.harga = 12000;

        Foods m3 = new Foods();
        m3.nama = "Sapi Goreng";
        m3.kategori = "Daging";
        m3.subKategori = "Sapi";
        m3.jenisMasak = "Goreng";
        m3.harga = 20000;

        Foods m4 = new Foods();
        m4.nama = "Bakwan";
        m4.kategori = "Gorengan";
        m4.subKategori = "Bakwan";
        m4.jenisMasak = "Goreng";
        m4.harga = 3000;

        Foods m5 = new Foods();
        m5.nama = "Tahu Goreng";
        m5.kategori = "Gorengan";
        m5.subKategori = "Tahu";
        m5.jenisMasak = "Goreng";
        m5.harga = 2500;

        // ================= MINUMAN =================

        Drinks d1 = new Drinks();
        d1.nama = "Es Teh Manis";
        d1.kategoriMinuman = "Dingin";
        d1.rasa = "Manis";
        d1.harga = 5000;

        Drinks d2 = new Drinks();
        d2.nama = "Teh Hangat";
        d2.kategoriMinuman = "Panas";
        d2.rasa = "Kurang Manis";
        d2.harga = 4000;

        Drinks d3 = new Drinks();
        d3.nama = "Air Putih";
        d3.kategoriMinuman = "Dingin";
        d3.rasa = "Tawar";
        d3.harga = 2000;

        // ================= OUTPUT =================

        m1.tampilkanInfo();
        m2.tampilkanInfo();
        m3.tampilkanInfo();
        m4.tampilkanInfo();
        m5.tampilkanInfo();

        d1.tampilkanInfo();
        d2.tampilkanInfo();
        d3.tampilkanInfo();
    }
}