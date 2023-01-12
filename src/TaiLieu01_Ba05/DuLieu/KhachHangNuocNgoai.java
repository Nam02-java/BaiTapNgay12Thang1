package TaiLieu01_Ba05.DuLieu;

import java.time.LocalDate;

public class KhachHangNuocNgoai extends ThongTinKhachHang {
    private String quocTich;
    private int soLuongKW, donGia;

    public KhachHangNuocNgoai(String maKH, String hoTen, LocalDate ngayRaHoaDon, String quocTich, int soLuongKW, int donGia) {
        super(maKH, hoTen, ngayRaHoaDon);
        this.quocTich = quocTich;
        this.soLuongKW = soLuongKW;
        this.donGia = donGia;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public int getSoLuongKW() {
        return soLuongKW;
    }

    public void setSoLuongKW(int soLuongKW) {
        this.soLuongKW = soLuongKW;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
}

