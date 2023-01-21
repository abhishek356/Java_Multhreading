package com.threadCreation.part1;

import java.util.*;

public class PracticeCollectionsList {

	public static void main(String args[]) {
		
		List <Integer> CheckList = new ArrayList<>();
		CheckList.add(5);
		CheckList.add(8);
		CheckList.add(5);
		
		System.out.println(CheckList);
		
		Iterator <Integer> itr = CheckList.iterator();
		System.out.println(CheckList.get(1));
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		CheckList.remove(1);
		System.out.println(CheckList);
		CheckList.clear();
		System.out.println(CheckList);
	}
	
	
}
