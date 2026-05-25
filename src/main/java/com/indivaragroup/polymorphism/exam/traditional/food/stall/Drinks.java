package com.indivaragroup.polymorphism.exam.traditional.food.stall;

class Drinks extends Menu implements InfoMenu {

    String kategoriMinuman;
    String rasa;

    @Override
    public void tampilkanInfo() {
        System.out.println("=== MENU MINUMAN ===");
        System.out.println("Nama Minuman  : " + nama);
        System.out.println("Kategori      : " + kategoriMinuman);
        System.out.println("Rasa          : " + rasa);
        System.out.println("Harga         : Rp " + harga);
        System.out.println();
    }
}
