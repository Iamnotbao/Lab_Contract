package Maintenance_Request;

import java.time.LocalDate;

public class High_Priority_Request extends Maintenance_Requests{
    private String priority;
    private String status;
    private String expire;
    @Override
    public void setPriority() {
        // TODO Auto-generated method stub
        this.priority="Emergency";
    }

    @Override
    public void setStatus() {
       this.status="Accept";
    }

    @Override
    public void setExpire() {
      this.expire=LocalDate.now().toString();
    }

    @Override
    public void processRequest() {
       System.out.println("“Emergency request, our\r\n" + //
                      "Administer will contact you immediately !”");
    }

    @Override
    public String toString() {
        return "High_Priority_Request [priority=" + priority + ", status=" + status + ", expire=" + expire + "]";
    }
    
    
}
