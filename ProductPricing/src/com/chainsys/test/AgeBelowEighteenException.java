package com.chainsys.test;

public class AgeBelowEighteenException extends Exception {
    public AgeBelowEighteenException() {
        super("Age must be 8 or above.");
    }
}
