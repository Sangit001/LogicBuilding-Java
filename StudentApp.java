class Student {

    protected String name;
    protected int rollNo;
    protected int marks1, marks2, marks3;

    // Creating Constructor
    public Student(String name, int rollNo, int m1, int m2, int m3) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    // Method to calculate total ammount
    public int getTotalMarks() {
        return marks1 + marks2 + marks3;
    }

    // Method to calculate percentage
    public double getPercentage() {
        return getTotalMarks() / 3.0;
    }

    // Method to display result
    public void displayResult() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println("Percentage: " + getPercentage() + "%");
    }
}

// Child class inheritance
class GradeStudent extends Student {

    public GradeStudent(String name, int rollNo, int m1, int m2, int m3) {
        super(name, rollNo, m1, m2, m3);
    }

    // Method overriding
    @Override
    public void displayResult() {
        super.displayResult();
        System.out.println("Grade: " + calculateGrade());
    }

    private String calculateGrade() {
        double percent = getPercentage();

        if (percent >= 90) return "A+";
        else if (percent >= 80) return "A";
        else if (percent >= 70) return "B";
        else if (percent >= 60) return "C";
        else return "Fail";
    }
}

// Main class
public class StudentApp {
    public static void main(String[] args) {

        GradeStudent s1 = new GradeStudent("Sangeet", 101, 85, 90, 88);
        s1.displayResult();
    }
}
