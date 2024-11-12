import java.time.LocalDate;

public class High_Priority_Request extends Maintenance_Requests{
    private String priority;
    private String status;
    private String expire;
    @Override
    void setPriority() {
        // TODO Auto-generated method stub
        this.priority="Emergency";
    }

    @Override
    void setStatus() {
       this.status="Accept";
    }

    @Override
    void setExpire() {
      this.expire=LocalDate.now().toString();
    }

    @Override
    void processRequest() {
       System.out.println("“Emergency request, our\r\n" + //
                      "Administer will contact you immediately !”");
    }

    @Override
    public String toString() {
        return "High_Priority_Request [priority=" + priority + ", status=" + status + ", expire=" + expire + "]";
    }
    
    
}
