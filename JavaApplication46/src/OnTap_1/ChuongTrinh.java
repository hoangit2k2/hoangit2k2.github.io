package OnTap_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class ChuongTrinh {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        NhanVien[] arr = new NhanVien[10];
        int i = 0;
        String flag;
        do {
            System.out.println("Nhập mã: ");
             sc = new Scanner(System.in);
            String ma = sc.nextLine();
            System.out.println("Nhập Họ và Tên: ");
             sc = new Scanner(System.in);
            String ten = sc.nextLine();
            System.out.println("Nhập Ngày Sinh : ");
             sc = new Scanner(System.in);
            Date ns = sdf.parse(sc.nextLine());
            System.out.println("Nhập LuongCB: ");
              sc = new Scanner(System.in);
            double luong= sc.nextFloat();
            arr[i] = new NhanVien();
            arr[i].setMaNV(ma);
            arr[i].setHoTen(ten);
            arr[i].setNs(ns);
            arr[i].setLuongCB(luong);
            System.out.printf("%-25s|%-30s|%20s|%10.1f\n",
                    arr[i].getMaNV(),
                    arr[i].getHoTen(),
                    sdf.format(arr[i].getNs()),
                    arr[i].getLuongCB());
            i++;
            System.out.println("Tiếp Tục ? Y OR N");
             sc = new Scanner(System.in);
             flag = sc.nextLine();
             if(!flag.equalsIgnoreCase("Y"))
                 break;
        } while (true);

    }
}
