package com.github.soccalegend.december;

public class Day3 {

	public static void main(String[] args) {
		int input = 325489;
		part1(input);
		part2(input);
	}

	public static void part1(int input) {
		int odd = 1;
		int countOdd = 0;
		while (odd * odd < input) {
			odd += 2;
			countOdd++;
		}
		int upperBound = (int) Math.pow(odd, 2);
		int numStepsFromUpperBound = countOdd * 2;
		if (input != upperBound) {
			while (input < upperBound - odd)
			{
				upperBound -= odd;
				upperBound += 1;
			}
			if (input > upperBound - (odd / 2))
				System.out.println(numStepsFromUpperBound - (upperBound - input));
			else if (input < upperBound - (odd / 2))
				System.out.println(numStepsFromUpperBound + (upperBound - odd + 1 - input));
			else
				System.out.println(numStepsFromUpperBound / 2);
		}else {
			System.out.println(numStepsFromUpperBound);
		}
	}

	public static void part2(int input) {
		int sum = 0;

		System.out.println(sum);
	}
}
