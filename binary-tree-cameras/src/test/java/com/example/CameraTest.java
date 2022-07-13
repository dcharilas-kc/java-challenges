package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CameraTest {

    Camera camera = new Camera();
    BinaryTree tree = new BinaryTree();

    @Test
    public void test1() {
        TreeNode treeNode = tree.formTree(new Integer[]{0,0,null,0,0});
        assertEquals(1,camera.minCameraCover(treeNode));
    }

    @Test
    public void test2() {
        TreeNode treeNode = tree.formTree(new Integer[]{0,0,null,0,null,0,null,null,0});
        assertEquals(2,camera.minCameraCover(treeNode));
    }


}
