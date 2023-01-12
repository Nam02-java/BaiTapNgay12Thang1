package TaiLieu01_Ba05.DuLieu;

import java.time.LocalDate;

public class ThongTinKhachHang {
    private String maKH;
    private String hoTen;
    private LocalDate ngayRaHoaDon;

    public ThongTinKhachHang(String maKH, String hoTen, LocalDate ngayRaHoaDon) {
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(LocalDate ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    @Override
    public String toString() {
        return "ThongTinKhachHang{" +
                "maKH='" + maKH + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngayRaHoaDon=" + ngayRaHoaDon +
                '}';
    }
}