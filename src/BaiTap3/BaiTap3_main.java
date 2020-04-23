/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Collections;
import BaiTap3.QLSV;
import java.text.ParseException;
/**
 *
 * @author Asus
 */
public class BaiTap3_main 
{
    public static void main(String[] args) throws ParseException
    {
        QLSV qldsSV = new QLSV();
        SinhVien sv1 = new SinhVien("Chung Thanh Phong",new SimpleDateFormat("dd/MM/yy").parse("21/02/1987"),7);
        SinhVien sv2 = new SinhVien("Ly Quy Khanh",new SimpleDateFormat("dd/MM/yy").parse("22/03/1988"),6);
        SinhVien sv3 = new SinhVien("Le Thao Nhi",new SimpleDateFormat("dd/MM/yy").parse("23/04/1995"),9);
        
        qldsSV.themSV(sv1);
        qldsSV.themSV(sv2);
        qldsSV.themSV(sv3);
        
        System.out.print("Danh sach sinh vien duoc khoi tao: ");
        qldsSV.inDS();
        
        ISoSanh ssSinhVienTheoDiem = new SoSanhTheoDiem();
        ISoSanh ssSinhVienTheoTen = new SoSanhTheoTen();
        
        qldsSV.setSoSanh(ssSinhVienTheoDiem);
        qldsSV.sapXep();
        System.out.println("Danh sach sinh vien duoc sap xep theo ten: ");
        qldsSV.inDS();
        
        qldsSV.setSoSanh(ssSinhVienTheoTen);
        qldsSV.sapXep();
        System.out.println("Danh sach sinh vien duoc sap xep theo diem: ");
        qldsSV.inDS();
    }
}
