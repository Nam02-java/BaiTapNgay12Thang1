package TaiLieu01_Bai04;

import java.time.LocalDate;

public class GiaoDichThongTin {
    private String maGiaoDich;
    private LocalDate thoiGianGiaoDich;
    private int donGia;

    public GiaoDichThongTin(String maGiaoDich, LocalDate thoiGianGiaoDich, int donGia) {
        this.maGiaoDich = maGiaoDich;
        this.thoiGianGiaoDich = thoiGianGiaoDich;
        this.donGia = donGia;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public LocalDate getThoiGianGiaoDich() {
        return thoiGianGiaoDich;
    }

    public void setThoiGianGiaoDich(LocalDate thoiGianGiaoDich) {
        this.thoiGianGiaoDich = thoiGianGiaoDich;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "GiaoDichThongTin{" +
                "maGiaoDich='" + maGiaoDich + '\'' +
                ", thoiGianGiaoDich=" + thoiGianGiaoDich +
                ", donGia=" + donGia +
                '}';
    }
}
