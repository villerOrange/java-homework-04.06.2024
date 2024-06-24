package org.example.hw_04_06_2024;

public class DeviceCheck {
    public static void main(String[] args) {
        int temperature1 = 105; // Пример температуры первой колбы
        int temperature2 = 95;  // Пример температуры второй колбы

        boolean isDeviceWorking = checkDevice(temperature1, temperature2);
        System.out.println("Устройство работает корректно: " + isDeviceWorking);
    }

    public static boolean checkDevice(int temp1, int temp2) {
        return temp1 > 100 && temp2 < 100;
    }
}
