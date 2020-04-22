/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author Asus
 */
public class BaiTap2_main 
{
    public static void main(String[] args) 
    {
        GioHang giohang1 = new GioHang();
        HangHoa hh1 = new HangHoa("Nuoc Pocari Sweat",800000,"Nuoc uong the thao");
        HangHoa hh2 = new HangHoa("Nuoc Monster",1000000,"Nuoc uong tang luc");          
        HangHoa hh3 = new HangHoa("Nuoc Sting",1200000,"Nuoc uong giai khat");
        
        GioHang giohang2 = new GioHang();  
        HangHoa hh4 = new HangHoa("Tra o long Tea Plus",1500000,"Tra giam can");
        HangHoa hh5 = new HangHoa("Nuoc Fanta",2700000,"Nuoc uong giai khat");   
        HangHoa hh6 = new HangHoa("Nuoc 7up",2700000,"Nuoc uong giai khat"); 
        
        giohang1.setHinhThucTT(new ThanhToanOnline());
        giohang2.setHinhThucTT(new ThanhToanCOD());  
        
        giohang1.themHH(hh1);
        giohang1.themHH(hh2);
        giohang1.themHH(hh3);        
        giohang2.themHH(hh4);
        giohang2.themHH(hh5);
        giohang2.themHH(hh6);
        
        System.out.println("Thong tin cua gio hang 1: ");
        System.out.println("Danh sach hang hoa trong gio hang 1: ");
        giohang1.hienThiGioHang();
        System.out.println("Tong tien hang: "+giohang1.thanhToan());
        System.out.println("Tong so tien khach phai tra: "+giohang1.thanhToan());      
        System.out.println("Thong tin cua gio hang 2: ");
        System.out.println("Danh sach hang hoa trong gio hang 2: ");
        giohang2.hienThiGioHang();
        System.out.println("Tong tien hang hoa: "+giohang2.thanhToan());
        System.out.println("Tong so tien khach phai tra: "+giohang2.thanhToan());
    }    
}
