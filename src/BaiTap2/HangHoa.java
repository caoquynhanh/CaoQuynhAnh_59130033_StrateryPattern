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
public class HangHoa 
{
    private String tenHH;
    private int gia;
    private String moTa;

    public HangHoa(String tenHH, int gia, String moTa) 
    {
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }

    public HangHoa() 
    {}
    public String getTenHH() 
    {
        return tenHH;
    }
    public void setTenHH(String tenHH) 
    {
        this.tenHH = tenHH;
    }
    public int getGia() 
    {
        return gia;
    }
    public void setGia(int gia) 
    {
        this.gia = gia;
    }
    public String getMoTa() 
    {
        return moTa;
    }
    public void setMoTa(String moTa) 
    {
        this.moTa = moTa;
    }
     
}
