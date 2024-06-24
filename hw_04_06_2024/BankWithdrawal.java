package org.example.hw_04_06_2024;

public class BankWithdrawal {
    public static void main(String[] args) {
        int N = 21;
        int days = calculateDaysToWithdraw(N);
        System.out.println("Дней, чтобы забрать все деньги: " + days);
    }

    public static int calculateDaysToWithdraw(int N) {
        int days = 0;
        while (N > 0) {
            int maxDivisor = findMaxDivisor(N);
            N -= maxDivisor;
            days++;
        }
        return days;
    }

    public static int findMaxDivisor(int N) {
        if (N == 1) return 1;
        for (int i = N / 2; i >= 1; i--) {
            if (N % i == 0) return i;
        }
        return 1; // Возвращаем 1, если других делителей нет (случай для N = 1 уже обработан)
    }
}
