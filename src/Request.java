public class Request implements IRequest {
    private String studentID,courseID;
    private int type;
    public static IRequest createRequest(int type, String studentID, String courseID) {
        getStudentID(studentID);
        getCourseID(courseID);
        getRequestType(type);
    }

    protected Request()
    {
        throw new UnsupportedOperationException("Please override this method");
    }

    @Override
    public String getStudentID() {
        return getStudentID();
    }

    @Override
    public String setStudentID(String studentID) {
        String rx = "[0-9]{9,}";
        if(studentID != null){
            if(studentID.matches(rx)){
                this.studentID = studentID;
                return studentID;
            }
        }else{
            System.out.println("invalid studentID");
        }
    }

    @Override
    public String getCourseID() {
        return getCourseID();
    }

    @Override
    public void setCourseID(String courseID) {
        String rx = "[0-9]{6,}";
        if(courseID != null){
            if(courseID.matches(rx)) {
                this.courseID = courseID;
                return courseID;
            }
        }else {
            System.out.println("invalid courseID");
        }
    }

    @Override
    public int getRequestType() {
        return getRequestType();
    }
}
