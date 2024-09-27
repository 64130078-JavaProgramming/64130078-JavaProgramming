package da6;

public class StudentMark implements IStudentMark{
	// Properties
    private String FullName;
    private int ID;
    private String Class;
    private int Semester;
    private float AverageMark;
    
    // Array for 5 subject marks
    private int[] SubjectMarkList = new int[5];

    // Constructor
    public StudentMark(int ID, String fullName, String className, int semester) {
        this.ID = ID;
        this.FullName = fullName;
        this.Class = className;
        this.Semester = semester;
    }

    // Getters
    public int getID() {
        return ID;
    }

    public float getAverageMark() {
        return AverageMark;
    }

    // Setters for SubjectMarkList
    public void setSubjectMarkList(int[] marks) {
        if (marks.length == 5) {
            SubjectMarkList = marks;
        } else {
            System.out.println("Please provide exactly 5 subject marks.");
        }
    }

    // Implement the display method from IStudentMark
    @Override
    public void Display() {
        System.out.println("Student ID: " + ID);
        System.out.println("Full Name: " + FullName);
        System.out.println("Class: " + Class);
        System.out.println("Semester: " + Semester);
        System.out.println("Average Mark: " + AverageMark);
    }

    // Method to calculate the average mark
    public void AveCal() {
        int sum = 0;
        for (int mark : SubjectMarkList) {
            sum += mark;
        }
        this.AverageMark = (float) sum / SubjectMarkList.length;
    }
}
