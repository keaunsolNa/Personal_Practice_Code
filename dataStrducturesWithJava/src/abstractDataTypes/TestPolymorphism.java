package abstractDataTypes;

public class TestPolymorphism {
	public static void main(String[] args) {
		StudentEmployee joe = new StudentEmployee(3.29, 6.75);
		report((Student)joe);
		report((Employee)joe);
	}
	
	static void report(Student student) {
		System.out.println("This student's gpa is: "
				+ student.getGpa());
	}
	
	static void report(Employee employee) {
		System.out.println("This employee's wages are : $"
				+ employee.getWages());
	}
	
	interface Student{
		double getGpa();
	}
	
	interface Employee{
		double getWages();
	}
	
	static class StudentEmployee implements Student, Employee{
		private double gpa, wages;
		
		public StudentEmployee(double gpa, double wages) {
			this.gpa = gpa;
			this.wages = wages;
		}
		
		public double getGpa() {
			return gpa;
		}
		
		public double getWages() {
			return wages;
		}
	}
}
