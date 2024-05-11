package QuanLiGiaoDich;

import java.util.Scanner;

public class GiaoDich {
  protected int MaGiaoDich;
  protected int SoLuong;
  protected String NgayGD;
  protected double DonGia,ThanhTien;
  Scanner scanner = new Scanner(System.in);
  //phuơng thức khởi tạo không tham số
  protected GiaoDich() {
	this.DonGia = 0;
	this.MaGiaoDich= 0;
	this.NgayGD = "";
	this.SoLuong = 0;
	this.ThanhTien = 0;
}
  //phương thức khởi tạo có tham số
  protected GiaoDich(int MGD,int SL,String Ngaygd,double dg,double thanhtien) {
	this.DonGia = dg;
	this.MaGiaoDich = MGD;
	this.NgayGD = Ngaygd;
	this.SoLuong = SL;
	this.ThanhTien = thanhtien;
	}
protected int getMaGiaoDich() {
	return MaGiaoDich;
}
protected void setMaGiaoDich(int maGiaoDich) {
	MaGiaoDich = maGiaoDich;
}
protected int getSoLuong() {
	return SoLuong;
}
protected void setSoLuong(int soLuong) {
	SoLuong = soLuong;
}
protected double getDonGia() {
	return DonGia;
}
protected void setDonGia(double donGia) {
	DonGia = donGia;
}
protected double getThanhTien() {
	return ThanhTien;
}
protected void setThanhTien(double thanhTien) {
	ThanhTien = thanhTien;
}
protected void nhap() {
	System.out.println("Mã giao dịch: ");
	MaGiaoDich = scanner.nextInt();
	System.out.println("Nhập ngày giao dịch: ");
	NgayGD = scanner.next();
	System.out.println("Nhập đơn giá: ");
	DonGia = scanner.nextDouble();
	System.out.println("Nhập số lượng: ");
	SoLuong = scanner.nextInt();
	
}
  public String tostring() {
	  return "[ MaGD= " + MaGiaoDich + ",  Soluong = " + SoLuong +",  Ngay GD: " + NgayGD 
			  + ",   DonGia: " + DonGia;
  }
}
