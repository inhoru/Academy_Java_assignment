package com.bs.practioc.map.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.bs.practioc.map.model.vo.Member;

public class MemberController {
	private HashMap<String, Member> map = new HashMap();

	public boolean joinMembership(String id, Member m) {
		if (map.containsKey(id)) {
			return false;
		} else {
			map.put(id, m);
			return true;
		}
	}

	public String logIn(String id, String password) {
		if (map.containsKey(id)) {
			if (map.get(id).getPassword().equals(password)) {
				return map.get(id).getName();
			}
		}
		return null;

	}

	public boolean changePassword(String id, String pa, String newPa) {
		if (map.containsKey(id)) {
			if (map.get(id).getPassword().equals(pa)) {
				map.get(id).setPassword(newPa);
				return true;
			}
		}
		return false;

	}

	public void changeName(String id, String newName) {
		if (map.containsKey(id)) {
			map.get(id).setName(newName);
		}

	}

	public TreeMap<String, String> sameName(String name) {
		TreeMap<String, String> sameNameMap = new TreeMap();
		for (Map.Entry<String, Member> entry : map.entrySet()) {
			String id = entry.getKey();
			Member member = entry.getValue();
			if (member.getName().equals(name)) {
				sameNameMap.put(id, name);
			}
		}
		return sameNameMap;
	}
}
