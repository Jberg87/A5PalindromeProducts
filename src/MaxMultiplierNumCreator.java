
public class MaxMultiplierNumCreator {
	public int maxMultiplierNumCreator(int maxNum) {
		int maxMultiplier = 0;
//		Idealiter zou je de lengte moeten nemen en dan maxMultiplier = lengte * 9
		if (maxNum == 1) {
			maxMultiplier = 9;
		} else if (maxNum == 2) {
			maxMultiplier = 99;
		} else if (maxNum == 3) {
			maxMultiplier = 999;
		}	
		return maxMultiplier;
	}
}
