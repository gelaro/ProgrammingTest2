public class DropRequest extends Request {
    private DropRequest(String studentID,String courseID){
        IRequest request = new Request();
        request.setStudentID(studentID);
        request.setCourseID(courseID);
        request.setType(REQUEST_ADD);
    }
}
