package assignment1;
import org.joda.time.DateTime;
import java.util.ArrayList;

/**
 * This class represents students
 * @author Aidan Dempsey
 */
public class Student {
	
	private String name;
	private int age;
	private DateTime dateOfBirth;
	private int ID;
	private String username;
	private ArrayList<CourseProgram> courses;
	private ArrayList<Module> modules;
	
	/**
	 * Constructor for instantiating Student objects
	 * @param name, a String representing the name of the student
	 * @param age, an integer representing the age of the customer
	 * @param dateOfBirth, a DateTime representing the date of birth of the student
	 * @param ID, an integer representing the ID of the student
	 * @param modules, an ArrayList representing the modules the student takes
	 * @param courses, an ArrayList representing the courses the student is enrolled in
	 */
	public Student(String name, int age, DateTime dateOfBirth, int ID, ArrayList<Module> modules,
			ArrayList<CourseProgram> courses) {
		this.name = name;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.ID = ID;
		this.courses = courses;
		this.modules = modules;
	}
	
	/**
	 * Get the name of the student
	 * @return name, the name of the student
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set the name of the student
	 * @param name, a String representing the name of the student
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get the age of the student
	 * @return age, the age of the student
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Set the age of the student
	 * @param age, an integer representing the age of the student
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Get the date of birth of the student
	 * @return dateOfBirth, the date of birth of the student
	 */
	public DateTime getDateOfBirth() {
		return dateOfBirth;
	}
	
	/**
	 * Set the date of birth of the student
	 * @param dateOfBirth, a DateTime representing the date of birth of the student
	 */
	public void setDateOfBirth(DateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	/**
	 * Get the ID of the student
	 * @return ID, the ID of the student
	 */
	public int getID() {
		return ID;
	}

	/**
	 * Set the ID of the student
	 * @param ID, an integer representing the ID of the student
	 */
	public void setID(int iD) {
		ID = iD;
	}
	
	/**
	 * Generate the username of the student by
	 * concatenating their name and age
	 * @return username, the username of the student
	 */
	public String getUsername() {
		username = name + age;
		return username;
	}
	
	/**
	 * Get the list of modules the student takes
	 * @return modules, the list of modules the students takes
	 */
	public ArrayList<Module> getModules() {
		return modules;
	}
	
	/**
	 * Set the list of modules the student takes
	 * @param modules, an ArrayList representing the modules that the student takes
	 */
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	
	/**
	 * Get the list of courses the student is enrolled in
	 * @return courses, the list of courses the student is enrolled in
	 */
	public ArrayList<CourseProgram> getCourses() {
		return courses;
	}
	
	/**
	 * Set the list of courses the student is enrolled in
	 * @param courses an ArrayList representing the courses the student is enrolled in
	 */
	public void setCourses(ArrayList<CourseProgram> courses) {
		this.courses = courses;
	}
}
