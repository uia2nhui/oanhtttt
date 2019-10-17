package bai5;

abstract class DiemHP {
    protected String tenHP;
    protected int soTinChi;
    
    public DiemHP(String tenHP, int soTC) {
        this.tenHP= tenHP;
        soTinChi= soTC;
    }
    
    public String layTenHP() {
        return tenHP;
    }
    
    public int laySoTinChi() {
        return soTinChi;
    }
    
    abstract double tinhDiem();
}



