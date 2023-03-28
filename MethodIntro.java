
public class MethodIntro {
	public static void main(String[] args)
	{
		int result = calculateHighSCore(1000);
		displayHighScorePosition("Tim",result);
		result = calculateHighSCore(800);
		displayHighScorePosition("Bob",result);
		result = calculateHighSCore(40);
		displayHighScorePosition("Dave",result);
		result = calculateHighSCore(400);
		displayHighScorePosition("Anu",result);
		
	}
	
	public static void displayHighScorePosition(String playerName, int scoreListPlayerPos)
	{
		System.out.println(playerName+ " managed to get into position " + scoreListPlayerPos + " on the high score list");
	}
	public static int calculateHighSCore(int playerScore) {
	if (playerScore >= 1000) {
		return 1;
	}
	else if (playerScore >=500 && playerScore <1000){
		return 2;
	}
	else if  (playerScore >=100 && playerScore <500){
		return 3;
	}
	else
		return 4;
}
}
