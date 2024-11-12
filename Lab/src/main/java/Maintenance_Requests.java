public abstract class Maintenance_Requests {
    String priority;
    String status;
    String expire;

abstract void setPriority();
abstract void setStatus();
abstract void setExpire  ();  
abstract void processRequest();
}
