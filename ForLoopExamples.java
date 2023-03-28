
public class ForLoopExamples {
	public static void main(String[] agrs)
	{
	//Print test 5 times
	for (int i = 1; i<=5; i++)
	{
		System.out.println("Round " +i);
	}
	
	//Sum of natural numbers 1 to 1000
	int sum = 0;
	
	for(int n=1; n<=1000; n++) 
		{
		sum += n;
		}
	
	System.out.println("Sum of natural numbers: " + sum);
	
	//FOR EACH LOOP
	int[] a = {11,12,13,14,15,16};
	for (int b : a){
		System.out.println(b);
	}
	}
}
	//System.out.println(a.toString());
	
	/*Inner loop
	for (int i=2;i>=1;i--) {
		for (int j=3;j>=i;j--) {
			System.out.print("*");
			if(j==i) {
				break;
			}
			}
		}
	System.out.println();	
	}
	
}
	
	
}
*/
