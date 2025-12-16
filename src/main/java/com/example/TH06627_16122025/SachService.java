package com.example.TH06627_16122025;

public class SachService {
    public boolean sua(String ma, sach newsach){
        if (newsach==null){
            throw new IllegalArgumentException("chua dien sach moi");
        }
        if (!ma.equals(newsach.getMaSach())){
            throw new IllegalArgumentException("khong co ma nay");
        }if (ma.isEmpty()||newsach.getTenSach().isEmpty() || newsach.getTacGia().isEmpty()){
            throw new IllegalArgumentException("khong duoc de trong");
        }if (newsach.getNamXuatBan() < 1990 || newsach.getNamXuatBan() > 2025){
            throw new IllegalArgumentException("nam xuat ban chi tu 1990 den 2025");
        }
        return true;
    }
}
