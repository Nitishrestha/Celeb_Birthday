
package com.main;

import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import com.other.Birthday;
import com.other.DateFilterer;
import com.other.MonthDate;

public class Program
{
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        menu();
        
        while(scanner.hasNext())
        {
            String num = scanner.next();
            if(num.equals("1"))
            {
            	 Date currentDate = new Date();

                 String date = currentDate.toString();

                 System.out.println(date);

                 System.out.println("Celebrity/Celebrities having birthday today ("+date +") are :"+"\n");

                 String[] da= DateFilterer.dateFilterer(date); // gets Month and date
                 
                 Map<String,Integer> numericalDate = MonthDate.monthDate(da); // gets number format eg 12 09

                 for(Map.Entry<String,Integer> map : numericalDate.entrySet())

                 {
                     String month = map.getKey();

                     int day = map.getValue() ;
                     
                     String webUrl = "http://www.born-today.com/Today/" +month +"-" +day +".htm";
                     
                     Birthday.happy(webUrl,month,day);
                 }
                 menu();
             
          
            }
            else if (num.equals("2"))
            {
                    System.out.println("Please Enter the date in similar order.");
                    System.out.println("For example: 05-25 for 25th of May, 12-08 for 8th of December.");
                    String detail = scanner.next();
                String[] det = detail.split("-");
                String mo = det[0];
                int da = Integer.parseInt(det[1]);
                    String web = "http://www.born-today.com/Today/" + detail + ".htm ";
                    Birthday.happy(web,mo,da);
                menu();
            }
                else if (num.equals("3"))
            {
                System.out.println("Do you really wanna exit ? (Y/N)");
                String yn = scanner.next();
                if(yn.equalsIgnoreCase("Y"))
                {
                    scanner.close();
                    System.out.println("Program terminated successfully ! ");
                    System.exit(0);
                }
                else if(yn.equalsIgnoreCase("N"))
                {
                    menu();
                }
                else if(!num.equalsIgnoreCase("N") || !num.equalsIgnoreCase("Y") )
                {
                    System.out.println("Please enter proper value next time.");
                    menu();
                }
            }
                }
        }
    public static void menu() throws Exception
    {
        System.out.println("-------------------------------------------------------");
        System.out.println("Welcome to Celebrity Birthday Information.");
        System.out.println("-------------------------------------------------------\n");
        System.out.println("Press'1' if you want to list out today's celebrity.");
        System.out.println("Press '2' if you want to enter the date.");
        System.out.println("Press '3' to quit.");
    }
    
}