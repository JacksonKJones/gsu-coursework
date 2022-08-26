import java.util.Scanner;

class payroll {
        public static void main(final String[] args) {
            Scanner input = new Scanner(System.in);
            //Starts Scanner
        
            System.out.println("Enter Employee's Name:");
            final String employee = input.next(); 
            //User inputs Employee Name

            System.out.println("Enter Number of Hours Worked:");
            final double hours = input.nextDouble();
            //User inputs Number of Hours Worked

            System.out.println("Enter Hourly Rate of Pay:");
            final double pay = input.nextDouble();
            //User inputs Hourly Rate of Pay

            final double gross_pay = pay * hours;
            //Calculates Gross Pay based off User input

            System.out.println("Enter Federal Tax Rate:");
            final double fedtax = input.nextDouble();
            //User inputs Federal Tax Rate

            final double deductions = gross_pay * fedtax;
            //Calculates Tax Deducted

            final double net_pay = gross_pay - deductions;
            //Calculates Net Pay

            System.out.println("Employee Name: " + employee);
            System.out.println("Hours Worked:" + hours);
            System.out.println("Hourly Rate: " + pay);
            System.out.println("Gross Pay: " + gross_pay);
            System.out.println("Tax Deducted: " + deductions);
            System.out.println("Net Pay: " + net_pay);
            //Prints All Outputs
    }
}