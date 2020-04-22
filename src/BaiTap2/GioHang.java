/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;
import java.util.ArrayList;
/**
 *
 * @author Asus
 */
public class GioHang 
{
    IThanhToan hinhThucTT;
    ArrayList<HangHoa> dshh = new ArrayList<>();
    int tienHang = 0;
    public void setHinhThucTT(IThanhToan hinhThucTT)
    {
        this.hinhThucTT = hinhThucTT;
    }
    
    public void themHH(HangHoa hanghoa)
    {
        dshh.add(hanghoa);        
    }
    public int tienHangGoc(){
        for(int i=0;i<dshh.size();i++){
           tienHang += dshh.get(i).getGia();
       }
        return tienHang;
    }
    public double thanhToan()
    {
       return hinhThucTT.thanhToan(tienHang);
    }

    public void hienThiGioHang()
    {
        for(int i=0;i<dshh.size();i++)
        {
            dshh.get(i).hienThiHangHoa();
        }
    }
}






