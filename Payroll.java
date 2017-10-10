class Payroll extends Pay
{
    double netPay, grossPay, tax;
    public double calc_PayRoll()
    {
        grossPay = super.calc_PayRoll();

        tax = tax();

        tax += 1;

        netPay = grossPay * tax;

        return netPay;
    }
}