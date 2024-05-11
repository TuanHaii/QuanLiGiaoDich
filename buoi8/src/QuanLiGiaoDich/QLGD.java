package QuanLiGiaoDich;

import java.util.Scanner;

public class QLGD {

	public static void main(String[] args) {
		ListGD gd = new ListGD();
		Scanner c = new Scanner(System.in);
		int x;
		do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Chọn các mục: ");
			System.out.println("\t\t|0. Thoát ứng dụng                                 |");
			System.out.println("\t\t|1. Thêm giao dịch vàng                            |");
			System.out.println("\t\t|2. Thêm giao dịch tiền tệ                         |");
			System.out.println("\t\t|3. Hiển thị danh sách giao dịch                   |");
			System.out.println("\t\t|4. Xem tổng số lượng giao dịch                    |");
			System.out.println("\t\t|5. Xem trung bình giao dịch tiền tệ               |");
			System.out.println("\t\t|6. hiển thị danh sách giao dịch có đơn giá > 1 tỷ |");
			System.out.println("----------------------------------------------------------------");
			x=c.nextInt();
            switch(x) {		
            case 1 :
            	gd.ThemGD(x);
            	break;
            case 2 : 
            	gd.ThemGD(x);
                break;
            case 3:
            	gd.HienThiGD();
            	break;
            case 4:
            	gd.SumGD();
            	break;
            case 5:
            	gd.Trungbinhgdtt();
            	break;
            case 6:
            	gd.Giaodich1ty();
            	break;
            }
		}while(x!=0);
		System.out.println(" ");
	}
}
