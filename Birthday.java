package com.other;

import com.csvHandler.CSVHandler;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Birthday {
    public static void happy(String bUrl,String month,int day) throws Exception {
        
    	StringBuilder builder = CSVHandler.getContent(bUrl);

    	System.out.println(bUrl);
        
//        String regEx = "<div class=\"wrapper\">(.*?)<h3>Biography</h3>(.*?)<p>(.*?)<br>(.*?)<br>(.*?)</p>(.*?)<h2 class=\"person-name\">(.*?)</h2>(.*?)<div class=\"quote-text\">(.*?)</div>";

        String reg =  "<div class=\"wrapper\">(.*?)<SPAN CLASS=\"h3\">Biography</SPAN>(.*?)<p>(.*?)<br>(.*?)<br>(.*?)</p>(.*?)<h2 class=\"person-name\">(.*?)</h2>(.*?)<div class=\"quote-text\">(.*?)</div>";
       
        Pattern pattern = Pattern.compile(reg);

        Matcher matcher = pattern.matcher(builder.toString());

        if(month.equalsIgnoreCase("01") || month.equals("1"))
        {
            month = "January";
        }
        else if(month.equalsIgnoreCase("02")  || month.equals("2"))
        {
            month = "February";
        }
        else if(month.equalsIgnoreCase("03")  || month.equals("3"))
        {
            month = "March";
        }
        else if(month.equalsIgnoreCase("04")  || month.equals("4"))
        {
            month = "April";
        }
        else if(month.equalsIgnoreCase("05")  || month.equals("5"))
        {
            month = "May";
        }
        else if(month.equalsIgnoreCase("06")  || month.equals("6"))
        {
            month = "June";
        }
        else if(month.equalsIgnoreCase("07")  || month.equals("7"))
        {
            month = "July";
        }
        else if(month.equalsIgnoreCase("08")  || month.equals("8"))
        {
            month = "August";
        }
        else if(month.equalsIgnoreCase("09")  || month.equals("9"))
        {
            month = "September";
        }
        else if(month.equalsIgnoreCase("10"))
        {
            month = "October";
        }
        else if(month.equalsIgnoreCase("11"))
        {
            month = "November";
        }
        else if(month.equalsIgnoreCase("12"))
        {
            month = "December";
        }


        String path = "E:\\Celebrity\\"+month +"_"+day +".txt";
        PrintWriter writer = new PrintWriter(new FileWriter(path));

        int nm = 0 ;

        int num = 0;

        while(matcher.find())

        {
        	 System.out.println("*******************Number " + (nm + 1) + " *******************");
             System.out.println("\n" + (nm+1) + ")" + matcher.group(7).trim().toUpperCase());
             System.out.println("\n" + matcher.group(3).trim());
             System.out.println("\n" + matcher.group(4).trim());
             System.out.println("\n" + matcher.group(5).trim());
             System.out.print("\n" + "Their famous quote : \"");
             System.out.println(matcher.group(9).trim() + "\"" + "\n");
            writer.write("*******************Number " + (num + 1) + " *******************"+"\r\n");
            writer.write("\n" + (num+1) + ")" + matcher.group(7).trim().toUpperCase()+"\r\n");
            writer.write("\n" + matcher.group(3).trim()+"\r\n");
            writer.write("\n" + matcher.group(4).trim()+"\r\n");
            writer.write("\n" + matcher.group(5).trim()+"\r\n");
            writer.write("Their famous quote : \""+matcher.group(9).trim() + "\"" + "\n"+"\r\n");
            num++ ;
            nm++;
        }

        writer.flush();
        writer.close();
        System.out.println("Done !!! ");
        System.out.println("File successfully exported to "+path);
    }

}
