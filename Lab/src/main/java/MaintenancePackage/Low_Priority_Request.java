package MaintenancePackage;

import java.time.LocalDate;

public class Low_Priority_Request extends Maintenance_Requests{
    private String priority;
    private String status;
    private String expire;

    @Override
    public void setPriority() {
       this.priority="Ignore";
    }

    @Override
    public void setStatus() {
        this.status="Done";
    }

    @Override
    public void setExpire() {
        LocalDate date=LocalDate.now().plusMonths(1);
        this.expire= date.toString();
    }

    @Override
    public void processRequest() {
        System.out.println("Request denied");
    }

    @Override
    public String toString() {
        return "Medium_Priority_Request [priority=" + priority + ", status=" + status + ", expire=" + expire
                + "]";
    }
    
}
