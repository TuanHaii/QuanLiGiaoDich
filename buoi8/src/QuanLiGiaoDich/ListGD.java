package QuanLiGiaoDich;

public class ListGD {
   GiaoDich GD[] = new GiaoDich[100];//sử dụng cấu trúc mãng
   private int CountGD,sum1=0,sum2=0,dem=0,sumtien=0;//tổng số lượng từng loai
   public ListGD() {//thêm giao dịch
	   CountGD = 0;
	   for(int i = 0; i < 100;i++)
		   GD[i] = new GiaoDich();
   }
   public void ThemGD(int temp) {
	   if(CountGD > 100) System.out.println("Bộ nhớ full, không thể thêm mới");
	   else
	   {
		   if(temp == 1) {
			   GD[CountGD] = new GiaoDichVang();//gán vào phần tử trong mãng
			   GiaoDichVang gdv = new GiaoDichVang();
			   gdv.Nhap();
			   gdv.ThanhTien = gdv.TTien();
			   GD[CountGD] = gdv;
			   sum1+=gdv.SoLuong;//tính tổng số lượng giao dịch
		   }
		   else {
			   GD[CountGD] = new GiaoDichTienTe();
			   GiaoDichTienTe gdtt = new GiaoDichTienTe();
			   gdtt.nhap();
			   gdtt.ThanhTien = gdtt.TTien();
			   GD[CountGD] = gdtt;
			   sumtien+=gdtt.ThanhTien;
			   sum2+=gdtt.SoLuong;
			   dem++;
		   }
		   CountGD ++;
	   }
   }
   public void HienThiGD() {
	   for(int i =0;i < CountGD;i++) {
		   System.out.println("STT: "+(i+1));
		   System.out.println(GD[i].tostring());
	   }
   }
   // tổng số lượng giao dịch
   public void SumGD() {
	   System.out.println("Tổng số lượng giao dịch vàng: "+sum1);
	   System.out.println("Tổng số lượng giao dịch tiền tệ: "+sum2);
   }
   public void Trungbinhgdtt() {
	   System.out.println("Trung bình thành tiền giao dịch tiền tệ: "+ (sumtien/dem));
   }
   public void Giaodich1ty() {
	   int d = 0;
	   for(int i =0; i < CountGD;i++)
	   {
		   if(GD[i].DonGia > 1000000000) 
		   {
			   System.out.println("Giao dịch hơn 1 tỷ: "+GD[i].tostring());
			   d++;
		   }
	   }
	   if(d==0)System.out.println("Không có giao dịch hơn 1 tỷ");

   }
}
