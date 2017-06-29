package com.example.loading;

public class RoundUpToPowerOfTwo {
	public static int getRoundUpToPowerOfTwo(int i) {
		i--;
		System.out.println("start-----" + i);
		i |= i >>> 1;
		System.out.println("1-----" + i);
		i |= i >>> 2;
		System.out.println("2-----" + i);
		i |= i >>> 4;
		System.out.println("3-----" + i);
		i |= i >>> 8;
		System.out.println("4-----" + i);
		i |= i >>> 16;
		System.out.println("5-----" + i);
		return i + 1;
	}
}
