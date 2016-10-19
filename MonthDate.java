package com.other;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by TOPSHI KREATS on 8/28/2016.
 */
public class MonthDate {
    public static Map<String,Integer> monthDate(String[] date)
    {
        Map<String,Integer> monthDate = new HashMap<>();

        String month = "01" ;

        int i = 0 ;

        if(date[i].equalsIgnoreCase("jan") || date[i].equalsIgnoreCase("january"))
        {
            month ="01" ;
        }

        else if(date[i].equalsIgnoreCase("feb") || date[i].equalsIgnoreCase("february"))
        {
            month = "02";
        }
        else if(date[i].equalsIgnoreCase("mar") || date[i].equalsIgnoreCase("march"))
        {
            month = "03";
        }
        else if(date[i].equalsIgnoreCase("apr") || date[i].equalsIgnoreCase("april"))
        {
            month ="04" ;
        }
        else if(date[i].equalsIgnoreCase("may"))
        {
            month ="05" ;
        }
        else if(date[i].equalsIgnoreCase("jun") || date[i].equalsIgnoreCase("june"))
        {
            month ="06" ;
        }
        else if(date[i].equalsIgnoreCase("jul") || date[i].equalsIgnoreCase("july"))
        {
            month ="07" ;
        }
        else if(date[i].equalsIgnoreCase("aug") || date[i].equalsIgnoreCase("August"))
        {
            month = "08" ;
        }
        else if(date[i].equalsIgnoreCase("sep") || date[i].equalsIgnoreCase("September"))
        {
            month = "09" ;
        }
        else if(date[i].equalsIgnoreCase("oct") || date[i].equalsIgnoreCase("October"))
        {
            month = "10" ;
        }
        else if(date[i].equalsIgnoreCase("nov") || date[i].equalsIgnoreCase("November"))
        {
            month = "11" ;
        }
        else if(date[i].equalsIgnoreCase("dec") || date[i].equalsIgnoreCase("December")) {
            month = "12";
        }
     
        monthDate.put(month,Integer.parseInt(date[1]));

        
       // System.out.println("Month date : "+monthDate);
        
        return monthDate ;

    }

}
