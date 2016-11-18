public class AddRequest extends Request {

    public AddRequest(String studentID,String courseID){
        setStudentID(studentID);
        setCourseID(courseID);
        setType(REQUEST_ADD);
    }
}

