package com.company;
import java.util.Calendar;

public class Solution {

    private int currentYear;

    public Solution() {
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    public int getCurrentYear() {
        return currentYear;
    }
}
