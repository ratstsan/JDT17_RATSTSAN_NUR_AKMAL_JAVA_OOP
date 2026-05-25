package com.indivaragroup.inheritance.exam.company;

import java.math.BigDecimal;

class SeniorEmployee extends Employee {

    public SeniorEmployee(String nama, int umur) {
        super(nama, umur,
                new BigDecimal("18000000"),
                "SENIOR MANAGER");
    }
}
