import java.util.Scanner;
public class bai8_9 {
    static Scanner nhap=new Scanner (System.in);
	public static void main(String[] args) {
	int a;
	a=nhap.nextInt();
	if(ktradoixung(a)==1)
		System.out.print("So doi xung");
	else
		System.out.print("So khong doi xung");
	System.out.print("\nSo sau khi dao nguoc la: "+daonghich(a));
	}
	public static int ktradoixung(int a)

	{
		int ktra;
		int v=a;
		int dao=0;
		while(v!=0){
		ktra= v%10;	
		dao=dao*10+ktra;
		v/=10;
		}
		if(dao==a)
		return 1;
		else
		return 0;
		
	}
	public static int daonghich(int a)
	{
		int ktra;
		int v=a;
		int dao=0;
		while(v!=0){
		ktra= v%10;	
		dao=dao*10+ktra;
		v/=10;
		}
		return dao;
	}

}
