
public class SampleForbreakAndcontinue {
public static void main (String[] args)
{
	System.out.println("break Keyword");//Breaks loop and exits for loop once condition satisfied
	for (int i=0; i<=10;i++) {
		System.out.println(i);
		if (i==6) {
			break;
		}
	}
	System.out.println("continue Keyword");//Skips that particular satisfied condition and control moves to the next value
	for (int n = 10; n>=1; n--) {
		if (n==2) {
			continue;
		}
		System.out.println(n);
	}
}
}
