public class AddRequest extends Request {

    private AddRequest(String studentID,String courseID){
        IRequest request = new Request();
        request.setStudentID(studentID);
        request.setCourseID(courseID);
        request.setType(REQUEST_ADD);
    }
}

