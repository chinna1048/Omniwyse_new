public class Test
{   public static void main(String args[])  
    { 

        Patient patient = new Patient();
        //When
        HealthInsurancePlan insurancePlan = new PlatinumPlan();
        
        patient.setInsurancePlan(insurancePlan);
        System.out.println(patient.getInsurancePlan());
        double[] payments = Billing.computePaymentAmount(patient, 1000.0);
            System.out.println(payments[0]);
            System.out.println(payments[1]);
        

        HealthInsurancePlan insurancePlan2 = new GoldPlan();
        
        patient.setInsurancePlan(insurancePlan2);
        System.out.println(patient.getInsurancePlan());
        double[] payments1 = Billing.computePaymentAmount(patient, 1000.0);
            System.out.println(payments1[0]);
            System.out.println(payments1[1]);
        
        HealthInsurancePlan insurancePlan3 = new SilverPlan();
        
        patient.setInsurancePlan(insurancePlan3);
        System.out.println(patient.getInsurancePlan());
        double[] payments2 = Billing.computePaymentAmount(patient, 1000.0);
            System.out.println(payments2[0]);
            System.out.println(payments2[1]);

        HealthInsurancePlan insurancePlan4 = new PlatinumPlan();
        
        patient.setInsurancePlan(insurancePlan4);
        System.out.println(patient.getInsurancePlan());
        double[] payments3 = Billing.computePaymentAmount(patient, 1000.0);
            System.out.println(payments3[0]);
            System.out.println(payments3[1]);
    }
}

/*
PlatinumPlan@6bc7c054
900.0
50.0
GoldPlan@232204a1
800.0
160.0
SilverPlan@4aa298b7
700.0
270.0
PlatinumPlan@7d4991ad
900.0
50.0
*/