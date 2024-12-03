import java.util.Scanner;
public class Phan_tu_ke_nho {

	public static void main(String[] args) {

		Scanner nhap = new Scanner(System.in);
		int[]a= new int[10];
		for(int i=0;i<10;i++)
		{
			System.out.print("\nnhap vao phan tu thu \n"+i+" :");
		    a[i] =nhap.nextInt();
		}
		nhap.close();
		int min=a[0];
		int []b= new int [10];
		for(int i=0;i<10;i++)
		{
		    b[i] =0;
		}
		for(int i=0;i<10;i++)
		{
			if (a[i]<min)
			{
				min=a[i];
			}
		}
		for(int i=0;i<10;i++)
		{
		    if(min==a[i])
		    	b[i]=1;
		}
		int j=0;
		while(j<10)
		{
			if (b[j]==0)
			{
				min=a[j];
				break;
			}
			j++;
		}
		for(int i=0;i<10;i++)
		{
			if (a[i]<min && b[i]==0)
			{
				min=a[i];
			}
		}
		System.out.print(min);
	}

}
