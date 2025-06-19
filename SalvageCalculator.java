import java.util.Scanner;

class SalvageCalculator {
    static double calSalvage(double pPrice, double dVal, int y) {
        return pPrice - (dVal * y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Purchase Price: ");
        double pPrice = sc.nextDouble();
        
        System.out.print("Enter Depreciation Value: ");
        double dVal = sc.nextDouble();
        
        System.out.print("Enter Years of Service: ");
        int y = sc.nextInt();
        
        if (y <= 0) {
            System.out.println("Years of service must be greater than zero.");
        } else {
            double salvageVal = calSalvage(pPrice, dVal, y);
            System.out.printf("Yearly Depreciation = %.2f\n", salvageVal);
        }
    }
}