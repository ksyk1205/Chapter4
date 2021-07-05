package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student std1 = new Student(100, "Lee");
		Student std2 = new Student(100, "Lee");
		
		System.out.println(std1 == std2); //주소값은 다르지만
		System.out.println(std1.equals(std2)); //논리적으로 같다.
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		
		System.out.println(System.identityHashCode(std1));
		System.out.println(System.identityHashCode(std2));
		
		//std1.setStudentName("Kim");
		
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent);
	}

}
