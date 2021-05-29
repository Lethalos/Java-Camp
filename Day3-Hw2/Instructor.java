package Odev;

public class Instructor extends User{
	private String[] lessonsGiven;
	private String background;

	public Instructor(int id, String name, String lastName, String[] lessonsGiven, String background) {
		super(id, name, lastName);
		this.lessonsGiven = lessonsGiven;
		this.background = background;
	}

	public String[] getLessonsGiven() {
		return lessonsGiven;
	}
	public void setLessonsGiven(String[] lessonsGiven) {
		this.lessonsGiven = lessonsGiven;
	}

	public String getBackground() {
		return background;
	}
	public void setBackground(String background) {
		this.background = background;
	}
}