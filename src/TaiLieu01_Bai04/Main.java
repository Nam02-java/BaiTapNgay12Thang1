package TaiLieu01_Bai04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        XuLyPhuongThuc xuLyPhuongThuc = new XuLyPhuongThuc();
        while (true) {
            System.out.println("1.nhap giao dich" + "\n" + "2.xuat ds giao dich"
                    + "\n" + "3.tinh tong so luong cho tung loai" + "\n" + "4.tinh trung binh thanh tien cua giao dich dat"
                    + "\n" + "5.xuat ra cac giao dich cua thang 9 nam 2013");
            System.out.println("Nhap : ");
            String choose = new Scanner(System.in).nextLine();
            switch (choose) {
                case "1":
                    xuLyPhuongThuc.themGiaoDich();
                    break;
                case "2":
                    xuLyPhuongThuc.xuatDSgiaoDich();
                    break;
                case "3":
                    xuLyPhuongThuc.tinhTongSoLuongTungLoai();
                    break;
                case "4":
                    System.out.println("ma GD : ");
                    String maGD = new Scanner(System.in).nextLine();
                    xuLyPhuongThuc.tinhTBthanhTienCuaGDdat(maGD);
                    break;
                case "5":
                    System.out.println("tat ca giao dich thang 9 nam 2013");
                    xuLyPhuongThuc.giaoDichThang9Nam2013();
                    break;
                default:
                    System.out.println("sai lua chon");
                    break;
            }
        }
    }
}