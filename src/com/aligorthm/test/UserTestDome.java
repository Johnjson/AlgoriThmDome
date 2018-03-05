package com.aligorthm.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserTestDome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(10);
	}

	public static void test(int num) {
	
		List<Integer> all = new LinkedList<Integer>();
		for (int i = 1; i <= num; i++) {
			all.add(i);
		}
		System.out.println(all);

		int i = 0;
		int s = all.size();
		// System.out.println(all[0]);
		for (int n = 1; n < num; n++) {

			i = (i + 2) % all.size();

			all.remove(i);
		}

		System.out.println("最后剩下的是第 " + all.get(0) + " 个人");
	}

}
