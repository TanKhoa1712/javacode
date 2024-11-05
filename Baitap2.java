import java.util.Scanner;
public class Baitap2 {

	public static void main(String[] args) 
	{
		float x;
		Scanner nhap= new Scanner(System.in);
		System.out.print("Nhap vao he so a");
		int a= nhap.nextInt();
		System.out.print("Nhap vao he so b");
		int b= nhap.nextInt();
		if(a==0&&b!=0)
		{
			System.out.print("phuong trinh vo nghiem");
		}
		else
		{
			if(a==0&&b==0)
			{
				System.out.print("phuong trinh co vo so nghiem");
			}
			else
			{
			x=(float)-b/a;
			System.out.print("Phuong trinh co nghiem duy nhat la"+x);
			}
		}
		nhap.close();
	}

}
