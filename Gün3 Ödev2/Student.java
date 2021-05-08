package Odev;

public class Student extends User {
	private String[] lessonsTaken;

	public Student(int id, String name, String lastName, String[] lessonsTaken) {
		super(id, name, lastName);
		this.lessonsTaken = lessonsTaken;
	}
	
	public String[] getLessonsTaken() {
		return lessonsTaken;
	}
	public void setLessonsTaken(String[] lessonsTaken) {
		this.lessonsTaken = lessonsTaken;
	}
}
