package da7;

public class Student implements IStudent{
	// Properties
    private String FullName;
    private int ID;
    private String DateofBirth;
    private String NativePlace;
    private String ClassName;
    private String PhoneNo;
    private int Mobile;

    // Constructor
    public Student(int ID, String fullName, String dateOfBirth, String nativePlace, String className, String phoneNo, int mobile) {
        this.ID = ID;
        this.FullName = fullName;
        this.DateofBirth = dateOfBirth;
        this.NativePlace = nativePlace;
        this.ClassName = className;
        this.PhoneNo = phoneNo;
        this.Mobile = mobile;
    }

    // Implementing the Display method from IStudent
    @Override
    public void Display() {
        System.out.println("ID: " + ID);
        System.out.println("Full Name: " + FullName);
        System.out.println("Date of Birth: " + DateofBirth);
        System.out.println("Native Place: " + NativePlace);
        System.out.println("Class: " + ClassName);
        System.out.println("Phone No: " + PhoneNo);
        System.out.println("Mobile: " + Mobile);
    }

    // Getter for ClassName (used for searching)
    public String getClassName() {
        return ClassName;
    }
}
