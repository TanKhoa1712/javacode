import java.util.Scanner;
public class Tinh_phuong_trinh_bac_2 {

	public static void main(String[] args)
	{
		float x1,x2;
		Scanner nhap= new Scanner(System.in);
		System.out.print("Nhap vao he so a\n");
		int a= nhap.nextInt();
		System.out.print("Nhap vao he so b\n");
		int b= nhap.nextInt();
		System.out.print("Nhap vao he so c\n");
		int c= nhap.nextInt();
		if(a==0)
		{
			x1=(float)-c/b;
			System.out.print("\nNghiem duy nhat la "+x1);
		}
		else
		{
			if(Math.sqrt(b*b-4*a*c)>0)
			{
				x1=(float)(-b+Math.sqrt(b*b-4*a*c))/2*a;
				x2=(float)(-b-Math.sqrt(b*b-4*a*c))/2*a;
				System.out.print("\nPhuong trinh co hai nghiem x1= "+x1+"x2= "+x2);
			}
			else
			{
				if(Math.sqrt(b*b-4*a*c)==0)
				{
					x1=(float)(-b/(2*a));
					System.out.append("\nPhuong trinh co nghiem kep x1 = x2 = "+x1);
				}
			}
		}
		nhap.close();
	}

}
