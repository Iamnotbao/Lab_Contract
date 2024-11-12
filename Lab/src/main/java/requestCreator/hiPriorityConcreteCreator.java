package requestCreator;

import MaintenancePackage.*;

public class hiPriorityConcreteCreator implements requestCreator{

    @Override
    public Maintenance_Requests createRequest() {
       High_Priority_Request request=new High_Priority_Request();
       request.setExpire();
       request.setPriority();
       request.setStatus();
       request.processRequest();
       return request;
    }
    
}
