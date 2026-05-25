package com.indivaragroup.inheritance.exam.company;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Organization {


    static class FormPendaftaran {
        private String nama;
        private int umur;
        private String rolePilihan;

        public FormPendaftaran(String nama, int umur, String rolePilihan) {
            this.nama = nama;
            this.umur = umur;
            this.rolePilihan = rolePilihan;
        }
    }

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
        System.out.println("5. Java Developer");

        System.out.print("Masukkan Pilihan : ");
        int pilihan = input.nextInt();


        String rolePilihan = "";
        if (pilihan == 1) rolePilihan = "Junior Staff";
        else if (pilihan == 2) rolePilihan = "Middle Staff";
        else if (pilihan == 3) rolePilihan = "Senior Manager";
        else if (pilihan == 4) rolePilihan = "Head HRD";
        else if (pilihan == 5) rolePilihan = "Java Developer";


        FormPendaftaran form = new FormPendaftaran(nama, umur, rolePilihan);

        try {
            validasiDenganReflection(form);
        } catch (ValidasiException e) {
            System.out.println("\n❌ VALIDASI GAGAL: " + e.getMessage());
            input.close();
            return;
        } catch (IllegalAccessException e) {
            System.out.println("Terjadi kesalahan sistem saat membaca data.");
            input.close();
            return;
        }

        InfoKaryawan karyawan = null;

        // Polymorphism (Tetap dipertahankan dari kodemu yang lama)
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
            case 5:

                System.out.println("\nFitur pembuatan objek Java Developer siap diintegrasikan.");
                break;
            default:
                System.out.println("Pilihan tidak tersedia!");
        }


        if (karyawan != null) {
            karyawan.tampilkanData();
        }

        input.close();
    }


    public static void validasiDenganReflection(Object objek) throws IllegalAccessException, ValidasiException {
        Class<?> kelas = objek.getClass();
        Field[] fields = kelas.getDeclaredFields();

        String nama = "";
        int umur = 0;
        String rolePilihan = "";


        for (Field field : fields) {
            field.setAccessible(true);
            if (field.getName().equals("nama")) {
                nama = (String) field.get(objek);
            } else if (field.getName().equals("umur")) {
                umur = (int) field.get(objek);
            } else if (field.getName().equals("rolePilihan")) {
                rolePilihan = (String) field.get(objek);
            }
        }

        // 1. Validasi Nama: Kosong atau minimal 5 karakter
        if (nama == null || nama.trim().isEmpty()) {
            throw new ValidasiException("Nama tidak boleh kosong!");
        }
        if (nama.length() < 5) {
            throw new ValidasiException("Nama minimal harus 5 karakter!");
        }

        // 2. Validasi Role: Tidak boleh kosong (pilihan di luar 1-5)
        if (rolePilihan == null || rolePilihan.trim().isEmpty()) {
            throw new ValidasiException("Role yang dilamar tidak boleh kosong / Pilihan salah!");
        }

        // 3. Validasi Umur khusus Java Developer (minimal 20 tahun)
        if (rolePilihan.equalsIgnoreCase("Java Developer") && umur < 20) {
            throw new ValidasiException("Untuk posisi Java Developer, umur tidak boleh di bawah 20 tahun!");
        }

        // 4. Validasi Umur Umum: Tidak boleh di bawah 20 atau di atas 35 tahun

        if (umur < 20) {
            throw new ValidasiException("Umur tidak boleh di bawah 20 tahun!");
        }
        if (umur > 35) {
            throw new ValidasiException("Umur tidak boleh lebih dari 35 tahun!");
        }
    }
}