// ==========================================================
// 1185. Day of the Week
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 8 ms (Beats 9%)
// Memory     : 42.9 MB (Beats 15%)
// Link       : https://leetcode.com/problems/day-of-the-week/
// ==========================================================

import java.time.LocalDate;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        return LocalDate.of(year, month, day)
                        .getDayOfWeek()
                        .getDisplayName(
                            java.time.format.TextStyle.FULL,
                            java.util.Locale.ENGLISH
                        );
    }
}