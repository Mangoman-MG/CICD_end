package com.example.TH06627_16122025;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class songuyenTest {
    private songuyen sn;
    @BeforeEach
    public void setup(){
        sn = new songuyen();
    }
    @Test
    public void HL_trongphanvung(){
        int thucte = sn.kiemtrasonguyen(50);
        int mongmuong = 50;
        assertEquals(mongmuong,thucte);
    }
    @Test
    public void KHL_ngoaiphanvungduoi1(){
        assertThrows(IllegalArgumentException.class,()-> sn.kiemtrasonguyen(-10));
    }
    @Test
    public void KHL_ngoaiphanvungtren100(){
        assertThrows(IllegalArgumentException.class,()-> sn.kiemtrasonguyen(200));
    }
    @Test
    public void HL_bientren(){
        int thucte = sn.kiemtrasonguyen(1);
        int mongmuong = 1;
        assertEquals(mongmuong,thucte);
    }
    @Test
    public void HL_bienduoi(){
        int thucte = sn.kiemtrasonguyen(100);
        int mongmuong = 100;
        assertEquals(mongmuong,thucte);
    }
}