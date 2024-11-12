package Maintenance_Request;


public abstract class Maintenance_Requests {
    String priority;
    String status;
    String expire;

public abstract void setPriority();
public abstract void setStatus();
public abstract void setExpire();  
abstract void processRequest();
}
