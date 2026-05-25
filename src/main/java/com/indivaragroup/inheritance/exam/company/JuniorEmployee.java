package com.indivaragroup.inheritance.exam.company;

import java.math.BigDecimal;

class JuniorEmployee extends Employee {

    public JuniorEmployee(String nama, int umur) {
        super(nama, umur,
                new BigDecimal("5000000"),
                "JUNIOR STAFF");
    }
}