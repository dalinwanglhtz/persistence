package com.codewardev;

import java.util.Arrays;

// https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java

public class Persist {

	public static int persistence(long n) {
		int b = 0;
		while(String.valueOf(n).length() > 1) {
			n= Arrays.stream(String.valueOf(n).split("")).mapToLong(Long::parseLong).reduce(1, (x,y)->x*y);
			b++;
		}

		return b;
	}

}
