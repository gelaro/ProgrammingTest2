public class DropRequest extends Request {
    public DropRequest(String studentID,String courseID) throws Exception {
        setStudentID(studentID);
        setCourseID(courseID);
        setType(REQUEST_DROP);
    }
}
