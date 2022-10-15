package com.greatlearning.admin.department;

import com.greatlearning.superclass.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

	public String departmentName() {
		return "Admin Department";

	}

	public String getTodaysWork() {
		return "Complete your docum	ents submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";

	}

}
