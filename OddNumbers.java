
public class OddNumbers {
	public static void main(String[] args) {
		printOddNum(100);
		printEvenNum(20);
	}
	public static void printOddNum(int maxNum) {
		for (int i=0; i<= maxNum; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
	}
	public static void printEvenNum(int maxNum) {
		for(int j=0; j<=maxNum; j++) {
			if(j%2 == 0) {
				System.out.println(j);
			}
		}
	}

}
