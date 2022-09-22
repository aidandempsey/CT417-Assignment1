package assignment1;
import org.joda.time.DateTime;
import java.util.ArrayList;

/**
 * This class represents Lecturers
 * @author Aidan Dempsey
 */
public class Lecturer {
	
	private String name;
	private int age;
	private DateTime dateOfBirth;
	private int ID;
	private String username;
	private ArrayList<Module> modules;
	
	/**
	 * Constructor for instantiating Lecturer objects
	 * @param name, a String representing the name of the Lecturer
	 * @param age, an integer representing the age of the customer
	 * @param dateOfBirth, a DateTime representing the date of birth of the Lecturer
	 * @param ID, an integer representing the ID of the Lecturer
	 * @param modules, an ArrayList representing the modules the Lecturer teaches
	 */
	public Lecturer(String name, int age, DateTime dateOfBirth, int ID, ArrayList<Module> modules) {
		this.name = name;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.ID = ID;
		this.modules = modules;
	}
	
	/**
	 * Get the name of the Lecturer
	 * @return name, the name of the Lecturer
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Set the name of the Lecturer
	 * @param name, a String representing the name of the Lecturer
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Get the age of the Lecturer
	 * @return age, the age of the Lecturer
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * Set the age of the Lecturer
	 * @param age, an integer representing the age of the Lecturer
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Get the date of birth of the Lecturer
	 * @return dateOfBirth, the date of birth of the Lecturer
	 */
	public DateTime getDateOfBirth() {
		return dateOfBirth;
	}
	
	/**
	 * Set the date of birth of the Lecturer
	 * @param dateOfBirth, a DateTime representing the date of birth of the Lecturer
	 */
	public void setDateOfBirth(DateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	/**
	 * Get the ID of the Lecturer
	 * @return ID, the ID of the Lecturer
	 */
	public int getID() {
		return ID;
	}

	/**
	 * Set the ID of the Lecturer
	 * @param ID, an integer representing the ID of the Lecturer
	 */
	public void setID(int iD) {
		ID = iD;
	}
	
	/**
	 * Generate the username of the Lecturer by
	 * concatenating their name and age
	 * @return username, the username of the Lecturer
	 */
	public String getUsername() {
		username = name + age;
		return username;
	}
	
	/**
	 * Get the list of modules the Lecturer teaches
	 * @return modules, the list of modules the Lecturers teaches
	 */
	public ArrayList<Module> getModules() {
		return modules;
	}
	
	/**
	 * Set the list of modules the Lecturer teaches
	 * @param modules, an ArrayList representing the modules that the Lecturer teaches
	 */
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
}
