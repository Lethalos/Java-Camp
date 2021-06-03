package Odev;

public class Main {

	public static void main(String[] args) {
		String[] lessons = {"C++","C#","Java","OpenGL"};
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		Student s1 = new Student(1, "Kaan", "Ozdo", lessons);
		Instructor i1 = new Instructor(2, "Ahmet", "Yilmaz", lessons, "asdfasdfasdf");
		
		userManager.add(s1);
		userManager.add(i1);
		
		studentManager.addLesson(s1, "Javascript");
		studentManager.addLesson(s1, "Python");
		
		instructorManager.addLesson(i1, "Unity");
		instructorManager.addLesson(i1, "Unreal");
		
		for(String lesson : s1.getLessonsTaken()) {
			System.out.println("Instructor: " + lesson);
		}
		
		for(String lesson : i1.getLessonsGiven()) {
			System.out.println("Student: " + lesson);
		}
	}
}