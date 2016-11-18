public class Request implements IRequest {
    private String studentID, courseID;
    private int type;

    public Request(String studentID, String courseID, int type) {
    }

    public static IRequest createRequest(int type, String studentID, String courseID) {
        if (type == REQUEST_ADD) return new AddRequest(studentID, courseID);
        else return new DropRequest(studentID, courseID);
    }

    protected Request() {
        throw new UnsupportedOperationException("Please override this method");
    }

    @Override
    public String getStudentID() {
        return studentID;
    }

    @Override
    public void setStudentID(String studentID) {
        String rx = "[0-9]{6,}";
        if (studentID != null) {
            if (courseID.matches(rx)) {
                this.studentID = studentID;
            } else {
                System.out.println("invalid studentID");
            }
        }
    }

    @Override
    public String getCourseID() {
        return courseID;
    }

    @Override
    public void setCourseID (String courseID){
        String rx = "[0-9]{6,}";
        if (courseID != null) {
            if (courseID.matches(rx)) {
                this.courseID = courseID;
            }
        } else {
            System.out.println("invalid courseID");
        }
    }

    @Override
    public int getRequestType () {
        return type;
    }

    public void setType(int type) {

        if(type == IRequest.REQUEST_DROP || type == IRequest.REQUEST_ADD) {
            this.type = type;
        } else {
            throw new Exception("Invalid type")
        }
    }
}
