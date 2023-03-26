package com.bs.hw.member.controller;

import java.util.Arrays;

import com.bs.hw.member.model.vo.Member;

public class MemberController {
	private Member[] m = new Member[SIZE];
	public static int SIZE = 10;

	public int existMemberNum() {
		int count = 0;
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null) {
				count++;
			}

		}
		return count;

	}

	public Boolean checkId(String inputId) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(inputId)) {

				return false;
			}
		}
		return true;

	}

	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				return;
			}
		}
	}

	public String searchId(String id) {
		String result = "";
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				result = m[i].inform();
				break;
			} else {
				result = "검색 결과가 없습니다.";
			}
		}
		return result;

	}

	public Member[] searchName(String name) {
		// 진짜어려움
		Member[] result = new Member[m.length];
		int index = 0;
		for (Member member : m) {
			if (member != null && member.getNaem().equals(name)) {
				result[index++] = member;
			}
		}
		return Arrays.copyOf(result, index);

	}

	public Member[] searchEmail(String email) {
		Member[] result = new Member[m.length];
		int index = 0;
		for (Member member : m) {
			if (member != null && member.getEmail().equals(email)) {
				result[index++] = member;
			}
		}
		return Arrays.copyOf(result, index);
	}

	public Boolean updatePassword(String id, String password) {
		boolean flag = true;
		for (Member member : m) {
			if (member != null && member.getId().equals(id)) {
				member.setPassword(password);
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		return flag;

	}

	public Boolean updateName(String id, String naem) {
		boolean flag = true;
		for (Member member : m) {
			if (member != null && member.getId().equals(id)) {
				member.setNaem(naem);
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		return flag;

	}

	public Boolean updateEmail(String id, String email) {
		boolean flag = true;
		for (Member member : m) {
			if (member != null && member.getId().equals(id)) {
				member.setEmail(email);
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		return flag;
	}

	public Boolean delete(String id) {

		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i] = null;
				return true;
			}
		}

		return false;
	}

	public void delete() {
		for (int i = 0; i < m.length; i++) {
			m[i] = null;
		}
	}

	public Member[] printAll() {
			return m;
		
	}
}
