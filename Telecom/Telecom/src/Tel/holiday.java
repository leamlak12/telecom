
package Tel;
import java.util.Scanner;

public class holiday {
    static Scanner input=new Scanner(System.in);
    public  int holidayPackage(){
        try{
        System.out.println("Gena Holiday Package");
        System.out.println("1.For Yourself");
        System.out.println("2.For gift");
        System.out.println("*.Back\n");
        System.out.print("Enter your choose:");
        int b=input.nextInt();
        System.out.print("\n");
        return b;
        }catch (Exception e){
            System.out.println("Invalid");
       
         }
        return 0;
    }
    public  int forYourSelf(){
        try{
        System.out.println("For Yourself");
        System.out.println("1.Daily");
        System.out.println("2.Weekly");
        System.out.println("3.Monthly");
        System.out.println("#.Next page*.Back");
        System.out.println("**.Main Menu\n");
        System.out.print("Enter your choose:");
        int c=input.nextInt();
        return c;
        }catch (Exception e){
            System.out.println("Invalid");
     
         }
        return 0;}
     public  int forgift(){
         try{
        System.out.println("For gift");
        System.out.println("1.Daily");
        System.out.println("2.Weekly");
        System.out.println("3.Monthly");
        System.out.println("#.Next page*.Back");
        System.out.println("**.Main Menu\n");
        System.out.print("Enter your choose:");
        int c=input.nextInt();
        return c;
         }catch (Exception e){
             System.out.println("Invalid");
        
         }
        return 0;}
    public  int HDaily(){
        try{
        System.out.println("Daily");
        System.out.println("1.Birr 6 for 28 Min&&10 SMS");
        System.out.println("2.Birr 6 for 104MB&&10 SMS");
        System.out.println("3.Birr 14 for 34 Min&&24 SMS");
        System.out.println("*.Back");
        System.out.println("**.Main Menu\n");
        System.out.print("Enter your choose:");
        int e=input.nextInt();
        System.out.print("\n");
        return e;
        }catch (Exception e){
            System.out.println("Invalid");
        
         }
        return 0;
    }
    public  int HWeekly(){
        try{
        System.out.println("weekly");
        System.out.println("1.Birr 24 for 144 Min&&44 SMS");
        System.out.println("2.Birr 6 for 454MB&&44 SMS");
        System.out.println("3.Birr 14 for 114 Min,32MB&&54 SMS");
        System.out.println("*.Back");
        System.out.println("**.Main Menu\n");
        System.out.print("Enter your choose:");
        int e=input.nextInt();
        System.out.print("\n");
        return e;
         }catch (Exception e){
             System.out.println("Invalid");
      
         }
        return 0;}
    public int HMonthly(){
        try{
        System.out.println("Monthly");
       System.out.println("1.Birr 24 for 264 Min&&74 SMS");
        System.out.println("2.Birr 6 for 1294MB&&74 SMS");
        System.out.println("3.Birr 14 for 274 Min,151MB&&84 SMS");
        System.out.println("*.Back");
        System.out.println("**.Main Menu\n");
        System.out.print("Enter your choose:");
        int e=input.nextInt();
        System.out.print("\n");
        return e;
         }catch (Exception e){
             System.out.println("Invalid");
        
         }
        return 0;}
}

        
    

    