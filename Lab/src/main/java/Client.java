
import java.util.*;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your ContractID:");
        int ContractID = sc.nextInt();
        System.out.println("Type your RentAmount:");
        int RentAmount = sc.nextInt();
        System.out.println("Type your TenantID:");
        int TenantID = sc.nextInt();
        System.out.println("Type your PropertyID:");
        int PropertyID = sc.nextInt();
        System.out.println("Type your contract options:");
        String type = sc.next();

        switch (type) {
            case "long-term":
                LongTerm longTerm = new LongTerm(ContractID, PropertyID, TenantID, RentAmount);
                System.out.println(longTerm);
                break;
                  case "short-term":
                ShortTerm shortTerm = new ShortTerm(ContractID, PropertyID, TenantID, RentAmount);
                System.out.println(shortTerm);
                break;
                  case "permanent":
                Permanent permanent = new Permanent(ContractID, PropertyID, TenantID, RentAmount);
                System.out.println(permanent);
                break;
            default:
                System.err.println("Wrong input");
        }

    }
}
