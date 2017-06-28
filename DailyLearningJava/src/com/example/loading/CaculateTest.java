package com.example.loading;

/**
 * 
 * @author zhaopengcheng
 *         <p>
 *         Java运算符测试
 *         </p>
 */
public class CaculateTest {
	public static void main(String[] args) {
		int m = -100;
		System.out.println("m的二 进 制码是：" + Integer.toBinaryString(m));
		System.out.println("m>>2的二进制码是：" + Integer.toBinaryString(m >> 2));
		System.out.println("(m>>2)=" + (m >> 2));
		System.out.println("m<<2的二进制码是：" + Integer.toBinaryString(m << 2));
		System.out.println("(m<<2)=:" + (m << 2));
		System.out.println("m>>>24的二进制码是：" + Integer.toBinaryString(m >>> 24));
		System.out.println(" m>>>24 :" + (m >>> 24));
		System.out.println("Integer Size=" + Integer.SIZE);
	}

}
