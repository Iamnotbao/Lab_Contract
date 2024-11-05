
public class Permanent implements Contract{
    private int ContractID;
    private int RentalAmount;
    private int TenantID;
    private int PropertyID;

    public Permanent(int ContractID, int RentalAmount, int TenantID, int PropertyID) {
        this.ContractID = ContractID;
        this.RentalAmount = RentalAmount;
        this.TenantID = TenantID;
        this.PropertyID = PropertyID;
    }
    
    @Override
    public int BuildContractID() {
        return this.ContractID;
    }

    @Override
    public int BuildPropertyID() {
       return this.PropertyID;
    }

    @Override
    public int BuildTenantID() {
       return this.TenantID;
    }

    @Override
    public int BuildRentAmount() {
        return this.RentalAmount;
    }

    @Override
    public Contract SignContract() {
       Contract contract = new Permanent(1,2,3,4);
       return contract;
    }

    public int getContractID() {
        return ContractID;
    }

    public void setContractID(int ContractID) {
        this.ContractID = ContractID;
    }

    public int getRentalAmount() {
        return RentalAmount;
    }

    public void setRentalAmount(int RentalAmount) {
        this.RentalAmount = RentalAmount;
    }

    public int getTenantID() {
        return TenantID;
    }

    public void setTenantID(int TenantID) {
        this.TenantID = TenantID;
    }

    public int getPropertyID() {
        return PropertyID;
    }

    public void setPropertyID(int PropertyID) {
        this.PropertyID = PropertyID;
    }
   
    
    
    
}
