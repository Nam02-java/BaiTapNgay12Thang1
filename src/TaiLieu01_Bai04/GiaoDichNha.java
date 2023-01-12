package TaiLieu01_Bai04;

import java.time.LocalDate;

public class GiaoDichNha extends GiaoDichThongTin{
    private String loaiNha, diaChi;
    private int dienTich;

    public GiaoDichNha(String maGiaoDich, LocalDate thoiGianGiaoDich, int donGia, String loaiNha, String diaChi, int dienTich) {
        super(maGiaoDich, thoiGianGiaoDich, donGia);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
        this.dienTich = dienTich;
    }
}
