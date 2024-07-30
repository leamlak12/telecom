
package Tel;

import java.io.IOException;
import java.util.Scanner;


public class Num1 {
    static Scanner input=new Scanner(System.in);
    
      
                
    
  
    public  int menu(){
        try{
         System.out.println("***********************************************");
        System.out.println("        Welcome to ethio gebeta      ");
        System.out.println("        1. Holiday Package      ");
        System.out.println("        2. Packages                  ");
        System.out.println("        3. Package Status     ");
       
        System.out.print("Enter your choose:");
        int a=input.nextInt();
        System.out.print("\n");
       
       return a;
       }catch (Exception e){
        System.out.println("Invalid");
         Num2 m=new Num2();
      
                
        
         }
        
        return 0;
       
    }
    public  int Package() {
        try{
        System.out.println("Package");
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
        return 0;}
    public  int forYourSelf(){
        try{
        System.out.println("For Yourself");
        System.out.println("1.voice Package");
        System.out.println("2.internet Package");
        System.out.println("3.Voice Plus Data");
        System.out.println("4.Flexi Package");
        System.out.println("5.Unlimited Premium Package");
        System.out.println("6.Unlimited Daily voice Package");
        System.out.println("#.Next page*.Back");
        System.out.println("**.Main Menu\n");
        System.out.print("Enter your choose:");
        int c=input.nextInt();
        System.out.print("\n");
        return c;
         }catch (Exception e){
       System.out.println("Invalid");
         }
        return 0;
         }
    
    
    public  int voicePackage(){
        try{
        System.out.println("Voice Package");
        System.out.println("1.Daily");
        System.out.println("2.Weekly");
        System.out.println("3.Monthly");
        System.out.println("4.Night");
        System.out.println("*.Back");
        System.out.println("**.Main Menu\n");
        System.out.print("Enter your choose:");
        int d=input.nextInt();
        System.out.print("\n");
        return d;
         }catch (Exception e){
       System.out.println("Invalid");
         }
        return 0;
    }
    public  int Daily(){
        try{
        System.out.println("Daily");
        System.out.println("1.Birr 3 for 12 Min");
        System.out.println("2.Birr 5 for 20 Min");
        System.out.println("3.Birr 10 for 45 Min");
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
    public  int Weekly(){
        try{
        System.out.println("weekly");
        System.out.println("1.Birr 15 for 70 Min");
        System.out.println("2.Birr 20 for 100 Min");
        System.out.println("3.Birr 25 for 130 Min");
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
    public int Monthly(){ 
        try{
        System.out.println("Monthly");
        System.out.println("1.Birr 35 for 125 Min");
        System.out.println("2.Birr 50 for 185 Min");
        System.out.println("3.Birr 95 for 375 Min");
        System.out.println("4.Birr 120 for 500 Min");
        System.out.println("5.Birr 200 for 1000 Min");
        System.out.println("6.Birr 380 for 2000 Min");
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
    public  int Night(){
        try{
        System.out.println("Daily");
        System.out.println("1.Birr 3 for 60 Min");
        System.out.println("2.Birr 6 for 140 Min");
        System.out.println("*.Back");
        System.out.println("**.Main Menu\n");
        System.out.print("Enter your choose:");
        int e=input.nextInt();
        System.out.print("\n");
        return e;
         }catch (Exception e){
      System.out.println("Invalid");  }
        return 0;}
    public  int internetPackage(){
        try{
        System.out.println("internet package");
        System.out.println("1.Daily");
        System.out.println("2.Weekly");
        System.out.println("3.Monthly");
        System.out.println("4.Night");
        System.out.println("*.Back");
        System.out.println("**.Main Menu\n");
        System.out.print("Enter your choose:");
        int d=input.nextInt();
        System.out.print("\n");
        return d;
         }catch (Exception e){
       System.out.println("Invalid");
         }
        return 0;
    }
    public  int iDaily(){
        try{
        System.out.println("Daily");
        System.out.println("1.Birr 3 for 35 MB");
        System.out.println("2.Birr 5 for 75 MB");
        System.out.println("3.Birr 12 for 200 MB");
        System.out.println("4.Birr 25 for 500 MB");
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
     public  int iWeekly(){
         try{
        System.out.println("weekly");
        System.out.println("1.Birr 24 for 300 MB");
        System.out.println("2.Birr 38 for 600 MB");
        System.out.println("3.Birr 56 for 1 GB ");
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
     public  int iMonthly(){
         try{
        System.out.println("Monthly");
        System.out.println("1.Birr 35 for 500 MB");
        System.out.println("2.Birr 60 for 1GB");
        System.out.println("3.Birr 105 for 2GB");
        System.out.println("4.Birr 200 for 4GB");
        System.out.println("5.Birr 420 for 10GB");
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
    public  int iNight(){
        try{
        System.out.println("Daily");
        System.out.println("1.Birr 3 for 70 MB");
        System.out.println("2.Birr 5 for 160 MB");
        System.out.println("3.Birr 7 for 300 MB");
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
    public int voicePlusData(){
        try{
        System.out.println("Voice Plus Data Package");
        System.out.println("1.Daily");
        System.out.println("2.Weekly");
        System.out.println("3.Monthly");
        System.out.println("*.Back");
        System.out.println("**.Main Menu\n");
        System.out.print("Enter your choose:");
        int d=input.nextInt();
        System.out.print("\n");
        return d;
        }catch (Exception e){
        System.out.println("Invalid");
         }
        return 0;
    }
     public  int vDaily(){
         try{
        System.out.println("Daily");
        System.out.println("1.Birr 12 for 12 min,160 MB,10 SMS");
        System.out.println("2.Birr 33 for 28 min,590 MB,10 SMS");
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
     public  int vWeekly(){
         try{
        System.out.println("weekly");
        System.out.println("1.Birr 50 for 70 min, 300 MB,20 SMS");
        System.out.println("2.Birr 76 for 100 min,1GB,20 SMS");
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
     public  int vMonthly(){
         try{
        System.out.println("Monthly");
        System.out.println("1.Birr 140 for 125 min,2GB,50 SMS");
        System.out.println("2.Birr 200 for 375 min,2GB,50 SMS");
        System.out.println("3.Birr 1663 for 1250 min,unlimited data,50 SMS ");
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
    public  int flexiPackage(){
        try{
        System.out.println("Flexi Package");
        System.out.println("1.Daily");
        System.out.println("2.Weekly");
        System.out.println("3.Monthly");
        System.out.println("*.Back");
        System.out.println("**.Main Menu\n");
        System.out.print("Enter your choose:");
        int d=input.nextInt();
        System.out.print("\n");
        return d;
         }catch (Exception e){
      System.out.println("Invalid");
         }
        return 0;
        
    }
    public  int fDaily(){
        try{
        System.out.println("Daily");
        System.out.println("1.Birr 15 for 390 Flexi unit");
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
     public  int fWeekly(){
         try{
        System.out.println("weekly");
        System.out.println("1.Birr 50 for 1320 Flexi unit");
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
     public  int fMonthly(){
         try{
        System.out.println("Monthly");
        System.out.println("1.Birr 100 for 2280 Flexi unit");
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
