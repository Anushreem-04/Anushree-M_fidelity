import java.util.Scanner;
class Insurance{
    private String insuranceNo;
    private String insuranceName;
    private double amountCovered;

    public Insurance(String insuranceNo, String insuranceName, double amountCovered) {
        this.insuranceNo = insuranceNo;
        this.insuranceName = insuranceName;
        this.amountCovered = amountCovered;
    }
    public String getInsuranceNo() {
        return insuranceNo;
    }
    public String getInsuranceName() {
        return insuranceName;
    }
    public Double getAmountCovered() {
        return amountCovered;
    }

}
class MotorInsurance extends Insurance{
        private double idv;
        private float depPercent;
    public MotorInsurance(String insuranceNo, String insuranceName, double amountCovered, float depPercent) {
        super(insuranceNo, insuranceName, amountCovered);
        this.depPercent = depPercent;
        this.idv=amountCovered -(amountCovered*depPercent)/100;
    }
    public double calculatePremium(){
        return (idv*0.03);
    }
}
class LifeInsurance extends Insurance{
    private int policyTerm;
    private float benefitPercent;
    public LifeInsurance(String insuranceNo, String insuranceName, double amountCovered, int policyTerm, float benefitPercent) {
        super(insuranceNo, insuranceName, amountCovered);
        this.policyTerm = policyTerm;
        this.benefitPercent = benefitPercent;
    }
    public double calculatePremium(){
        return (getAmountCovered()-((getAmountCovered()*benefitPercent)/100))/policyTerm;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insurance Number: ");
        String insuranceNo = sc.nextLine();
        System.out.println("Insurance Name: ");
        String insuranceName = sc.nextLine();
        System.out.println("Amount covered: ");
        double amountCovered = sc.nextDouble();
        System.out.println("Select ");
        System.out.println("1. life Insurance");
        System.out.println("2. Motor Insurance");
        int option = sc.nextInt();

        double premium=0;

        if (option == 1) {
            System.out.println("Policy term: ");
            int policyTerm = sc.nextInt();
            System.out.println("Benefit percent: ");
            float benefitPercent = sc.nextFloat();
            LifeInsurance lifeInsurance=new LifeInsurance(insuranceNo,insuranceName, amountCovered, policyTerm, benefitPercent);
            premium = addPolicy(lifeInsurance,option);
            System.out.printf(" Calculated Premium: %.2f\n",premium);
        }else if(option == 2) {
            System.out.println("Depreciation term: ");
            float depPercent = sc.nextFloat();
            MotorInsurance motorInsurance = new MotorInsurance(insuranceNo, insuranceName, amountCovered, depPercent);
            premium = addPolicy(motorInsurance, option);
        }
            System.out.printf("Calculated Premium: ", + premium);
        }
        public static double addPolicy(Insurance ins ,int option){
        double premium=0;
        if(option ==1&& ins instanceof LifeInsurance){
            premium=((LifeInsurance)ins).calculatePremium();

        }else if(option ==2&& ins instanceof MotorInsurance){
            premium=((MotorInsurance)ins).calculatePremium();
        }
        return premium;

    }
}