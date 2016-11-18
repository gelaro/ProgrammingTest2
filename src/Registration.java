import java.util.ArrayList;

public class Registration {
    // Request repository
    private ArrayList<IRequest> requestList;

    // Add new course, only request with non-exists studentID/courseID
    // is a valid request. Invalid request will cause an exception
    public void add(IRequest request) {
        if (!exists(request)) requestList.add(request);
        else System.out.println("Already have this request!!!");
    }

    // Drop existing course, only request with existing studentID/courseID
    // is a valid request. Invalid request will cause an exception
    public void drop(IRequest request) {
        if (!exists(request)) requestList.add(request);
        else System.out.println("You never request add this class!!!");
    }

    // Check whether the request is in repository.
    public boolean exists(IRequest request) {
        IRequest requestCheck = Request.createRequest(1,request.getStudentID(),request.getCourseID());
        if (requestList.indexOf(requestCheck) != -1) return true;
        else return false;
    }

    // Count all requests
    public int count() {
        return requestList.size();
    }

    // Count requests by request type
    public int countByType(int type) {
        int count = 0;
        for (int i = 0;i < requestList.size();i++){
            if (requestList.get(i).getRequestType() == type) {
                count++;
            }
        }
        return count;
    }

    // Count request by course ID
    public int countByCourseID(String courseID) {
        int count = 0;
        for (int i = 0;i < requestList.size();i++){
            if (requestList.get(i).getCourseID().matches(courseID)) {
                count++;
            }
        }
        return count;
    }

    // Count request by student ID
    public int countByStudentID(String studentID) {
        int count = 0;
        for (int i = 0;i < requestList.size();i++){
            if (requestList.get(i).getStudentID().matches(studentID)) {
                count++;
            }
        }
        return count;
    }
}
