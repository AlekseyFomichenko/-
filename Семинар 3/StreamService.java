import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class StreamService{
    
    private Stream stream;

    public StreamService(Stream stream) {
        this.stream = stream;
    }

    public Stream getStream() {
        return stream;
    }

    public List<StudentGroup> getSortedStream(){
        List<StudentGroup> sortedList = new ArrayList<>(stream.getStudentGroupList());
        Collections.sort(sortedList, new StreamComparator());
        return sortedList;
    }
}
