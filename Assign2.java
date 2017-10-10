class Assign2
{

   public static void main(String[] args)
   {
      CalPayroll cal = new CalPayroll();
      Accept ac1 = new Accept();
      Screen sc1 = new Screen();
      
      cal.acceptPay();  
      
      System.out.print("Press 'e' to exit or any other leter + Enter to continue: ");
      char choice = ac1.AcceptInputChar();
      if (choice == 'e' || choice == 'E')
      {
         System.exit(0);
      }
      else
      {
         sc1.scrollScreen(45);
         cal.acceptPay();
      }
   }
}