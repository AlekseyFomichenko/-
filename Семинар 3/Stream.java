import java.util.Iterator;
import java.util.List;

public class Stream implements Iterator<StudentGroup>{
    
    private int streamID;
    private List<StudentGroup> studentGroupList;
    private int count;

    public Stream(int streamID, List<StudentGroup> studentGroupList) {
        this.streamID = streamID;
        this.studentGroupList = studentGroupList;
    }

    @Override
    public boolean hasNext() {
        return count < studentGroupList.size();
    }

    @Override
    public StudentGroup next() {
        if (hasNext()) {
            return studentGroupList.get(count++);
        }
        return null;
    }

    public int getStreamID() {
        return streamID;
    }

    public void setStreamID(int streamID) {
        this.streamID = streamID;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    public int compareTo(Stream o) {
        if (streamID > o.getStreamID()) {
            return 1;
        }
        if (streamID < o.getStreamID()) {
            return -1;
        }
        return 0;
    }
}
