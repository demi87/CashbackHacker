package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemain200() {
        int amount = 800;
        int expected = 200;
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }

    @Test
    public void shouldRemain900() {
        int amount = 100;
        int expected = 900;
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }

    @Test
    public void shouldRemain1000() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }
}