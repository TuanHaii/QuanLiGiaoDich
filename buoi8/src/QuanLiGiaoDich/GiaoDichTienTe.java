package QuanLiGiaoDich;

class GiaoDichTienTe extends GiaoDich{
    private double TiGia;
    private int LoaiTienTe;
    public GiaoDichTienTe() {
    	super();
    	this.TiGia = 0;
    	this.LoaiTienTe = 0;
    }
    public GiaoDichTienTe(int magiaodich,int soluong,String Ngaygd,double dongia,
    		double thanhtien, double tigia,int Loaitiente) {
    	super(magiaodich, soluong, Ngaygd, tigia, thanhtien);
    	TiGia = tigia;
    	LoaiTienTe = Loaitiente;
    }
	public double getTiGia() {
		return TiGia;
	}
	public void setTiGia(double tiGia) {
		TiGia = tiGia;
	}
	public int getLoaiTienTe() {
		return LoaiTienTe;
	}
	public void setLoaiTienTe(int loaiTienTe) {
		LoaiTienTe = loaiTienTe;
	}
    public void nhap() {
    	super.nhap();
    	System.out.println("Nhập tỉ giá: ");
    	TiGia = scanner.nextDouble();
    	System.out.println("Nhập loại tiền tệ: 1.VND\t2.EURO\t3.USD ");
    	LoaiTienTe = scanner.nextInt();
    }
    public double TTien() {
    	if(LoaiTienTe == 1)
    		this.ThanhTien = this.SoLuong * this.DonGia;
    	else
    		this.ThanhTien = this.DonGia * this.SoLuong * this.TiGia;
    	return this.ThanhTien;
    }
    public String ToString() {
    	String temp;
    	if(LoaiTienTe == 1)
    		temp = "VND";
    	else if(LoaiTienTe == 2)
    		temp = " Euro";
    	else
    		temp = "USD";
    	return "Giao dịch tiền tệ: " + super.tostring() + ",  loại tiền tệ: "+temp 
    			+ ",  Tỉ giá: " + TiGia + " ]";
    }
}