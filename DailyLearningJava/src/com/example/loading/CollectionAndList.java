package com.example.loading;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 
 * @author zhaopch
 *         <p>
 *         Java集合学习
 *         </p>
 *
 */
public class CollectionAndList {
	public static void main(String[] args) {
		long time_start = System.currentTimeMillis();
		// LinkedList<Integer> mList = new LinkedList<Integer>();
		ArrayList<Integer> mList = new ArrayList<Integer>();
		for (int i = 0; i < 2000000; i++) {
			mList.add(i, null);
		}
		long time_end = System.currentTimeMillis();
		System.out.println("use " + (time_end - time_start) + "ms");
	}
}
