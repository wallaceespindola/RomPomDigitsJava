import java.util.ArrayList;
import java.util.List;

public class RomPom {

	public RomPom() {
	}

	public static void main(String[] args) {
		printRomPomNumbers();
	}

	/**
	 * Print RomPom Numbers
	 */
	public static void printRomPomNumbers() {
		
		for (int j = 1; j < 1001; j++) {
			System.out.println(generateRomPomNumber(j));
		}
	}

	/**
	 * Generate Square Numbers From 1 To 1000
	 * @return List<Integer>
	 */
	private static List<Integer> generateSquareNumbersFrom1To1000() {
		List<Integer> squareNum = new ArrayList<>();
		for (int i = 1; i < 1001; i++) {
			int square = i*i;
			
			if (square > 1000) {
				break;
			}
			//System.out.println("square: " + square);
			squareNum.add(square);
		}
		return squareNum;
	}

	/**
	 * Generate RomPom Number
	 * @param i
	 * @return string
	 */
	public static String generateRomPomNumber(int i) {
		
		List<Integer> squareNumbers = generateSquareNumbersFrom1To1000();
		
		if(String.valueOf(i).contains("4") && squareNumbers.contains(i)) {
			return "Rompom";
			//System.out.println(j);
		} else if(String.valueOf(i).contains("4")) {
			return "Rom";
			//System.out.println(j);
		} else if(squareNumbers.contains(i)) {
			return "Pom";
			//System.out.println(j);
		} else {
			return String.valueOf(i);
		}
	}
}
