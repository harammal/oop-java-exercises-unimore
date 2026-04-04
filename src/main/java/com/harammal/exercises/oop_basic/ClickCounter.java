package com.harammal.exercises.oop_basic;

/**
 * A click counter that tracks a non-negative integer value.
 */
public class ClickCounter {
    private int value = 0;

    /**
     * Returns the current value of the counter.
     *
     * @return the current value of the counter
     */
    public int getValue() {
        return value;
    }

    /**
     * Increments the counter by one.
     */
    public void click() {
        value++;
    }

    /**
     * Decrements the counter by one. Prevents the counter to go below 0.
     */
    public void undo() {
        value = Math.max(value - 1, 0);
    }

    /**
     * Resets the counter to 0.
     */
    public void reset() {
        value = 0;
    }
}
