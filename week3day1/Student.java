package week3day1;

public class Student extends Department {
	
	public void studentname() {
		System.out.println("Aravinth");
	}
	public void studentDept() {
		System.out.println("Automobile");
	}
	public void studentid() {
		System.out.println("212345668756");
	}
public static void main(String[] args) {
	Student student= new Student();
	student.collegecode();
	student.collegename();
	student.collegerank();
	student.deptname();
	student.studentname();
	student.studentDept();
	student.studentid();

	
}

}
	

