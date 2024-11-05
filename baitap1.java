import java.util.Scanner;
public class baitap1 {

	public static void main(String[] args) {
			Scanner nhap= new Scanner(System.in);
			System.out.print("Nhap vao so a");
			int a= nhap.nextInt();
			System.out.print("Nhap vao so b");
			int b= nhap.nextInt();
			System.out.print("Nhap vao so c");
			int c= nhap.nextInt();
			System.out.print("So lon nat la ");
			if(a>b&&a>c)
			{
				System.out.print(a);
			}
			else
			{
				if(b>a&&b>c)
					{
					System.out.print(b);	
					}
				else
					{
					System.out.print(c);
					}
					
			}
			
			
			nhap.close();
			}
	}

