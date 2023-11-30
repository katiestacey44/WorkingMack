package com.example.myapplication;

import junit.framework.TestCase;

public class GraphTest extends TestCase {

    private Graph g = new Graph(10, 20);

    public void testGetDesiredRoom() {
        assertEquals(20, g.getDesiredRoom());
    }

    public void testSetDesiredRoom() {
        g.setDesiredRoom(12);
        assertEquals(12, g.getDesiredRoom());
    }

    public void testGetVisited() {
        boolean result = false;
        int[] array= g.getVisited();


    }

    public void testAddVisited() {
    }

    public void testAddEdge() {
    }

    public void testDFS() {
    }

    public void testFoundRoom() {
    }
}