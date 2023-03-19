package com.bs.example.practice8.run;

import com.bs.example.practice8.model.vo.Drive;
import com.bs.example.practice8.model.vo.Staff;
import com.bs.example.practice8.model.vo.Student;
import com.bs.example.practice8.model.vo.Teacher;

public class Main {

	public static void main(String[] args) {
		
		Student st = new Student("김아무",20,'남',"수학",3);
		Teacher tc = new Teacher("강태풍",30,'여',"수교과","수학");
		Staff sf = new Staff("강바람",40,'남',"홍보팀","0109912");
		Drive dv = new Drive("솜덩이",50,'여',"경기도",10);
		System.out.println(st.toString());
		System.out.println(tc.toString());
		System.out.println(sf.toString());
		System.out.println(dv.toString());
		System.out.println();
		Student st1 = new Student("김아무",20,'남',"국어",3);
		System.out.println(st.equals(st1));
		Teacher tc1 = new Teacher("강태풍",30,'여',"국문과","수학");
		System.out.println(tc.equals(tc1));
		Staff sf1 = new Staff("강바람",40,'남',"인사팀","0109912");
		System.out.println(sf.equals(sf1));
		Drive dv1 = new Drive("솜덩이",50,'여',"경기도",10);
		System.out.println(dv.equals(dv1));
		

	}

}
