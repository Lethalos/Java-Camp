package Odev; 

public class StudentManager extends UserManager {
	public void addLesson(Student student, String lesson) {
		int size = student.getLessonsTaken().length;
		String[] newLessons = new String[size + 1];
		
		for(int i = 0; i < size;i++) {
			newLessons[i] = student.getLessonsTaken()[i];
		}
		
		newLessons[size] = lesson;
		
		student.setLessonsTaken(newLessons);
	}
}