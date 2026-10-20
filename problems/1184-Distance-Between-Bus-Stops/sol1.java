// ==========================================================
// 1184. Distance Between Bus Stops
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 43.9 MB (Beats 86%)
// Link       : https://leetcode.com/problems/distance-between-bus-stops/
// ==========================================================

class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }

        int clockwise = 0;
        int total = 0;

        for (int d : distance) {
            total += d;
        }

        for (int i = start; i < destination; i++) {
            clockwise += distance[i];
        }

        int counterclockwise = total - clockwise;

        return Math.min(clockwise, counterclockwise);
    }
}