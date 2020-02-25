public class BlueCrossBlueShield implements InsuranceBrand {
    private long id;
    private String name;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking) {
        double premium = 0;
        if (insurancePlan instanceof PlatinumPlan) {
            if (age > 55){
                premium += 200;
            }
            if (smoking){
                premium += 100;
            }
        } else if (insurancePlan instanceof GoldPlan) {
            if (age > 55){
                premium += 150;
            }
            if (smoking){
                premium += 90;
            }
        } else if (insurancePlan instanceof SilverPlan) {
            if (age > 55){
                premium += 100;
            }
            if (smoking){
                premium += 80;
            }
        } else if (insurancePlan instanceof BronzePlan) {
            if (age > 55){
                premium += 50;
            }
            if (smoking){
                premium += 70;
            }
        } else if (insurancePlan == null) {
            System.out.println("Invalid object passed!!, The generation of random numbers is too important to be left to chance.");
        } else {
            System.out.println("Invalid object passed!!");
        }
        return premium;
    }
}
