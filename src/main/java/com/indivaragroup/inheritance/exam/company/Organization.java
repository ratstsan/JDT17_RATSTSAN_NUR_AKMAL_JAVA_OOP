package com.indivaragroup.inheritance.exam.company;

public class Organization {
    public static void main(String[] args) {

        System.out.println("PT JDT 17 MAJU SEJAHTERA MANDIRI");
        System.out.println("STRUKTUR ORGANISASI PERUSAHAAN");

        // object
        JuniorEmployee k1 = new JuniorEmployee("Budi", 22);
        MiddleEmployee k2 = new MiddleEmployee("Andi", 30);
        SeniorEmployee k3 = new SeniorEmployee("Siti", 40);
        HeadHRD k4 = new HeadHRD("Rina", 58);

        // polymorphism interface
        InfoKaryawan[] dataKaryawan = {k1, k2, k3, k4};

        // looping
        for (InfoKaryawan karyawan : dataKaryawan) {
            karyawan.tampilkanData();
        }
    }
}
