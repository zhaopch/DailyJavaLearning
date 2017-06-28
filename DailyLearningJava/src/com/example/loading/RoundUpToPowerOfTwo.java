package com.example.loading;

public class RoundUpToPowerOfTwo {
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
