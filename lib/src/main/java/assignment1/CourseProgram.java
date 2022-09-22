package assignment1;
import java.util.ArrayList;
import org.joda.time.DateTime;

public class CourseProgram {

	private String name;
	private ArrayList<Module> modules;
	private ArrayList<Student> students;
	private DateTime startDate;
	private DateTime endDate;
	
	/**
	 * Constructor for instantiating CourseProgram objects
	 * @param name, a String representing the name of the CourseProgram
	 * @param modules, ArrayList representing the list of students enrolled in the CourseProgram
	 * @param students, an ArrayList representing students enrolled in the CourseProgram
	 * @param startDate, a DateTime representing the academic start date of the CourseProgram
	 * @param endDate, a DateTime representing the academic end date of the CourseProgram
	 */
	public CourseProgram(String name, ArrayList<Module> modules, ArrayList<Student> students, DateTime startDate,
			DateTime endDate) {
		this.name = name;
		this.modules = modules;
		this.students = students;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Module> getModules() {
		return modules;
	}

	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public DateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	public DateTime getEndDate() {
		return endDate;
	}

	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}	
}
