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
public class ThanhToanOnline implements IThanhToan
{

    @Override
    public double thanhToan(int tienHang) 
    {
        if(tienHang<1000000) return tienHang - tienHang*5/100;
        return tienHang - tienHang*7/100;
    }   
}
