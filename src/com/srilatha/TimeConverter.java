package com.srilatha;

import java.util.StringTokenizer;

/**
 * Created by Srilatha on 7/6/2017.
 */
public class TimeConverter {

 //  public static void main(String s[]) {
   //           timeConvertor("23:12");

   //}
    public static String timeConvertor(String time){
       // String s="0";
       // int s2=Integer.valueOf(s);

        StringTokenizer s1 = new StringTokenizer(time, ":");

        int hour = new Integer(s1.nextToken()).intValue();
        int minute = new Integer(s1.nextToken()).intValue();
       String amOrPM = "PM";
        String outputhour = "";

        if(hour > 12 && hour != 12 && hour != 0){

            outputhour = (hour - 12) + "" ;


            amOrPM="PM";
        }
        else{
            outputhour = hour + "";
            amOrPM="AM";
        }
            if
        (hour<12 && hour==0 ){
            outputhour=12+"Pm"+"";
            amOrPM="PM";
    }else if(hour==12){
            outputhour=hour+"AM"+"";
            amOrPM="AM";
            }


        System.out.print(outputhour+":");
        // Tenary operators f =  (condition)? (condition) ? k : t : d
        String outputMin = (minute < 10) ? "0"+minute : new Integer(minute).toString();
        System.out.print(""+outputMin);
        System.out.print(" " + amOrPM);

        StringBuilder sb = new StringBuilder(outputhour+ ":");
        return sb.append(outputMin).append(" ").append(amOrPM).toString();

    }
}
