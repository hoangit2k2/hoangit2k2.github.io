package OnTap_1;

import java.util.Date;

public class NhanVien { 
    private  String maNV;
    private String hoTen;
    private Date ns;
    private double luongCB;

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNs(Date ns) {
        this.ns = ns;
    }

    public void setLuongCB(double luongCB) {
        if(luongCB < 0)   return ;
        this.luongCB = luongCB;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Date getNs() {
        return ns;
    }

    public double getLuongCB() {
     
        
        return luongCB;
    }
    public void xuatThongTin(){
        System.out.printf("&10s | %20s | % 10s | %10.1f",maNV,hoTen,ns,luongCB);
    }

 
    
    
}
