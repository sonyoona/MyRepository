package myProject;

public class A {
	public static void main(String[] args) {

		System.out.println("A Project");
		System.out.println("A has been changed in master");

		System.out.println("A Project change1");
		System.out.println("dev B");

		System.out.println("A Project change2");
		System.out.println("dev C");

		
		B name = new B();
		name.ProjectName();
		
		C time = new C();
		time.ProjectTime();
		
	}
}