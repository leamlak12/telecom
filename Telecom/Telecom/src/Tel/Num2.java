
package Tel;
import Tel.Num1;
import java.util.Scanner;
import java.io.*;

public class Num2 {
     
      
                
    static Scanner input=new Scanner(System.in);
      
    public void MainMenu() throws IOException{
        try{
          File f =new File("myfile.txt");
        FileWriter myFile = new FileWriter(f,true);
                  
        PrintWriter pw = new PrintWriter(myFile);
    Num1 s=new Num1();
    friend q=new friend();
    holiday r=new holiday();
    PackageStatus m14=new PackageStatus();
    int j=s.menu();
    switch(j) {
           case 1:
               int g=r.holidayPackage();
               switch(g){
                   case 1:
                       int a=r.forYourSelf();
                       switch(a){
                   case 1:
                       int l=r.HDaily();
                       switch(l){
                           case 1:
                               pw.println("Dear Customer,28 Min&&10 SMS Daily Package is sucessfully provided to you");
                               pw.close();
                               break;
                               case 2:
                               pw.println("Dear Customer,104MB&&10 SMS Daily Package is sucessfully provided to you");
                               pw.close();
                               break;
                               case 3:
                               pw.println("Dear Customer,34 Min&&24 SMS Daily Package is sucessfully provided to you");
                               pw.close();
                               break;
                                default:
                               MainMenu();
                       }
                       
                       break;
                   case 2:
                       int m=r.HWeekly();
                       switch(m){
                           case 1:
                               pw.println("Dear Customer,144 Min&&44 SMS Weekly Package is sucessfully provided to you");
                               pw.close();
                               break;
                               case 2:
                               pw.println("Dear Customer,454MB&&44 SMS Weekly Package is sucessfully provided to you");
                               pw.close();
                               break;
                               case 3:
                               pw.println("Dear Customer,114 Min,32MB&&54 SMS  Weekly Package is sucessfully provided to you");
                               pw.close();
                               break;
                                default:
                               MainMenu();
                               
                           
                       }
                       break;
                   case 3:
                       int n=r.HMonthly();
                       switch(n){
                           case 1:
                               pw.println("Dear Customer,264 Min&&74 SMS Monthly Package is sucessfully provided to you");
                               pw.close();
                               break;
                               case 2:
                               pw.println("Dear Customer,1294MB&&74 SMS Monthly Package is sucessfully provided to you");
                               pw.close();
                               break;
                               case 3:
                               pw.println("Dear Customer,274 Min,151MB&&84 SMS Monthly Package is sucessfully provided to you");
                               pw.close();
                               break;
                               default:
                               MainMenu();
                       }
                       
                       break;
                        default:
                               MainMenu();
               }
                      
               break;
                   case 2:
                       int [] o=new int[2];
                       int b=r.forgift();
                       switch(b){
                         case 1:
                             int l=r.HDaily();
                       switch(l){
                           case 1:
                          System.out.println("Please enter the number:");
                                           o[0]=input.nextInt();
                               pw.println("Dear Customer,28 Min&&10 SMS Daily Package is sucessfully provided to the number "+o[0]);
                               pw.close();
                               break;
                               case 2:
                                   System.out.println("Please enter the number:");
                                           o[0]=input.nextInt();
                               pw.println("Dear Customer,104MB&&10 SMS Daily Package is sucessfully provided to the number "+o[0]);
                               pw.close();
                               break;
                               case 3:
                                   System.out.println("Please enter the number:");
                                           o[0]=input.nextInt();
                               pw.println("Dear Customer,34 Min&&24 SMS Daily Package is sucessfully provided to the number "+o[0]);
                               pw.close();
                               break;
                               default:
                               MainMenu();
                       }
                       break;
                   case 2:
                       int m=r.HWeekly();
                       switch(m){
                           case 1:
                               System.out.println("Please enter the number:");
                                           o[0]=input.nextInt();
                               pw.println("Dear Customer,144 Min&&44 SMS Weekly Package is sucessfully provided to the number "+o[0]);
                               pw.close();
                               break;
                               case 2:
                                   System.out.println("Please enter the number:");
                                           o[0]=input.nextInt();
                               pw.println("Dear Customer,454MB&&44 SMS Weekly Package is sucessfully provided to the number "+o[0]);
                               pw.close();
                               break;
                               case 3:
                                   System.out.println("Please enter the number:");
                                           o[0]=input.nextInt();
                               pw.println("Dear Customer,114 Min,32MB&&54 SMS  Weekly Package is sucessfully provided to the number "+o[0]);
                               pw.close();
                               break;
                               default:
                               MainMenu();
                           
                       }
                       break;
                       default:
                               MainMenu();
                   case 3:
                       
                       int n=r.HMonthly();
                       switch(n){
                           
                           case 1:
                               System.out.println("Please enter the number:");
                                           o[0]=input.nextInt();
                               pw.println("Dear Customer,264 Min&&74 SMS Monthly Package is sucessfully provided to the number "+o[0]);
                               pw.close();
                               break;
                               case 2:
                                   System.out.println("Please enter the number:");
                                           o[0]=input.nextInt();
                               pw.println("Dear Customer,1294MB&&74 SMS Monthly Package is sucessfully provided to the number "+o[0]);
                               pw.close();
                               break;
                               case 3:
                                   System.out.println("Please enter the number:");
                                           o[0]=input.nextInt();
                               pw.println("Dear Customer,274 Min,151MB&&84 SMS Monthly Package is sucessfully provided to the number"+o[0]);
                               pw.close();
                               break;  
                           default:
                               MainMenu();
                       }
                       break;
              
               }
               break;
               }
               break;
               default:
                               MainMenu();
           case 2:
               int x=s.Package();
               switch(x){
                   case 1:
                       int y= s.forYourSelf();
                       switch(y){
                           case 1:
                      int z=s.voicePackage();
                      switch(z){
                          case 1:
                              int a=s.Daily();
                              switch(a){
                     case 1:
                     pw.println("Dear Customer,12 Min Daily Package is sucessfully provided to you");
                     pw.close();
                      break;
                                   
                     case 2:
                   pw.println("Dear Customer,20 Min Daily Package is sucessfully provided to you");
                   pw.close();
                       break;
                                      
                   case 3:
                 pw.println("Dear Customer,45 Min Daily Package is sucessfully provided to you");
                 pw.close();
                       break;
                                     
                              }
                              break;
                          case 2:
                              int b=s.Weekly();
                              switch(b){
                                  case 1:
                                  pw.println("Dear Customer,70 Min Daily Package is sucessfully provided to you");
                                  pw.close();
                                  break;
                                  case 2:
                                  pw.println("Dear Customer,100 Min Daily Package is sucessfully provided to you");
                                  pw.close();
                                  break;
                                  case 3:
                                  pw.println("Dear Customer,130 Min Daily Package is sucessfully provided to you");
                                  pw.close();
                                  
                              }
                              break;
                             
                               case 3:
                                   int c=s.Monthly();
                                   switch(c){
                                       case 1:
                                       pw.println("Dear Customer,125 Min Daily Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                       case 2:
                                       pw.println("Dear Customer,185 Min Daily Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                       case 3:
                                       pw.println("Dear Customer,375 Min Daily Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                       case 4:
                                       pw.println("Dear Customer,500 Min Daily Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                       case 5:
                                       pw.println("Dear Customer,1000 Min Daily Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                       case 6:
                                       pw.println("Dear Customer,2000 Min Daily Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                       
                                           
                                       
                                   }
                                   break;
                               case 4:
                                   int d=s.Night();
                                   switch(d){
                                       case 1:
                                       pw.println("Dear Customer,60 Min Daily Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                       case 2:
                                       pw.println("Dear Customer,140 Min Daily Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                       
                                  }
                                   
                      }
                        break;  
                              
                       
                   case 2:
                       int a= s.internetPackage();
                       switch(a){
                           case 1:
                               int b=s.iDaily();
                               switch(b){
                                   case 1:
                                       pw.println("Dear Customer,35MB Daily Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                   case 2:
                                       pw.println("Dear Customer,75MB Daily Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                   case 3:
                                       pw.println("Dear Customer,200MB Daily Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                   case 4:
                                       pw.println("Dear Customer,500MB Daily Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                        
                               }
                               break;
                           case 2:
                               int c=s.iWeekly();
                               switch(c){
                                   case 1:
                                       pw.println("Dear Customer,300MB Weekly Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                   case 2:
                                       pw.println("Dear Customer,600MB Weekly Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                   case 3:
                                       pw.println("Dear Customer,1GBM Weekly Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                        
                               }
                               break;
                           case 3:
                               int d=s.iMonthly();
                               switch(d){
                                   case 1:
                                       pw.println("Dear Customer,500MB Weekly Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                   case 2:
                                       pw.println("Dear Customer,1GB Weekly Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                   case 3:
                                       pw.println("Dear Customer,2GB Weekly Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                       case 4:
                                       pw.println("Dear Customer,4GB Weekly  Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                       case 5:
                                       pw.println("Dear Customer,10GB Weekly Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                      
                                       
                               }
                               break;
                           case 4:
                               int e=s.iNight();
                               switch(e){
                                   case 1:
                                       pw.println("Dear Customer,70MB Night Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                   case 2:
                                       pw.println("Dear Customer,160MB Night Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                   case 3:
                                       pw.println("Dear Customer,300MB Night Package is sucessfully provided to you");
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
                               int c=s.vDaily();
                               switch(c){
                                    case 1:
                                       pw.println("Dear Customer,12 min,160MB,10 SMS Daily Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                   case 2:
                                       pw.println("Dear Customer,28 min, 590MB,10 SMS Daily Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                        
                                 }
                               break;
                           case 2:
                               int d=s.vWeekly();
                               switch(d){
                                    case 1:
                                       pw.println("Dear Customer,70 min,590MB,20 SMS Weekly Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                   case 2:
                                       pw.println("Dear Customer,100 min,1GB,20 SMS Weekly Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                       
                                   }
                               break;
                           case 3:
                               int e=s.vMonthly();
                               switch(e){
                                    case 1:
                                       pw.println("Dear Customer,125 min,2GB,50 SMS Monthly  Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                   case 2:
                                       pw.println("Dear Customer,375 min,2GB,50 SMS Monthly Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                   case 3:
                                       pw.println("Dear Customer,1250 min,unlimited data,50 SMS Monthly Package is sucessfully provided to you");
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
                               int c=s.fDaily();
                               switch(c){
                                    case 1:
                                       pw.println("Dear Customer,390 Flexi unit Daily Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                    
                                 }
                               break;
                           case 2:
                               int d=s.fWeekly();
                               switch(d){
                                    case 1:
                                       pw.println("Dear Customer,1320 Flexi unit Weekly Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                   
                                   }
                               break;
                           case 3:
                               int e=s.fMonthly();
                               switch(e){
                                    case 1:
                                       pw.println("Dear Customer,2280 Flexi unit Monthly  Package is sucessfully provided to you");
                                       pw.close();
                                       break;
                                    
                               }
                               break;
                                default:
                               MainMenu();
                       }
                      break;   
                      
                   
               }
                       break;
                   case 2:
                       q.friends();
                       break;
                        
                       
    } 
               break;
           case 3:
                m14.ps();
                break;
                
                
       }
        }catch(Exception e){
            System.out.println("Try again");
          
        }
    }
    }


    
    
      
    

