import java.math.*;
import java.text.NumberFormat;
class CalPayroll extends Pay
{
    public void displayInfo()
    {
        Payroll PR = new Payroll();
        NumberFormat dollars = NumberFormat.getCurrencyInstance();
        System.out.println("Gross pay is : $" + dollars(calc_PayRoll()));
        System.out.println("Tax is       : " + tax() + "%");
        System.out.println("Net pay is   : $" + dollars(PR.calc_PayRoll()));

    }
}