package com.indivaragroup.inheritance.exam.company;
import java.util.Scanner;

public class Organization {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("PT JDT 17 MAJU SEJAHTERA MANDIRI");
        System.out.println("================================");

        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Umur : ");
        int umur = input.nextInt();

        System.out.println("\nPilih Posisi:");
        System.out.println("1. Junior");
        System.out.println("2. Middle");
        System.out.println("3. Senior");
        System.out.println("4. Head HRD");

        System.out.print("Masukkan Pilihan : ");
        int pilihan = input.nextInt();

        InfoKaryawan karyawan = null;

        // polymorphism
        switch (pilihan) {

            case 1:
                karyawan = new JuniorEmployee(nama, umur);
                break;

            case 2:
                karyawan = new MiddleEmployee(nama, umur);
                break;

            case 3:
                karyawan = new SeniorEmployee(nama, umur);
                break;

            case 4:
                karyawan = new HeadHRD(nama, umur);
                break;

            default:
                System.out.println("Pilihan tidak tersedia!");
        }

        // output
        if (karyawan != null) {
            karyawan.tampilkanData();
        }

        input.close();
    }
}
