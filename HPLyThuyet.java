package bai5;

class HPLyThuyet extends DiemHP {
    private double chuyenCan;
    private double giuaKy;
    private double cuoiKy;
    
    public HPLyThuyet(String tenHP, int soTinChi, double chuyenCan, double giuaKy, double cuoiKy) {
        super(tenHP, soTinChi);
        this.chuyenCan= chuyenCan;
        this.giuaKy= giuaKy;
        this.cuoiKy= cuoiKy;
    }

    public double tinhDiem() {
        return (chuyenCan*0.1+giuaKy*0.2+cuoiKy*0.7);
    }
    
}
