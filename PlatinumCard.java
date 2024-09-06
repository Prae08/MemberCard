public class PlatinumCard extends MemberCard{
    public PlatinumCard (String name,double purchaseAmount){
        super(name, purchaseAmount);
        
    }

    @Override
    public double calculateDiscount() {
        return getPurchaseAmount() * .20d;
    }
}
