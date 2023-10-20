package com.junit;

public class MaxNumber {
	public void findMax(int[] a) {
		int max = a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);

}
}
