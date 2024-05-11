package QuanLiGiaoDich;

 class GiaoDichVang extends GiaoDich{
   private String LoaiVang;
   //phương thức khởi tạo không tham số
   public GiaoDichVang() {
	   super();
	   this.LoaiVang = "";
   }
   //phương thức khởi tạo có tham số
   public GiaoDichVang(int magiaodich,int soluong,String Ngaygd,double dongia,double thanhtien,String loaivang)
   {
	   super(magiaodich, soluong, Ngaygd, dongia, thanhtien);
	   this.LoaiVang = loaivang;
   }
public String getLoaiVang() {
	return LoaiVang;
}
public void setLoaiVang(String loaiVang) {
	LoaiVang = loaiVang;
}
   public void Nhap()
   {
	   super.nhap();
	   System.out.println("Nhập loại vàng: ");
	   LoaiVang = scanner.next();
   }
   public double TTien()
   {
	   return this.ThanhTien = this.DonGia * this.SoLuong;
   }
   public String toString() {
	   return "Giao dịch vàng: " + super.tostring() + ",  loại vàng: " + this.getLoaiVang() + 
			   ",  thành tiền: " + this.getThanhTien() + " ]";
   }
}
