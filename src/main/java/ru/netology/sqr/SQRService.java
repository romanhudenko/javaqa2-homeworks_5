package ru.netology.sqr;

public class SQRService {
    public int countSquaresInRange(int rangeStart, int rangeEnd) {
        int hardStart = 10;
        int hardEnd = 99;
        int counter = 0;
        for (int i = hardStart; i <= hardEnd; i += 1) {
            int square = i * i;
            if (square >= rangeStart && square <= rangeEnd) {
                counter += 1;
            }
        }
        return counter;
    }
}
