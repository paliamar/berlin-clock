package com.ubs.opsit.interviews;

/**
 *
 * @author amarpali
 */
public class Hours implements TimeConverter{
    
    private static final String ALL_LIGHTS_OFF = "OOOO";
    private static final String RED_LIGHT = "R";
    private static final int MULTIPLE_OF_FIVE = 5;

    /**
     * 
     * @param hrs
     * @return 
     */
    @Override
    public String convertTime(String hrs) {
        int hours = Integer.parseInt(hrs);
        return getLampForHoursMultipleOfFive(hours) + "\n" + getLampForSingleHours(hours);
    }
    
    /**
     * 
     * @param hr
     * @return 
     */
    public String getLampForHoursMultipleOfFive(int hr) {
        StringBuffer lamps = new StringBuffer(ALL_LIGHTS_OFF);
        for (int i = 0; i < (hr / MULTIPLE_OF_FIVE); i++) {
            lamps.replace(i, i + 1, RED_LIGHT);
        }
        return lamps.toString();
    }

    /**
     * 
     * @param hr
     * @return 
     */
    public String getLampForSingleHours(int hr) {
        StringBuffer lmp = new StringBuffer(ALL_LIGHTS_OFF);
        for (int i = 0; i < (hr % MULTIPLE_OF_FIVE); i++) {
            lmp.replace(i, i + 1, RED_LIGHT);
        }
        return lmp.toString();
    }

}
