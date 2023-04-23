package ru.netology.service;

//import org.junit.Test;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashBackHackerTest {

    @Test
    public void remain () {
        CashBackHacker service = new CashBackHacker();
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void remain1 () {
        CashBackHacker service = new CashBackHacker();
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void remain2 () {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void remain3 () {
        CashBackHacker service = new CashBackHacker();
        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void remain4 () {
        CashBackHacker service = new CashBackHacker();
        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }





}
