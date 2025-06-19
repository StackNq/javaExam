import java.util.Scanner;

class DepreciationCalculator {
    static double calDepr(double pPrice, double salvageVal, int y) {
        return (pPrice - salvageVal) / y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Purchase Price: ");
        double pPrice = sc.nextDouble();
        
        System.out.print("Enter Salvage Value: ");
        double salvageVal = sc.nextDouble();
        
        System.out.print("Enter Years of Service: ");
        int y = sc.nextInt();
        
        if (y <= 0) {
            System.out.println("Years of service must be greater than zero.");
        } else {
            double yearlyDepreciation = calDepr(pPrice, salvageVal, y);
            System.out.printf("Yearly Depreciation = %.2f\n", yearlyDepreciation);
        }
    }
}
