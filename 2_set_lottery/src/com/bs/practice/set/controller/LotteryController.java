package com.bs.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.bs.practice.set.model.compare.SortedLottery;
import com.bs.practice.set.model.vo.Lottery;

public class LotteryController {
	private HashSet lottery = new HashSet();
	private HashSet win = new HashSet();

//	셋에 값 저장 하는 메소드
	public boolean insertObject(Lottery l) {
		// 전달 받은 l을 lottery에 추가 후, 추가 결과인 boolean 값 반환
		return lottery.add(l);
	}

//	셋에 있는 값을 삭제하는 메소드
	public boolean deleteObject(Lottery l) {
		// 전달 받은 l을 lottery에서 삭제
		// 당첨자 목록(win) 중에 삭제된 추첨 대상자가 존재할 수 있으니
		// 삭제 결과인 boolean 값과 win객체가 null이 아닐 때에만
		// win에도 해당 추첨 대상자 삭제
		if (win != null) {
			win.remove(l);
			return lottery.remove(l);
		}
		return false;

	}

//	모든 당첨자를 출력하는 메소드
	public HashSet winObject() {
		// 추첨 대상자 중에서 랜덤으로 뽑아 당첨 목록에 넣는 메소드
		// 랜덤으로 뽑기 위해 lottery를 ArrayList에 담고,
		// 인덱스를 이용해 win에 당첨자 저장
		// 이 때, 당첨자 수는 무조건 4명이며 이를 위해 추첨자 수는 4명 이상이어야 함
		// 만일 당첨자 목록에 삭제된 추첨 대상자가 있다면
		// 기존에 당첨된 사람은 제외하고 삭제된 사람의 자리만 새로운 추첨자로 채움
		List list = new ArrayList(lottery);
		for (int i = 0; i < list.size(); i++) {
			if (win.size() < 4&&win.isEmpty()) {
				win.add(list.get((int) (Math.random() * list.size())));

			}

		}
		while(win.size()<4&& list.size()>=4) {
			win.add(list.get((int) (Math.random() * list.size())));
		}
		return win;
	}
	// Collections.shuffle(list); 램덤으로 섞어주는 메소드
	// int index = (int) (Math.random() * list.size());

//	정렬된 당첨자 목록을 출력하는 메소드
	public TreeSet sortedWinObject() {
		// 이름으로 오름차순 정렬하되, 이름이 같으면 번호로 오름차순 하는
		// 정렬기준을 가지고 정렬된 결과를 반환
		// 이 때, 미리 만들어진 win을 가지고 정렬하기 때문에
		// 당첨 대상 확인을 꼭 먼저 해야함
		TreeSet tree = new TreeSet(new SortedLottery());
		tree.addAll(win);
		return tree;
		
		
		
	}

//	특정 당첨자를 검색하는 메소드
	public boolean searchWinner(Lottery l) {
		// 전달 받은 l을 win에서 찾고 찾은 결과인 boolean 값 반환		
			return win.contains(l);
	
			
	}
}
