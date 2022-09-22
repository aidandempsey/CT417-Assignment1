package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.joda.time.DateTime;
import java.util.ArrayList;

class LectureManagementTest {
	
	// instantiating lists
	ArrayList<Student> studentList = new ArrayList<Student>();
	ArrayList<Module> moduleList = new ArrayList<Module>();
	ArrayList<CourseProgram> courseProgramList = new ArrayList<CourseProgram>();

	// instantiating objects
	Student student1 = new Student("Aidan", 22, new DateTime(2000, 9, 4, 0, 0, 0, 0), 19458984, moduleList, courseProgramList);
	Lecturer lecturer1 = new Lecturer("Jimmy", 45, new DateTime(1977, 9, 22, 0, 0, 0, 0), 17483920, moduleList);
	Module module1 = new Module("Software Engineering", "CT-417", studentList, courseProgramList, lecturer1);
	CourseProgram courseProgram1 = new CourseProgram("ECE", moduleList, studentList, new DateTime(2022, 9, 4, 0, 0, 0, 0), new DateTime(2023, 5, 20, 0, 0, 0, 0));

	@Test
	void test() {
		// populating lists
		studentList.add(student1);
		moduleList.add(module1);
		courseProgramList.add(courseProgram1);

		// Student testing
		assertEquals("Aidan", student1.getName());
		assertEquals(22, student1.getAge());
		assertEquals(new DateTime(2000, 9, 4, 0, 0, 0, 0), student1.getDateOfBirth());
		assertEquals(19458984, student1.getID());
		assertEquals(moduleList, student1.getModules());
		assertEquals(courseProgramList, student1.getCourses());

		// Lecturer testing
		assertEquals("Jimmy", lecturer1.getName());
		assertEquals(45, lecturer1.getAge());
		assertEquals(new DateTime(1977, 9, 22, 0, 0, 0, 0), lecturer1.getDateOfBirth());
		assertEquals(17483920, lecturer1.getID());
		assertEquals(moduleList, lecturer1.getModules());

		// Module testing
		assertEquals("Software Engineering", module1.getName());
		assertEquals("CT-417", module1.getID());
		assertEquals(studentList, module1.getStudents());
		assertEquals(courseProgramList, module1.getAssociatedCourses());
		assertEquals(lecturer1, module1.getLecturer());

		// CourseProgram testing
		assertEquals("ECE", courseProgram1.getName());
		assertEquals(moduleList, courseProgram1.getModules());
		assertEquals(studentList, courseProgram1.getStudents());
		assertEquals(new DateTime(2022, 9, 4, 0, 0, 0, 0), courseProgram1.getStartDate());
		assertEquals( new DateTime(2023, 5, 20, 0, 0, 0, 0), courseProgram1.getEndDate());
	}
}