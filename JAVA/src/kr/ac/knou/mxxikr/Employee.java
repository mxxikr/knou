package kr.ac.knou.mxxikr;

class Employee {
	int nSalary;
	String szDept = null;

	public void doJob() {
		System.out.println("Do something");
	}
}

class Sales extends Employee {
	public Sales() {
		szDept = "Sales Dept";
	}

	public void doJob() {
		System.out.println("Do sales");
	}
}

class Development extends Employee {
	public Development() {
		szDept = "Sales Dept";
	}

	public void doJob() {
		System.out.println("Do development");
	}
}