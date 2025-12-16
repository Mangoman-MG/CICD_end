package com.example.TH06627_16122025;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SachServiceTest {
    private SachService ss;
    @BeforeEach
    public void setup(){
        ss = new SachService();
    }
    @Test
    public void suaHL(){
        sach s = new sach("ABC1","Giao trinh","IDK",2000,500000f);
        assertTrue(ss.sua("ABC1",s));
    }
    @Test
    public void suaKHLnamXBngoaiphanvung1(){
        sach s = new sach("ABC1","Giao trinh","IDK",1000,500000f);
        assertThrows (IllegalArgumentException.class,()-> ss.sua("ABC1",s));
    }
    @Test
    public void suaKHLnamXBngoaiphanvung2(){
        sach s = new sach("ABC1","Giao trinh","IDK",3000,500000f);
        assertThrows (IllegalArgumentException.class,()-> ss.sua("ABC1",s));
    }
    @Test
    public void suaKHLtrongma(){
        sach s = new sach("ABC1","Giao trinh","IDK",3000,500000f);
        assertThrows (IllegalArgumentException.class,()-> ss.sua("",s));
    }
    @Test
    public void suaKHLtrong(){
        assertThrows (IllegalArgumentException.class,()-> ss.sua("AB01",null));
    }
}