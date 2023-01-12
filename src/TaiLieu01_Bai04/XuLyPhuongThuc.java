package TaiLieu01_Bai04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class XuLyPhuongThuc extends PhuongThuc {
    static ArrayList<GiaoDichThongTin> giaoDichThongTinArrayList = new ArrayList<>();
    static LocalDate thoiGianGD;

    @Override
    public void themGiaoDich() {
        System.out.println("ma GD : ");
        String maGD = new Scanner(System.in).nextLine();
        System.out.println("ngay GD : ");
        int ngayGD = new Scanner(System.in).nextInt();
        System.out.println("thang GD : ");
        int thangGD = new Scanner(System.in).nextInt();
        System.out.println("nam GD : ");
        int namGD = new Scanner(System.in).nextInt();
        thoiGianGD = LocalDate.of(namGD, thangGD, ngayGD);
        System.out.println("don gia : ");
        int donGia = new Scanner(System.in).nextInt();
        System.out.println("1.loai dat  2.loai nha");
        String choose = new Scanner(System.in).nextLine();
        switch (choose) {
            case "1":
                System.out.println("1.loaiA  2.loaiB  3.loaiC");
                String loaiDat = new Scanner(System.in).nextLine();
                System.out.println("dien tich : ");
                int dienTich_dat = new Scanner(System.in).nextInt();
                GiaoDichThongTin giaoDichThongTin_dat = new GiaoDichDat(maGD, thoiGianGD, donGia, loaiDat, dienTich_dat);
                giaoDichThongTinArrayList.add(giaoDichThongTin_dat);
                break;
            case "2":
                System.out.println("1.cao cap   2.thuong");
                String loaiNha = new Scanner(System.in).nextLine();
                System.out.println("dia chi : ");
                String diaChi = new Scanner(System.in).nextLine();
                System.out.println("dien tich : ");
                int dienTich_nha = new Scanner(System.in).nextInt();
                GiaoDichThongTin giaoDichThongTin_nha = new GiaoDichNha(maGD, thoiGianGD, donGia, loaiNha, diaChi, dienTich_nha);
                giaoDichThongTinArrayList.add(giaoDichThongTin_nha);
                break;
            default:
                System.out.println("sai lua chon");
                break;
        }
    }

    @Override
    public void xuatDSgiaoDich() {
        for (int i = 0; i < giaoDichThongTinArrayList.size(); i++) {
            System.out.println(giaoDichThongTinArrayList.get(i));
        }
    }

    @Override
    public void tinhTongSoLuongTungLoai() {
        int count_loaiDat = 0;
        int count_loaiNha = 0;
        for (int i = 0; i < giaoDichThongTinArrayList.size(); i++) {
            if (giaoDichThongTinArrayList.get(i) instanceof GiaoDichDat) {
                count_loaiDat += 1;
            } else if (giaoDichThongTinArrayList.get(i) instanceof GiaoDichNha) {
                count_loaiNha += 1;
            }
        }
        System.out.println("so luong loai dat : " + count_loaiDat);
        System.out.println("\n" + "so luong loai nha : " + count_loaiNha);
    }

    @Override
    public void tinhTBthanhTienCuaGDdat(String maGD) {
        for (int i = 0; i < giaoDichThongTinArrayList.size(); i++) {
            if (giaoDichThongTinArrayList.get(i).getMaGiaoDich().equalsIgnoreCase(maGD)) {
                if (giaoDichThongTinArrayList.get(i) instanceof GiaoDichDat) {
                    if (((GiaoDichDat) giaoDichThongTinArrayList.get(i)).getLoaiDat().equalsIgnoreCase("A")) {
                        double thanhTien = ((GiaoDichDat) giaoDichThongTinArrayList.get(i)).getDienTich() * giaoDichThongTinArrayList.get(i).getDonGia() * 1.5;
                        System.out.println("gia dat A : " + thanhTien);
                    } else {
                        double thanhTien = ((GiaoDichDat) giaoDichThongTinArrayList.get(i)).getDienTich() * giaoDichThongTinArrayList.get(i).getDonGia();
                        System.out.println("gia dat B & C : " + thanhTien);
                    }
                }
            }
        }
    }

    @Override
    public void giaoDichThang9Nam2013() {
        for (int i = 0; i < giaoDichThongTinArrayList.size(); i++) {
            if (giaoDichThongTinArrayList.get(i).getThoiGianGiaoDich().getMonthValue() == 9 || giaoDichThongTinArrayList.get(i).getThoiGianGiaoDich().getYear() == 2013) {
                System.out.println(giaoDichThongTinArrayList.get(i));
            }
        }
    }
}