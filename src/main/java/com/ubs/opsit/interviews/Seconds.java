package com.ubs.opsit.interviews;

/**
 *
 * @author amarpali
 */
public class Seconds implements TimeConverter {

    @Override
    public String convertTime(String sec) {
        if (0 == Integer.parseInt(sec) % 2) {
            return "Y";
        }
        return "O";
    }

}
