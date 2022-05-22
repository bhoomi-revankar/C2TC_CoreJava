import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean flag=false;
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			if(arr[i]==key)
			{
				
			    System.out.println("Element is found");
			    break;
			}
		}
	}
}

		
		
		

	


