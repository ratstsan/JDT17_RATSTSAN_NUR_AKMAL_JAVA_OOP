package com.indivaragroup.inheritance.exam.company;

import java.math.BigDecimal;

class HeadHRD extends Employee {

    public HeadHRD(String nama, int umur) {
        super(nama, umur,
                new BigDecimal("25000000"),
                "HEAD HRD");
    }
}
