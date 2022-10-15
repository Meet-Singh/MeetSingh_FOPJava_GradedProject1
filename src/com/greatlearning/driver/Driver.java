package com.greatlearning.driver;

import com.greatlearning.admin.department.AdminDepartment;
import com.greatlearning.hr.department.HrDepartment;
import com.greatlearning.tech.department.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		AdminDepartment ad = new AdminDepartment();
		HrDepartment hr = new HrDepartment();
		TechDepartment tech = new TechDepartment();

		String dept = ad.departmentName();
		String tw = ad.getTodaysWork();
		String td = ad.getWorkDeadline();
		String th = ad.isTodayAHoliday();
		System.out.println("Welcome to " + dept);
		System.out.println(tw);
		System.out.println(td);
		System.out.println(th);
		System.out.println();

		String dept1 = hr.departmentName();
		String ta = hr.doActivity();
		String tw1 = hr.getTodaysWork();
		String td1 = hr.getWorkDeadline();
		String th1 = hr.isTodayAHoliday();
		System.out.println("Welcome to " + dept1);
		System.out.println(ta);
		System.out.println(tw1);
		System.out.println(td1);
		System.out.println(th1);
		System.out.println();

		String dept2 = tech.departmentName();
		String tw2 = tech.getTodaysWork();
		String td2 = tech.getWorkDeadline();
		String th2 = tech.isTodayAHoliday();
		String si = tech.getTechStackInformation();
		System.out.println("Welcome to " + dept2);
		System.out.println(tw2);
		System.out.println(td2);
		System.out.println(si);
		System.out.println(th2);
		System.out.println();
	}

}
