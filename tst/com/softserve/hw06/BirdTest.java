package com.softserve.hw06;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {

    @Test
    public void checkEagle() {
        Eagle sud = new Eagle();
        Assert.assertTrue(sud.isFeathers());
        Assert.assertTrue(sud.isLayEggs());
        Assert.assertTrue(sud.isFlyind());
        System.out.println(sud);
    }

    @Test
    public void checkSwallow() {
        Swallow sud = new Swallow();
        Assert.assertTrue(sud.isFeathers());
        Assert.assertTrue(sud.isLayEggs());
        Assert.assertTrue(sud.isFlyind());
        System.out.println(sud);
    }

    @Test
    public void checkChicken() {
        Chicken sud = new Chicken();
        Assert.assertTrue(sud.isFeathers());
        Assert.assertTrue(sud.isLayEggs());
        Assert.assertFalse(sud.isFlyind());
        System.out.println(sud);
    }

    @Test
    public void checkPenguin() {
        Penguin sud = new Penguin();
        Assert.assertFalse(sud.isFeathers());
        Assert.assertTrue(sud.isLayEggs());
        Assert.assertFalse(sud.isFlyind());
        System.out.println(sud);
    }
}
