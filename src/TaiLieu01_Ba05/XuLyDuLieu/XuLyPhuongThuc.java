package TaiLieu01_Ba05.XuLyDuLieu;



import TaiLieu01_Ba05.DuLieu.KhachHangNuocNgoai;
import TaiLieu01_Ba05.DuLieu.KhachHangVN;
import TaiLieu01_Ba05.DuLieu.ThongTinKhachHang;
import TaiLieu01_Ba05.DuLieu.doiTuongKH;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class XuLyPhuongThuc extends PhuongThuc {
    LocalDate localDate;
    static ArrayList<ThongTinKhachHang> thongTinKhachHangArrayList = new ArrayList<>();

    static ArrayList<doiTuongKH> doiTuongKHArrayList = new ArrayList<>();

    @Override
    public void themKH() {
        System.out.println("ma kh : ");
        String maKH = new Scanner(System.in).nextLine();
        System.out.println("ho ten : ");
        String hoTen = new Scanner(System.in).nextLine();
        System.out.println("ngay ra hoa don : ");
        int ngay = new Scanner(System.in).nextInt();
        System.out.println("thang ra hoa don : ");
        int thang = new Scanner(System.in).nextInt();
        System.out.println("nam ra hoa don : ");
        int nam = new Scanner(System.in).nextInt();
        localDate = LocalDate.of(nam, thang, ngay);
        System.out.println("1.KHVN  2.KHNN");
        String choose = new Scanner(System.in).nextLine();
        switch (choose) {
            case "1":
                System.out.println("sinh hoat : ");
                String sinhHoat = new Scanner(System.in).nextLine();
                System.out.println("kinh doanh : ");
                String kinhDoanh = new Scanner(System.in).nextLine();
                System.out.println("san xuat : ");
                String sanXuat = new Scanner(System.in).nextLine();
                doiTuongKHArrayList.add(new doiTuongKH(sinhHoat, kinhDoanh, sanXuat));
                System.out.println("so luong kw : ");
                int soKW_vn = new Scanner(System.in).nextInt();
                System.out.println("don gia : ");
                int donGia_vn = new Scanner(System.in).nextInt();
                System.out.println("dinh muc : ");
                int dinhMuc = new Scanner(System.in).nextInt();
                ThongTinKhachHang thongTinKhachHangVN = new KhachHangVN(maKH, hoTen, localDate, doiTuongKHArrayList, soKW_vn, donGia_vn, dinhMuc);
                thongTinKhachHangArrayList.add(thongTinKhachHangVN);
                break;
            case "2":
                System.out.println("quoc tich : ");
                String quocTich = new Scanner(System.in).nextLine();
                System.out.println("so luong kw : ");
                int soKW_nn = new Scanner(System.in).nextInt();
                System.out.println("don gia : ");
                int donGia_nn = new Scanner(System.in).nextInt();
                ThongTinKhachHang thongTinKhachHangNN = new KhachHangNuocNgoai(maKH, hoTen, localDate, quocTich, soKW_nn, donGia_nn);
                thongTinKhachHangArrayList.add(thongTinKhachHangNN);
                break;
            default:
                break;
        }
    }

    @Override
    public void xuatDsKH() {
        for (int i = 0; i < thongTinKhachHangArrayList.size(); i++) {
            System.out.println(thongTinKhachHangArrayList.get(i));
        }
    }

    @Override
    public void tinhTongSLtungLoaiKH() {
        int count_vn = 0;
        int count_nn = 0;
        for (int i = 0; i < thongTinKhachHangArrayList.size(); i++) {
            if (thongTinKhachHangArrayList.get(i) instanceof KhachHangVN) {
                count_vn += 1;
            } else if (thongTinKhachHangArrayList.get(i) instanceof KhachHangNuocNgoai) {
                count_nn += 1;
            }
        }
        System.out.println("tong so khvn : " + count_vn + "\n"
                + "tong so khnn : " + count_nn);
    }

    @Override
    public void tinhTBthanhTienCuaKHnuocNgoai() {
        for (int i = 0; i < thongTinKhachHangArrayList.size(); i++) {
            if (thongTinKhachHangArrayList.get(i) instanceof KhachHangNuocNgoai) {
                int thanhTien = ((KhachHangNuocNgoai) thongTinKhachHangArrayList.get(i)).getSoLuongKW() * ((KhachHangNuocNgoai) thongTinKhachHangArrayList.get(i)).getDonGia();
                System.out.println(thongTinKhachHangArrayList.get(i) + " thanh tien : " + thanhTien);
            }
        }
    }

    @Override
    public void xuatCacHoaDonThang9Nam2013Cua2loaiKH() {
        for (int i = 0; i < thongTinKhachHangArrayList.size(); i++) {
            if (thongTinKhachHangArrayList.get(i).getNgayRaHoaDon().getMonthValue() == 9 || thongTinKhachHangArrayList.get(i).getNgayRaHoaDon().getYear() == 2013) {
                System.out.println(thongTinKhachHangArrayList.get(i));
            }
        }
    }
}
