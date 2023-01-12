package TaiLieu01_Ba05.DuLieu;

public class doiTuongKH {
    private String sinhHoat, kinhDoanh, sanXuat;

    public doiTuongKH(String sinhHoat, String kinhDoanh, String sanXuat) {
        this.sinhHoat = sinhHoat;
        this.kinhDoanh = kinhDoanh;
        this.sanXuat = sanXuat;
    }

    public String getSinhHoat() {
        return sinhHoat;
    }

    public void setSinhHoat(String sinhHoat) {
        this.sinhHoat = sinhHoat;
    }

    public String getKinhDoanh() {
        return kinhDoanh;
    }

    public void setKinhDoanh(String kinhDoanh) {
        this.kinhDoanh = kinhDoanh;
    }

    public String getSanXuat() {
        return sanXuat;
    }

    public void setSanXuat(String sanXuat) {
        this.sanXuat = sanXuat;
    }
}
