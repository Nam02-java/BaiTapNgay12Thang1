package TaiLieu01_Ba05.DuLieu;

import java.time.LocalDate;
import java.util.ArrayList;

public class KhachHangVN extends ThongTinKhachHang {
    private ArrayList<doiTuongKH> doiTuongKHArrayList ;

    private int soLuongKW , donGia , dinhMuc;

    public KhachHangVN(String maKH, String hoTen, LocalDate ngayRaHoaDon, ArrayList<doiTuongKH> doiTuongKHArrayList, int soLuongKW, int donGia, int dinhMuc) {
        super(maKH, hoTen, ngayRaHoaDon);
        this.doiTuongKHArrayList = doiTuongKHArrayList;
        this.soLuongKW = soLuongKW;
        this.donGia = donGia;
        this.dinhMuc = dinhMuc;
    }
}
