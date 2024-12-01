package com.example.interfaces;

/**
 * This interface provides the methods for implementing size scaling
 * based on mouse movement.
 */
public interface Scalable {

    public void growRightLeft(int x, int y);

    public void growLeftRight(int x, int y);

    public void growBottomUp(int x, int y);

    public void growTopDown(int x, int y);

}
