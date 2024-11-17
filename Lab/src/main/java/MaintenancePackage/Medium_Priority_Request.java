package MaintenancePackage;

import java.time.LocalDate;

public class Medium_Priority_Request extends Maintenance_Requests{
    private String priority;
    private String status;
    private String expire;
    @Override
    public void setPriority() {
      this.priority="Medium";
    }

    @Override
    public void setStatus() {
        this.status="Accepted";
    }

    @Override
    public void setExpire() {
        this.expire=LocalDate.now().plusMonths(1).toString();
    }

    @Override
    public void processRequest() {
       System.out.println(": Print out/Sent the following message “Request accept, estimated\r\n" + //
                      "completion date is "+expire);
    }

    @Override
    public String toString() {
        return "Medium_Priority_Request [priority=" + priority + ", status=" + status + ", expire=" + expire + "]";
    }
    

}
