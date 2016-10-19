package com.other;

public class DateFilterer {
    public static String[]  dateFilterer(String date )
    {
        String[] dateDetail = date.split(" ");

        String[] monthDay = new String[2];

        int j = 0;

        for(int i=0; i< dateDetail.length;i++)
        {
            if(i >0 && i < 3)
            {
                monthDay[j] = dateDetail[i];
                j++;
            }
        }

        return  monthDay ;
    }
}