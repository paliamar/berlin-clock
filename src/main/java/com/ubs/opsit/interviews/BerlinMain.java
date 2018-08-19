/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ubs.opsit.interviews;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amarpali
 */
public class BerlinMain {

    private static List<TimeConverter> timeUnits = new ArrayList<TimeConverter>();

    public static void main(String args[]) {

        timeUnits.add(new Seconds());
        timeUnits.add(new Minutes());
        timeUnits.add(new Hours());

        System.out.println("Finale ouput : " + getTime("13:17:01"));

    }

    public static String getTime(String time) {
        StringBuilder timeS = new StringBuilder();
        String[] timeElemnts = time.split(":");

        int i = 0;
        int j = 2;

        for (TimeConverter timeUnit : timeUnits) {
            for (String timeElemnt : timeElemnts) {
                timeS.append(timeUnits.get(i).convertTime(timeElemnts[j])).append("\n");
                i++;
                j--;
                break;
            }
        }
        return timeS.toString();
    }
}
