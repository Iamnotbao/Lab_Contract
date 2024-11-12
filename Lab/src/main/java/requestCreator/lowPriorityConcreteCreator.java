package requestCreator;

import MaintenancePackage.*;

public class lowPriorityConcreteCreator implements requestCreator{

    @Override
    public Maintenance_Requests createRequest() {
      Low_Priority_Request request= new Low_Priority_Request();
      request.setExpire();
      request.setPriority();
      request.setStatus();
      request.processRequest();
      return request;
    }

    
    
}
