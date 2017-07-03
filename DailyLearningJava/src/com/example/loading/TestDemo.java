package com.example.loading;

import java.util.HashMap;

/**
 * @author zhaopch
 *         <p>
 *         测试
 *         </p>
 */
public class TestDemo {
	public static void main(String[] args) {
		// 类加载顺序测试*******START
		// Parent.parentStaticMethod();
		// Parent p = new Parent();
		// p.parentStaticMethod2();
		// Child child = new Child();
		// 类加载顺序测试*******END

		// 计算岛的周长测试****START
		// int[][] grid = { { 0, 1, 0, 0 }, { 1, 1, 1, 0 }, { 0, 1, 0, 0 }, { 1,
		// 1, 0, 0 } };
		// IsLandCircumference ilc = new IsLandCircumference();
		// int result = ilc.isLandPerimeter(grid);
		// System.out.println("result:" + result);
		// 计算岛的周长测试****END

		// RoundUpToPowerOfTwo**********START
		// System.out.println(RoundUpToPowerOfTwo.getRoundUpToPowerOfTwo(16));
		// RoundUpToPowerOfTwo***********END

		// Java运算符*******START
		// System.out.println(-21 >> 2);
		// System.out.println(Integer.parseInt("1101", 2));
		// int MAXIMUN_CAPACITY = 1 << 30;
		// int result = 1 << 30;
		// System.out.println((result & ~(MAXIMUN_CAPACITY - 1)) == 0);
		// System.out.println(~37);
		// int compare = -64;
		// int MAX = -64;
		// System.out.println((compare & ~(MAX - 1)) == 0);
		// System.out.println(0xffffcd7d);
		// Java运算符*******END
		// HashMap相关*******************START
		// HashMap<String, String> map = new HashMap<>();
		// map.put(null, "aaa");
		// map.put(null, "bbb");
		// map.put(null, "ccc");
		// System.out.println(map.get(null));
		System.out.println(getMaxInt());
		// HashMap相关*********************END
	}

	private static int getMaxInt() {
		int i = 1;
		i |= i << 1;
		i |= i << 2;
		i |= i << 4;
		i |= i << 8;
		i |= i << 15;
		return i;
	}
}
