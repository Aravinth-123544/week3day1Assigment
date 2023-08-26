package week3day1;

public class Students {
	// Method to get student information by ID alone
    public void getStudentInfo(int id) {
        System.out.println("Student ID: " + id);
    }

    // Method to get student information by ID and Name
    public void getStudentInfo(int id, String name) {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

    // Method to get student information by Email and Phone Number
    public void getStudentInfo(String email, String phoneNumber) {
        System.out.println("Student Email: " + email);
        System.out.println("Student Phone Number: " + phoneNumber);
    }

    public static void main(String[] args) {
        Students studentInfo = new Students();
        studentInfo.getStudentInfo(1238564554); // Using ID
        studentInfo.getStudentInfo("456", "John"); // Using ID and Name
        studentInfo.getStudentInfo("john@example.com", "976547875"); // Using Email and Phone Number
    }
	}


