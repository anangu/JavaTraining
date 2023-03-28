
public class StarsReversePrint {
	public static void main(String[] args) {
		starsReversePrint(3);
		starsReversePrint(2);
		numAscendPrint(5);
		numAscdPrint(5);
		printNumbers(11,40);
		sampleContinue(10);
		starAscd(2);
		starAscd(3);
	}

	public static void starsReversePrint(int loopCount) {
		for (int i=loopCount;i>=1;i--){
		for(int j=i;j>=1;j--){
		System.out.print("*");
		}
		System.out.println();
		}
}
	public static void numAscendPrint(int loopCount) {
		for(int i=loopCount;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
//			maxVal--;
			System.out.println();
		}
	}
	public static void numAscdPrint(int loopCount) {
		for(int i=1;i<=loopCount;i++) {
			int k=0;
			for(int j=i;j>=1;j--) {
				k++;
				System.out.print(k);	
			}
			System.out.println();
		}
	}
	public static void printNumbers(int loopNum, int maxCount) {
		for (int i = loopNum; i<=maxCount; i++) {
			for (int j=i;j<=maxCount;j++) {
				System.out.println(j);
				if(j%10 ==3) {
					i+=9;
					break;
				}
			}
	//		System.out.println();
		}
				
	}
	public static void sampleContinue(int loopCount) {
		for (int i=1;i<=loopCount;i++) {
			if (i==5) {
				continue;
			}
			System.out.println(i);
			}
		}
	public static void starAscd(int maxStar) {
			for (int i=1;i<=maxStar;i++) {
				for (int j=i;j>=1;j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			}
	}
		