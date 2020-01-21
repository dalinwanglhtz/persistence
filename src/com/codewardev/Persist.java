package com.codewardev;

import java.util.Arrays;

// https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec/train/java

public class Persist {

	public static int persistence(long n) {
		int b;
		for(b=0; String.valueOf(n).length() > 1; b++) {
			n= Arrays.stream(String.valueOf(n).split("")).mapToLong(Long::parseLong).reduce(1, (x,y)->x*y);
		}

		return b;
	}

}
