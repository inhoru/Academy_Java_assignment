package com.bs.practice.list.music.model.compare;

import java.util.Comparator;

import com.bs.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator{
	
	@Override
	public int compare(Object o1,Object o2) {
		Music m = (Music)o1;
		Music m2 = (Music)o2;
		if(m.getTitle().compareTo(m2.getTitle())==0) {
			return m.getSinger().compareTo(m2.getSinger());
		}else {
			return m.getTitle().compareTo(m2.getTitle());
		}
		
		
	}
	
}
