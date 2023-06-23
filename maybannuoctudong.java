import java.util.Scanner;
public class maybannuoctudong {

	public static void main(String[] args) {
		{ Scanner sc = new Scanner(System.in);
		int loại;
		double tiền=0;
		System.out.println("  Chao mung quy khach!");
		System.out.println(" Chung toi co cac mat hang sau:");
		System.out.println(" Loại 1Coca cola (6.000vnd)");
		System.out.println(" Loại 2 Tra xanh (10.000vnd)");
		System.out.println(" Loại 3 Sting (6.000vnd)");
		System.out.println(" Loại 4 Fresh milk (5.000vnd)");
		System.out.println(" Loại 5 Fresh water (4.000vnd)");
		do {
		System.out.println("Moi ban chon loại:");
		loại=sc.nextInt();
		if(loại==1||loại==2||loại==3||loại==4||loại==5)
			do {
		System.out.println("Moi quy khach nhap so tien:");
		tiền=sc.nextDouble();
			}while(tiền<=4000);
		switch(loại)
		{
		case 1:
		if(tiền <6000)
			System.out.println("So tien cua ban ko du mua coca cola");
		else
			System.out.println("Ban da mua coca cola!");
		    System.out.println(" Số tiền dư " + "tienthua =" + (tiền-6000));
		break;
		case 2:
		if(tiền<10000)
			System.out.println("So tien cua ban khong du mua tra xanh");
		else
			System.out.println(" Ban da mua tra xanh!");
		    System.out.println(" Số tiền dư " + "tienthua =" + (tiền-10000));
		break;
		case 3:
		if(tiền<6000)
		{
			System.out.println("So tien cua ban khong du mua sting");
		}
		else
			System.out.println("Ban da mua sting!");
		    System.out.println(" Số tiền dư " + "tienthua =" + (tiền-6000));
		break;
		case 4:
		if(tiền<5000)
			System.out.println("So tien cua ban khong du mua fresh milk");
		else
			System.out.println("Ban da mua fresh milk!");
		    System.out.println(" Số tiền dư " + "tienthua =" + (tiền-5000));
		break;
		case 5:
		if(tiền<4000)
			System.out.println("So tien cua ban khong du mua nuoc khoang");
		else
			System.out.println("Ban mua nuoc khoang!");
		     System.out.println(" Số tiền dư " + "tienthua =" + (tiền-4000));
		break;
		default:
			System.out.println("Ban nhap ma sai, xin moi nhap lai tu 1 den 5");
		}
		}while(loại!=6);
		
	   }
	}

}
