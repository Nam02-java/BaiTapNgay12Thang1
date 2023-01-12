package TaiLieu01_Bai04;

import java.time.LocalDate;

public class GiaoDichDat extends GiaoDichThongTin{

    private String loaiDat ;
    private int dienTich;

    public GiaoDichDat(String maGiaoDich, LocalDate thoiGianGiaoDich, int donGia, String loaiDat, int dienTich) {
        super(maGiaoDich, thoiGianGiaoDich, donGia);
        this.loaiDat = loaiDat;
        this.dienTich = dienTich;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }
}