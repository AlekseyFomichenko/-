public class Teacher extends User implements Comparable<Teacher> {

    private int teacherID;

    public Teacher(int teacherID, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherID = teacherID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher [teacherID=" + teacherID + ", firstName=" + super.getFirstName() + ", secondName="
                + super.getSecondName()
                + ", lastName=" + super.getLastName() + "]";
    }

    @Override
    public int compareTo(Teacher o) {
        if (teacherID > o.getTeacherID()) {
            return 1;
        }
        if (teacherID < o.getTeacherID()) {
            return -1;
        }
        return 0;
    }
}