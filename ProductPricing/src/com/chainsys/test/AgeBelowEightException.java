package com.chainsys.test;

public class AgeBelowEightException extends Exception {
    public AgeBelowEightException() {
        super("Age must be 8 or above.");
    }
}
