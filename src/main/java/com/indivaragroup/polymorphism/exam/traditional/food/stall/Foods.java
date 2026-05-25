package com.indivaragroup.polymorphism.exam.traditional.food.stall;

class Foods extends Menu implements InfoMenu {

    String kategori;
    String subKategori;
    String jenisMasak;

    @Override
    public void tampilkanInfo() {
        System.out.println("=== MENU MAKANAN ===");
        System.out.println("Nama Menu     : " + nama);
        System.out.println("Kategori      : " + kategori);
        System.out.println("Sub Kategori  : " + subKategori);
        System.out.println("Jenis Masak   : " + jenisMasak);
        System.out.println("Harga         : Rp " + harga);
        System.out.println();
    }
}

