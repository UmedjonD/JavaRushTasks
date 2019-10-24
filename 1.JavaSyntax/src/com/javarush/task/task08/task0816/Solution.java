package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Jake", df.parse("January 1 1985"));
        map.put("Chan", df.parse("February 1 1986"));
        map.put("Arnold", df.parse("March 1 1988"));
        map.put("Stallon", df.parse("April 1 1989"));
        map.put("Stall", df.parse("July 1 1990"));
        map.put("Stal", df.parse("August 1 1996"));
        map.put("Sta", df.parse("September 1 1994"));
        map.put("Umed", df.parse("October 1 1998"));
        map.put("Umedjon", df.parse("November 1 1994"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();

        int k = 0;
        while (iterator.hasNext()){

            Map.Entry<String, Date> pair = iterator.next();

            if((pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8)) {
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) {

    }
}
