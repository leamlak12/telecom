
package Tel;
import java.util.Scanner;
import Tel.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class friend {
    static Scanner input=new Scanner(System.in);
    public void friends() throws IOException{
         File f =new File("C:/Users/Zed/Music/Telcome/myfile.txt");
        FileWriter myFile = new FileWriter(f,true);
                  
        PrintWriter pw = new PrintWriter(myFile);
   try{
        gift s=new gift();
    int j=s.forGift();
    
               switch(j){
                   
                           case 1:
                      int z=s.voicePackage();
                      switch(z){
                          case 1:
                              int [] p=new int[3];
                              int a=s.Daily();
                              switch(a){
                     case 1:
                         System.out.println("Please enter the number:");
                         p[0]=input.nextInt();
                        pw.println("Dear Customer,12 Min Daily Package is sucessfully provided to the number "+p[0]);
                        pw.close();
                        break;
                                   
                     case 2:
                         System.out.println("Please enter the number:");
                         p[1]=input.nextInt();
                     pw.println("Dear Customer,20 Min Daily Package is sucessfully provided to the number "+p[1]);
                      pw.close();
                       break;
                                      
                   case 3:
                       System.out.println("Please enter the number:");
                         p[2]=input.nextInt();
                    pw.println("Dear Customer,45 Min Daily Package is sucessfully provided to the number"+p[2]);
                     pw.close();
                       break;
                                      
                              }
                              break;
                          case 2:
                              int [] q=new int[3];
                              int b=s.Weekly();
                              switch(b){
                                  case 1:
                                  System.out.println("Please enter the number:");
                                      q[0]=input.nextInt();
                                  pw.println("Dear Customer,70 Min Daily Package is sucessfully provided to the number "+q[0]);
                                   pw.close();
                                  break;
                                  case 2:
                                  System.out.println("Please enter the number:");
                                     q[1]=input.nextInt();
                                  pw.println("Dear Customer,100 Min Daily Package is sucessfully provided to the number "+q[1]);
                                   pw.close();
                                  break;
                                  case 3:
                                 System.out.println("Please enter the number:");
                                    q[2]=input.nextInt();
                                  pw.println("Dear Customer,130 Min Daily Package is sucessfully provided to the number "+q[2]);
                                   pw.close();
                              }
                              break;
                               case 3:
                                   int [] r=new int[6];
                                   int c=s.Monthly();
                                   switch(c){
                                       case 1:
                                       System.out.println("Please enter the number:");
                                           r[0]=input.nextInt();
                                       pw.println("Dear Customer,125 Min Daily Package is sucessfully provided to the number " +r[0]);
                                        pw.close();
                                       break;
                                       case 2:
                                       System.out.println("Please enter the number:");
                                            r[1]=input.nextInt();
                                       pw.println("Dear Customer,185 Min Daily Package is sucessfully provided to the number " +r[1]);
                                        pw.close();
                                       break;
                                       case 3:
                                      System.out.println("Please enter the number:");
                                          r[2]=input.nextInt();
                                       pw.println("Dear Customer,375 Min Daily Package is sucessfully provided to the number " +r[2]);
                                        pw.close();
                                       break;
                                       case 4:
                                      System.out.println("Please enter the number:");
                                         r[3]=input.nextInt();
                                       pw.println("Dear Customer,500 Min Daily Package is sucessfully provided to the number " +r[3]);
                                        pw.close();
                                       break;
                                       case 5:
                                      System.out.println("Please enter the number:");
                                            r[4]=input.nextInt();
                                       pw.println("Dear Customer,1000 Min Daily Package is sucessfully provided to the number "+ r[4]);
                                        pw.close();
                                       break;
                                       case 6:
                                       System.out.println("Please enter the number:");
                                           r[5]=input.nextInt();
                                       pw.println("Dear Customer,2000 Min Daily Package is sucessfully provided to the number" +r[5]);
                                        pw.close();
                                       break;
                                           
                                       
                                   }
                                   break;
                               case 4:
                                   int []t=new int[2];
                                   int d=s.Night();
                                   switch(d){
                                       case 1:
                                           System.out.println("Please enter the number:");
                                           t[0]=input.nextInt();
                                       pw.println("Dear Customer,60 Min Daily Package is sucessfully provided to the number "+t[0]);
                                        pw.close();
                                       break;
                                       case 2:
                                           System.out.println("Please enter the number:");
                                           t[1]=input.nextInt();
                                       pw.println("Dear Customer,140 Min Daily Package is sucessfully provided to the number "+t[1]);
                                        pw.close();
                                       break;
                                  }
                                   break;
                      }
                        break;  
                               
                       
                   case 2:
                       int a= s.internetPackage();
                       switch(a){
                           case 1:
                               int [] p=new int[4];
                               int b=s.iDaily();
                               switch(b){
                                   case 1:
                                     System.out.println("Please enter the number:");
                                      p[0]=input.nextInt();
                                       pw.println("Dear Customer,35MB Daily Package is sucessfully provided to the number "+p[0]);
                                        pw.close();
                                       break;
                                   case 2:
                                       System.out.println("Please enter the number:");
                                       p[1]=input.nextInt();
                                       pw.println("Dear Customer,75MB Daily Package is sucessfully provided to the number "+p[1]);
                                        pw.close();
                                       break;
                                   case 3:
                                       System.out.println("Please enter the number:");
                                         p[2]=input.nextInt();
                                       pw.println("Dear Customer,200MB Daily Package is sucessfully provided to the number "+p[2]);
                                        pw.close();
                                       break;
                                   case 4:
                                       System.out.println("Please enter the number:");
                                        p[3]=input.nextInt();
                                       pw.println("Dear Customer,500MB Daily Package is sucessfully provided to the number "+p[3]);
                                        pw.close();
                                       break;
                                       
                               }
                               break;
                           case 2:
                                int [] q=new int[3];
                               int c=s.iWeekly();
                               switch(c){
                                    
                                   case 1:
                                       System.out.println("Please enter the number:");
                                      q[0]=input.nextInt();
                                       pw.println("Dear Customer,300MB Weekly Package is sucessfully provided to the number"+q[0]);
                                        pw.close();
                                       break;
                                   case 2:
                                       System.out.println("Please enter the number:");
                                      q[1]=input.nextInt();
                                       pw.println("Dear Customer,600MB Weekly Package is sucessfully provided to the number "+q[1]);
                                        pw.close();
                                       break;
                                   case 3:
                                       System.out.println("Please enter the number:");
                                      q[2]=input.nextInt();
                                       pw.println("Dear Customer,1GBM Weekly Package is sucessfully provided to the number "+q[2]);
                                        pw.close();
                                       break;
                               }
                               break;
                           case 3:
                               int [] r=new int[6];
                               int d=s.iMonthly();
                               switch(d){
                                   case 1:
                                       System.out.println("Please enter the number:");
                                           r[0]=input.nextInt();
                                       pw.println("Dear Customer,500MB Weekly Package is sucessfully provided to the number " +r[0]);
                                        pw.close();
                                       break;
                                   case 2:
                                       System.out.println("Please enter the number:");
                                           r[1]=input.nextInt();
                                       pw.println("Dear Customer,1GB Weekly Package is sucessfully provided to the number " +r[1]);
                                        pw.close();
                                       break;
                                   case 3:
                                       System.out.println("Please enter the number:");
                                           r[2]=input.nextInt();
                                       pw.println("Dear Customer,2GB Weekly Package is sucessfully provided to the number " +r[2]);
                                        pw.close();
                                       break;
                                       case 4:
                                           System.out.println("Please enter the number:");
                                           r[3]=input.nextInt();
                                       pw.println("Dear Customer,4GB Weekly  Package is sucessfully provided to the number "+r[3]);
                                        pw.close();
                                       break;
                                       case 5:
                                           System.out.println("Please enter the number:");
                                           r[4]=input.nextInt();
                                       pw.println("Dear Customer,10GB Weekly Package is sucessfully provided to the number "+r[4]);
                                        pw.close();
                                       break;
                                       
                                       
                               }
                               break;
                           case 4:
                               int []t=new int[3];
                               int e=s.iNight();
                               switch(e){
                                   case 1:
                                       System.out.println("Please enter the number:");
                                           t[0]=input.nextInt();
                                       pw.println("Dear Customer,70MB Night Package is sucessfully provided to the number "+t[0]);
                                        pw.close();
                                       break;
                                   case 2:
                                       System.out.println("Please enter the number:");
                                           t[1]=input.nextInt();
                                       pw.println("Dear Customer,160MB Night Package is sucessfully provided to the number "+t[1]);
                                        pw.close();
                                       break;
                                   case 3:
                                       System.out.println("Please enter the number:");
                                           t[2]=input.nextInt();
                                       pw.println("Dear Customer,300MB Night Package is sucessfully provided to the number"+t[2]);
                                        pw.close();
                                       break;
                                       
                               }
                               break;
                       }
                       break;
                   case 3:
                       int k=s.voicePlusData();
                       switch(k){
                           case 1:
                               int [] p=new int[2];
                               int c=s.vDaily();
                               switch(c){
                                    case 1:
                                        System.out.println("Please enter the number:");
                                       p[0]=input.nextInt();
                                       pw.println("Dear Customer,12 min,160MB,10 SMS Daily Package is sucessfully provided to the number "+p[0]);
                                        pw.close();
                                       break;
                                   case 2:
                                       System.out.println("Please enter the number:");
                                       p[1]=input.nextInt();
                                       pw.println("Dear Customer,28 min, 590MB,10 SMS Daily Package is sucessfully provided to the number "+p[1]);
                                        pw.close();
                                       break;
                                 }
                               break;
                           case 2:
                               int [] q=new int[2];
                               int d=s.vWeekly();
                               switch(d){
                                    case 1:
                                        System.out.println("Please enter the number:");
                                      q[0]=input.nextInt();
                                       pw.println("Dear Customer,70 min,590MB,20 SMS Weekly Package is sucessfully provided to the number"+q[0]);
                                        pw.close();
                                       break;
                                   case 2:
                                       System.out.println("Please enter the number:");
                                      q[1]=input.nextInt();
                                       pw.println("Dear Customer,100 min,1GB,20 SMS Weekly Package is sucessfully provided to the number "+q[1]);
                                        pw.close();
                                       break;
                                   }
                               break;
                           case 3:
                               int [] r=new int[3];
                               int e=s.vMonthly();
                               switch(e){
                                    case 1:
                                        System.out.println("Please enter the number:");
                                           r[0]=input.nextInt();
                                       pw.println("Dear Customer,125 min,2GB,50 SMS Monthly  Package is sucessfully provided to you "+r[0]);
                                        pw.close();
                                       break;
                                   case 2:
                                       System.out.println("Please enter the number:");
                                           r[1]=input.nextInt();
                                       pw.println("Dear Customer,375 min,2GB,50 SMS Monthly Package is sucessfully provided to the number "+ r[1]);
                                        pw.close();
                                       break;
                                   case 3:
                                       System.out.println("Please enter the number:");
                                           r[2]=input.nextInt();
                                       pw.println("Dear Customer,1250 min,unlimited data,50 SMS Monthly Package is sucessfully provided to the number "+r[2]);
                                        pw.close();
                                       break;
                               }
                               break;
                       }
                      break;         
                   
               
               case 4:
                       int u=s.flexiPackage();
                       switch(u){
                           case 1:
                               int [] p=new int[2];
                               int c=s.fDaily();
                               switch(c){
                                    case 1:
                                        System.out.println("Please enter the number:");
                                       p[0]=input.nextInt();
                                       pw.println("Dear Customer,390 Flexi unit Daily Package is sucessfully provided to the number "+p[0]);
                                        pw.close();
                                       break;
                                   
                                 }
                               break;
                           case 2:
                               int [] q=new int[2];
                               int d=s.fWeekly();
                               switch(d){
                                    case 1:
                                        System.out.println("Please enter the number:");
                                      q[0]=input.nextInt();
                                       pw.println("Dear Customer,1320 Flexi unit Weekly Package is sucessfully provided to the number "+q[0]);
                                        pw.close();
                                       break;
                                   
                                   }
                               break;
                           case 3:
                               int [] r=new int[2];
                               int e=s.fMonthly();
                               switch(e){
                                    case 1:
                                        System.out.println("Please enter the number:");
                                           r[0]=input.nextInt();
                                       pw.println("Dear Customer,2280 Flexi unit Monthly  Package is sucessfully provided to the number"+r[0]);
                                        pw.close();
                                       break;
                                   
                               }
                               break;
                       }
                      break;         
                   
               }
    } catch(Exception e){
        System.out.println("Invalid");
    }
       }}
    
    
    
      
    


    
    

