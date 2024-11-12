import java.time.LocalDate;

public class Low_Priority_Request extends Maintenance_Requests{
    private String priority;
    private String status;
    private String expire;

    @Override
    void setPriority() {
       this.priority="Ignore";
    }

    @Override
    void setStatus() {
        this.status="Done";
    }

    @Override
    void setExpire() {
        this.expire= LocalDate.now().toString();  
    }

    @Override
    void processRequest() {
        System.out.println("Request denied");
    }

    @Override
    public String toString() {
        return "Low_Priority_Request [priority=" + priority + ", status=" + status + ", expire=" + expire
                + "]";
    }
    
}
