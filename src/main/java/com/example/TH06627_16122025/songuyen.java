package com.example.TH06627_16122025;

public class songuyen {
    public int kiemtrasonguyen(int a){
        if (a<1 || a>100){
            throw new IllegalArgumentException("a phai la tu 1 den 100");
        }
        return a;
    }
}
