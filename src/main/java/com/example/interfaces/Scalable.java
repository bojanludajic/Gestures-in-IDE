package com.example.interfaces;

/**
 * This interface provides the methods for implementing size scaling
 * based on mouse movement/location. The interface provides a general
 * framework, leaving implementing classes to determine their own
 * behaviour.
 */
public interface Scalable {

    /**
     * Scales the {@code Scalable} component based on its
     *  location on the x-axis, growing as the panel moves to the right.
     *  @param x the current x-coordinate of the component
     *  @param y the current y-coordinate of the component
     */
    public void growRightLeft(int x, int y);

    /**
     *  Scales the {@code Scalable} component based on its
     *  location on the x-axis, growing as the panel moves to the left.
     *  @param x the current x-coordinate of the component
     *  @param y the current y-coordinate of the component
     */
    public void growLeftRight(int x, int y);

    /**
     *  Scales the {@code Scalable} component based on its
     *  location on the y-axis, growing as the panel moves upwards.
     *  @param x the current x-coordinate of the component
     *  @param y the current y-coordinate of the component
     */
    public void growBottomUp(int x, int y);

    /**
     *  Scales the {@code Scalable} component based on its
     *  location on the y-axis, growing as the panel moves downwards.
     *  @param x the current x-coordinate of the component
     *  @param y the current y-coordinate of the component
     */
    public void growTopDown(int x, int y);

}
