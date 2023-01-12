package TaiLieu01_Ba05;


import TaiLieu01_Ba05.XuLyDuLieu.XuLyPhuongThuc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        XuLyPhuongThuc xuLyPhuongThuc = new XuLyPhuongThuc();
        while (true) {
            System.out.println("1.them kh" + "\n" + "2.xuat ds" + "\n"
                    + "3.tong sl tung loai kh" + "\n" + "4.tinh tien kh nuoc ngoai" +
                    "\n" + "5.xuat ds cac hoa don thang 9 nam 2013");
            System.out.println("nhap : ");
            String choose = new Scanner(System.in).nextLine();
            switch (choose) {
                case "1":
                    xuLyPhuongThuc.themKH();
                    break;
                case "2":
                    xuLyPhuongThuc.xuatDsKH();
                    break;
                case "3":
                    xuLyPhuongThuc.tinhTongSLtungLoaiKH();
                    break;
                case "4":
                    xuLyPhuongThuc.tinhTBthanhTienCuaKHnuocNgoai();
                    break;
                case "5":
                    xuLyPhuongThuc.xuatCacHoaDonThang9Nam2013Cua2loaiKH();
                    break;
                default:
                    System.out.println("Sai lua chon");
                    break;
            }
        }
    }
}
