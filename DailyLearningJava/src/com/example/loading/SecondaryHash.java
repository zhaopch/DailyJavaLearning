package com.example.loading;

/**
 * @author zhaopch
 *         <p>
 *         再哈希
 *         </p>
 */
public class SecondaryHash {
	public static int secondaryHash(int h) {
		h += (h << 15) ^ 0xffffcd7d;
		h ^= (h >>> 10);
		h += (h << 3);
		h ^= (h >>> 6);
		h += (h << 2) + (h << 14);
		return h ^ (h >>> 16);
	}
}
