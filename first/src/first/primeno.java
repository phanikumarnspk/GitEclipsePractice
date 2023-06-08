package first;

public class primeno {

	public static void main(String[] args) {
		
		
	int num = 11;
	
	int count = 0;
	
	for(int i =1;i<=num;i++)
	{
		//int count = 0 ; wrong
		
	if(num% i ==0)
	{
		
		count++;
		
		System.out.println(i);
		
		
	}
	
	//system.out.println(count);
	}
	if(count ==2)
	{
		System.out.println("its a prime no");
	}
	else
	{
		System.out.println("its not a prime no");
	}
	}

}
