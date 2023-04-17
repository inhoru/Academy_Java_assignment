package com.bs.practice.set.model.compare;

import java.util.Comparator;

import com.bs.practice.set.model.vo.Lottery;

public class SortedLottery implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Lottery l = (Lottery)o1;
		Lottery l2 = (Lottery)o2;
		if(l.getName().compareTo(l2.getName())==0) {
			return l.getPhone().compareTo(l2.getPhone());
			
		}else {
			return l.getName().compareTo(l2.getName());
		}

	}
	
}
