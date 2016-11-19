import java.util.ArrayList;

public class Registration {
    // Request repository
    private ArrayList<IRequest> requestList = new ArrayList<>();

    // Add new course, only request with non-exists studentID/courseID
    // is a valid request. Invalid request will cause an exception
    public void add(IRequest request) throws Exception {
        if (!exists(request)) requestList.add(request);
        else throw new Exception("Already have this request!!!");
    }

    // Drop existing course, only request with existing studentID/courseID
    // is a valid request. Invalid request will cause an exception
    public void drop(IRequest request) throws Exception {
        IRequest requestCheck = Request.createRequest(request.REQUEST_ADD,request.getStudentID(),request.getCourseID());
        if(exists(requestCheck)){
            if (!exists(request)) requestList.add(request);
        }else throw new Exception("You never request add this class!!!");
    }

    // Check whether the request is in repository.
    public boolean exists(IRequest request) {
        return requestList.contains(request);
    }

    // Count all requests
    public int count() {
        return requestList.size();
    }

    // Count requests by request type
    public int countByType(int type) {
        int count = 0;
        for (IRequest r : requestList){
            if (r.getRequestType() == type) count++;
        }
        return count;
    }

    // Count request by course ID
    public int countByCourseID(String courseID) {
        int count = 0;
        for (IRequest r : requestList){
            if (r.getCourseID().matches(courseID)) count++;
        }
        return count;
    }

    // Count request by student ID
    public int countByStudentID(String studentID) {
        int count = 0;

        for(IRequest r : requestList) {
            if(r.getStudentID().equals(studentID)) count++;
        }
        return count;
    }
}
