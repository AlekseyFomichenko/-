import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroup> {
    
    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        
        // int totalStudents1 = 0;
        // int totalStudents2 = 0;

        // for (StudentGroup studentGroup : o1.getStudentGroupList()) {
        //     totalStudents1 += studentGroup.getStudentList().size();
        // }
        // for (StudentGroup studentGroup : o2.getStudentGroupList()) {
        //     totalStudents2 += studentGroup.getStudentList().size();
        // }

        // if (totalStudents1 > totalStudents2) {
        //     return 1;
        // }
        // if (totalStudents1 < totalStudents2) {
        //     return -1;
        // }
        // return 0;

        if (o1.getStudentList().size() > o2.getStudentList().size()) {
            return 1;
        }
        if (o1.getStudentList().size() < o2.getStudentList().size()) {
            return -1;
        }
        return 0;
    }
}
