package com.bs.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.bs.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList();
	
	
	public int addList(Music music) {
		 list.add(music);		 
		 return 1;
		
	}
	public int addAtZero(Music music) {
		list.add(0,music);
		return 1;
		
	}
	public List printAll() {
		return list;
	}
	public Music searchMusic(String title) {
		
	}
	public Music removeMusic(String title) {
		
	}
	public Music setMusic(String title) {
		
	}
	public int ascTitle() {
		
	}
	public int descSinger() {
		
	}
	
	
}
