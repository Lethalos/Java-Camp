package Odev;

public class InstructorManager extends UserManager{
	public void addLesson(Instructor instructor, String lesson) {
		int size = instructor.getLessonsGiven().length;
		String[] newLessons = new String[size + 1];
		
		for(int i = 0; i < size;i++) {
			newLessons[i] = instructor.getLessonsGiven()[i];
		}
		
		newLessons[size] = lesson;
		
		instructor.setLessonsGiven(newLessons);
	}
}
