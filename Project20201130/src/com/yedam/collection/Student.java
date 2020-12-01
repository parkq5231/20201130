package com.yedam.collection;

public class Student implements Comparable<Student> {
	// field
	private int studentNo;
	private String studentName;
	private int score;

	// constructor
	public Student(int studentNo, String studentName) {
		this.studentName = studentName;
		this.studentNo = studentNo;
	}

	public Student(int studentNo, String studentName, int score) {
		super();
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.score = score;
	}

	// getter
	public int getStudentNo() {
		return studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	@Override
	public int hashCode() {
		return this.studentName.hashCode() + this.studentNo;
	}

	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		boolean b1 = this.studentName.equals(student.studentName);
		boolean b2 = this.studentNo == student.studentNo;
		return b1 && b2;
	}

	@Override
	public int compareTo(Student o) {// 음수: 오름차순, 0:같다,양수: 내림차순
		return o.score - this.score;// 더하고 빼지는 값의 위치에 따라 순서가 바뀔수있음

	}

}
