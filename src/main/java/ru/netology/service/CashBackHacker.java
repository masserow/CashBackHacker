package ru.netology.service;
public class CashBackHacker {
    public int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}
