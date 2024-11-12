package requestCreator;

import MaintenancePackage.*;

public class midPriorityConcreteCreator implements requestCreator{

    @Override
    public Maintenance_Requests createRequest() {
      Medium_Priority_Request request= new Medium_Priority_Request();
      request.setExpire();
      request.setPriority();
      request.setStatus();
      request.processRequest();
      return request;
    }
}
