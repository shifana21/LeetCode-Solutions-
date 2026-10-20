// ==========================================================
// 1175. Prime Arrangements
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 41.5 MB (Beats 99%)
// Link       : https://leetcode.com/problems/prime-arrangements/
// ==========================================================

class Solution {
    public int numPrimeArrangements(int n) {
        long MOD = 1_000_000_007L;
        int primeCount = 0;

        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primeCount++;
            }
        }

        int nonPrimeCount = n - primeCount;
        long result = 1;

        for (int i = 2; i <= primeCount; i++) {
            result = (result * i) % MOD;
        }

        for (int i = 2; i <= nonPrimeCount; i++) {
            result = (result * i) % MOD;
        }

        return (int) result;
    }
}