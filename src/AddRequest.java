public class AddRequest extends Request {

    public AddRequest(String studentID,String courseID) throws Exception {
        setStudentID(studentID);
        setCourseID(courseID);
        setType(REQUEST_ADD);
    }
}

