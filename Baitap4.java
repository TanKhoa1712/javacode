import java.util.Scanner;
public class Baitap4 {

	public static void main(String[] args)
	{
	System.out.print("Nhap vao so nguyen can tinh gia thua \n");
	Scanner nhap =new Scanner(System.in);
	int n = nhap.nextInt();
	float giaithua=1;
	for(int i=1; i<=n; i++)
	{
		giaithua = giaithua*i;
	}
	System.out.print("Giai thua cua N la: "+giaithua);
	nhap.close();
	}

}
