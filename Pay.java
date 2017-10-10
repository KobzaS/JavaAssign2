class Pay
{
    private float hours, rate;
    private int hrsStart;
    private double grossPay, tax, grossPayCalc;
    public double calc_PayRoll()
    {
        if (hrsStart = 0)
        {
            grossPay = hours*rate;
        }
        
        if (hours > hrsStart)
        {
            grossPayCalc = hours - hrsStart;
            hours = hrsStart;
            grossPay = hours * rate;
            grossPay += grossPayCalc * (rate*1.33);
        }
        else 
        {
            grossPay = hours * rate;
        }
        return grossPay;
    }
    public double tax()
    {
        if (grossPay < 400 && grossPay >= 0)
        tax = 8;
        else if (grossPay < 900 && grossPay >= 400)
        tax = 12;
        else if (grossPay >= 900)
        tax = 16;

        return tax;
    }
    public void setHours (float h)
    {
        hours = h;
    }
    public void setRate(float r)
    {
        rate = r;
    }
    public void setHrsStr(int hs)
    {
        hrsStart = hs;
    }
    public float getHours()
    {
        return hours;
    }
    public float getRate()
    {
        return rate;
    }
    public int getHrsStr()
    {
        return hrsStart;
    }
}