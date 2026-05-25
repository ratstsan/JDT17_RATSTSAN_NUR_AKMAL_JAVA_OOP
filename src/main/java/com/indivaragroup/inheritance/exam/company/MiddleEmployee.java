package com.indivaragroup.inheritance.exam.company;

import java.math.BigDecimal;

class MiddleEmployee extends Employee {

    public MiddleEmployee(String nama, int umur) {
        super(nama, umur,
                new BigDecimal("10000000"),
                "MIDDLE STAFF");
    }
}