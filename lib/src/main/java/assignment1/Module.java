package assignment1;
import java.util.ArrayList;

/**
 * This class represents Lecturers
 * @author Aidan Dempsey
 */
public class Module {
	private String name;
	private String ID;
	private ArrayList<Student> students;
	private ArrayList<CourseProgram> associatedCourses;
	private Lecturer lecturer;
	
	/**
	 * Constructor for instantiating Module objects
	 * @param name, a String representing the name of the Module
	 * @param ID, a String representing the ID of the Module
	 * @param students, an ArrayList representing students taking the module
	 * @param associatedCourses, an ArrayList representing courses associated with the module
	 * @param Lecturer, a Lecturer object representing the lecturer who teaches the module
	 */
	public Module(String name, String ID, ArrayList<Student> students, ArrayList<CourseProgram> associatedCourses,
			Lecturer lecturer) {
		this.name = name;
		this.ID = ID;
		this.students = students;
		this.associatedCourses = associatedCourses;
		this.lecturer = lecturer;
	}
	
	/**
	 * Get the name of the Module
	 * @return name, the name of the Module
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set the name of the Module
	 * @param name, a String representing the name of the Module
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get the ID of the Module
	 * @return ID, the ID of the Module
	 */
	public String getID() {
		return ID;
	}
	
	/**
	 * Set the ID of the Module
	 * @param ID, a String representing the ID of the Module
	 */
	public void setID(String iD) {
		ID = iD;
	}
	
	/**
	 * Get the list of students taking the Module
	 * @return students, the list of students taking the Module
	 */
	public ArrayList<Student> getStudents() {
		return students;
	}
	
	/**
	 * Set the list of students taking the Module
	 * @param students, an ArrayList representing the list of students taking the Module
	 */
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	/**
	 * Get the list of courses associated with the Module
	 * @return associatedCourses, the list of courses associated with the Module
	 */
	public ArrayList<CourseProgram> getAssociatedCourses() {
		return associatedCourses;
	}
	
	/**
	 * Set the list of courses associated with the Module
	 * @param associatedCourses, an ArrayList representing the list of courses associated with the Module
	 */
	public void setAssociatedCourses(ArrayList<CourseProgram> associatedCourses) {
		this.associatedCourses = associatedCourses;
	}
	
	/**
	 * Get the Lecturer of the Module
	 * @return lecturer, the lecturer of the Module
	 */
	public Lecturer getLecturer() {
		return lecturer;
	}
	
	/**
	 * Set the lecturer of the Module
	 * @param lecturer, a Lecturer object representing the lecturer of the Module
	 */
	public void setLecturer(Lecturer lecturer) {
		this.lecturer = lecturer;
	}
}
