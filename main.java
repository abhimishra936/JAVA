import java.util.Scanner;
class myTime
{
   int h,m,s;
   public void getTime(int h,int m,int s)
   {
      this.s=s%60;
      this.m=(m%60)+(s/60);
      this.h=h+(m/60);
   }
   public void showTime()
   {
      System.out.print(h+":"+m+":"+s);
   }
}
   class main
   {
      static Scanner input;
      public static void main(String[] args)
      {
         System.out.print("Enter H:");
         input=new Scanner(System.in);
         int h=input.nextInt();
         System.out.print("Enter M:");
         input=new Scanner(System.in);
         int m=input.nextInt();
         System.out.print("Enter S:");
         input=new Scanner(System.in);
         int s=input.nextInt();
         myTime obj=new myTime();
         obj.getTime(h,m,s);
         obj.showTime();
      }
   }
