package com.github.soccalegend.december;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("C:/Users/Sharan/workspace/advent-of-code/src/resources/day2_input.txt"));
		part1(input);
		Scanner input2 = new Scanner(new File("C:/Users/Sharan/workspace/advent-of-code/src/resources/day2_input.txt"));
		part2(input2);
	}

	public static void part1(Scanner input) {
		int sum = 0;
		while (input.hasNextLine()) {
			String line = input.nextLine();
			StringTokenizer st = new StringTokenizer(line);
			int max = 0;
			int min = 0;
			while (st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				if (num > max) {
					if (max == 0 && min == 0)
						min = num;
					max = num;

				}
				if (num < min)
					min = num;
			}
			sum += (max - min);
		}
		System.out.println(sum);
	}

	public static void part2(Scanner input) {
		int sum = 0;
		while (input.hasNextLine()) {
			String line = input.nextLine();
			StringTokenizer st = new StringTokenizer(line);
			while (st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				StringTokenizer st2 = new StringTokenizer(line);
				while (st2.hasMoreTokens()) {
					int num2 = Integer.parseInt(st2.nextToken());
					if (num != num2 && num % num2 == 0) {
						if (num > num2) {
							sum += (num / num2);
						} else {
							sum += (num2 / num);
						}
					}
				}
			}
		}
		System.out.println(sum);
	}
}
