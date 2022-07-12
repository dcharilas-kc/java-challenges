package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CameraTest {

    Camera camera = new Camera();

    @Test
    public void test1() {
        assertEquals(1,camera.minCameraCover(new Integer[]{0,0,null,0,0}));
    }

    @Test
    public void test2() {
        assertEquals(2,camera.minCameraCover(new Integer[]{0,0,null,0,null,0,null,null,0}));
    }


}
