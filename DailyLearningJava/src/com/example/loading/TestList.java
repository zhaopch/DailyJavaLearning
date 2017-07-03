package com.example.loading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author zhaopch
 *         <p>
 *         集合测试
 *         </p>
 */
public class TestList {
	public static final int N = 50000;
	public static List values;

	static {
		Integer vals[] = new Integer[N];
		Random r = new Random();
		for (int i = 0, currval = 0; i < N; i++) {
			vals[i] = new Integer(currval);
			currval += r.nextInt(100) + 1;
		}

		values = Arrays.asList(vals);
	}

	static long timeList(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < N; i++) {
			int index = Collections.binarySearch(list, values.get(i));
			if (index != i) {
				System.out.println("ERROR");
			}
		}
		return System.currentTimeMillis() - start;
	}

	public static void main(String[] args) {
		System.out.println("ArrayList cost time:" + timeList(new ArrayList(values)));
		System.out.println("LinkedList cost time:" + timeList(new LinkedList(values)));
	}
}
