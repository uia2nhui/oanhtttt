package bai5;
class SinhVien{
	private String hoTen;
	private DiemHP hp1,hp2;
	
	public SinhVien(String ten, DiemHP hp1, DiemHP hp2) {
		hoTen = ten;
		this.hp1 = hp1;
		this.hp2 = hp2;
	}
	
	public double tinhDTB() {
		return(hp1.tinhDiem() *hp1.laySoTinChi()+
				hp2.tinhDiem()*hp2.laySoTinChi())
				/(hp1.laySoTinChi() + hp2.laySoTinChi());
	}
	
	
	public String toString() {
        return hoTen + ", Ðiem HP1: " + hp1.tinhDiem() + ", Ðiem HP2: " + hp2.tinhDiem() + ", Ðiem TB: "+tinhDTB();
	}
}
	