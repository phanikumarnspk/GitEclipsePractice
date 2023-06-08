package mahesh;

public class factorcount {

	public static void main(String[] args) {
		int count=0;
		for (int i=1;i<=27;i=i+1)
		{
			if (27%i==0)
			{
			count=count+1;
		    }
		 }
		System.out.println(count);

	}

}
