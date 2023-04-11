package com.bs.practice.list.music.model.compare;

import java.util.Comparator;

import com.bs.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator{
	
	@Override
	public int compare(Object o1,Object o2) {
		Music m = (Music)o1;
		Music m2 = (Music)o2;
		if(m.getSinger()>m2.getSinger()) return +1;
		else if(m.getSinger()<m2.getSinger()) return -1;
		else return 0;
	}
	
}
