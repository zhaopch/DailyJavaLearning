package com.example.loading;

public class RoundUpToPowerOfTwo {
	/**
	 * @param the
	 *            Integer to compare,max is 2^32
	 * @return the minimum that format 2^x which greater than or equal to i
	 */
	public static int getRoundUpToPowerOfTwo(int i) {
		i--;
		i |= i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return i + 1;
	}
}
