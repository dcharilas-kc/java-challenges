package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CameraTest {

    Camera camera = new Camera();

    @Test
    public void test1() {
        TreeNode treeNode = BinaryTree.formTree(new Integer[]{0,0,null,0,0});
        assertEquals(1,camera.minCameraCover(treeNode));
    }

    @Test
    public void test2() {
        TreeNode treeNode = BinaryTree.formTree(new Integer[]{0,0,null,0,null,0,null,null,0});
        assertEquals(2,camera.minCameraCover(treeNode));
    }

    @Test
    public void test3() {
        TreeNode treeNode = BinaryTree.formTree(new Integer[]{0,0,0,null,null,null,0});
        assertEquals(2, camera.minCameraCover(treeNode));
    }

    @Test
    public void testFullTree() {
        TreeNode treeNode = BinaryTree.formTree(new Integer[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0});
        assertEquals(5,camera.minCameraCover(treeNode));
    }

    @Test
    public void testHugeTree() {
        TreeNode treeNode = BinaryTree.formTree(new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, null, 0, 0, null, 0, null, 0, 0, 0, 0, 0, null, null, null, null, 0, 0, 0, 0, null, null, 0, 0, 0, 0, 0, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, 0, 0, 0, 0, 0, null, 0, 0, null, null, 0, 0, 0, 0, 0, null, 0, null, 0, 0, 0, 0, 0, 0, null, null, 0, 0, 0, 0, 0, null, null, 0, 0, null, 0, null, 0, null, 0, 0, 0, null, 0, 0, null, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, null, 0, 0, 0, 0, 0, null, 0, 0, 0, null, null, 0, 0, 0, 0, 0, 0, null, 0, 0, null, null, 0, null, 0, 0, null, 0, 0, null, 0, 0, 0, 0, 0, null, 0, null, 0, null, null, null, 0, 0, 0, 0, 0, 0, null, null, null, 0, 0, 0, 0, 0, null, null, null, 0, null, null, 0, null, null, null, null, 0, null, 0, null, 0, 0, 0, null, null, 0, null, null, null, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 0, 0, 0, null, 0, 0, null, 0, null, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, 0, null, null, null, null, 0, 0, null, null, 0, null, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, null, 0, null, null, null, null, null, null, null, 0, 0, 0, 0, null, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, 0, null, null, null, null, null, null, 0, 0, null, null, 0, null, null, null, null, null, 0, null, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, null, null, null, 0, 0, null, 0, 0, null, 0, null, null, 0, 0, null, null, null, 0, 0, null, null, null, null, 0, 0, 0, 0, 0, null, 0, 0, null, 0, 0, 0, null, 0, 0, 0, 0, null, 0, null, 0, 0, 0, 0, 0, null, null, null, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, 0, null, 0, null, null, null, 0, 0, 0, null, 0, null, null, null, 0, null, 0, 0, null, null, null, 0, null, null, 0, null, null, 0, 0, 0, null, 0, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, null, 0, null, null, 0, null, null, 0, 0, null, null, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, null, null, 0, null, null, 0, null, 0, null, 0, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, null, 0, 0, null, 0, 0, 0, 0, null, null, null, null, null, 0, null, null, 0, null, 0, null, null, null, 0, null, null, null, null, 0, 0, 0, 0, null, null, 0, null, null, null, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, null, 0, null, null, 0, 0, null, null, null, null, 0, null, null, null, null, null, null, null, null, 0, null, null, null, null, 0, null, 0, null, 0, null, 0, 0, null, 0, null, null, 0, null, 0, null, 0, null, null, 0, 0, null, 0, null, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, null, null, null, null, null, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, null, 0, null, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, null, null, null, null, null, null, null, null, 0, null, 0, null, 0, null, null, null, 0, null, null, null, 0, 0, null, null, null, 0, 0, 0, 0, 0, 0, null, null, null, null, null, 0, 0, null, 0, 0, null, null, null, null, null, null, 0, null, 0, null, null, null, 0, 0, 0, null, 0, 0, null, 0, 0, null, null, null, null, null, null, 0, 0, 0, 0, 0, null, null, 0, null, null, 0, 0, 0, 0, 0, 0, 0, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, 0, null, null, null, null, null, null, null, 0, null, null, 0, null, 0, 0, null, null, 0, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, 0, 0, null, 0, 0, 0, null, null, null, null, 0, 0, null, null, null, null, 0, 0, 0, 0, null, null, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, null, null, 0, null, null, null, null, null, 0, null, null, null, null, null, null, 0, 0, null, 0, null, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, 0, 0, null, null, null, null, 0, 0, null, null, 0, null, 0, null, 0, null, null, 0, null, null, null, null, 0, null, 0, null, null, null, null, 0, 0, null, 0, 0, 0, null, 0, 0, 0, null, 0, null, null, null, null, 0, null, null, null, null, null, null, null, null, 0, 0, 0, 0, null, 0, null, 0, null, 0, null, 0, 0, 0, 0, 0, null, 0, 0, 0, null, null, null, null, 0, 0, 0, 0, null, 0, 0, null, null, 0, null, null, 0, null, 0, 0, null, 0, 0, 0, null, 0, 0, null, null, null, 0, 0, null, null, null, null, null, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 0, null, 0, null, null, null, 0, 0, null, null, null, 0, 0, null, 0, null, null, 0, null, null, 0, 0, null, null, null, 0, 0, null, null, 0, null, 0, null, 0, 0, null, null, null, 0, 0, null, null, null, null, 0, 0, null, 0, null, null, null, null, 0, 0, 0, 0, 0, 0, null, null, null, 0, 0, null, 0, null, null, null, null, 0, null, 0, null, null, 0, 0, null, null, 0, 0, 0, 0, null, 0, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, 0, null, null, 0, 0, null, 0, 0, 0, null, 0, null, null, null, 0, null, 0, null, null, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 0, 0, null, null, null, null, null, 0, 0, null, null, null, null, 0, 0, 0, 0, 0, null, 0, 0, 0, null, null, null, null, null, 0, null, null, 0, 0, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, null, 0, 0, null, null, 0, null, null, 0, 0, 0, null, 0, null, 0, null, 0, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, 0, 0, null, null, null, null, null, 0, null, 0, 0, 0, 0, null, 0, 0, 0, null, null, 0, null, null, 0, null, null, 0, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, 0, 0, null, 0, null, 0, null, null, null, null, null, 0, null, null, null, null, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, null, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, null, null, 0, null, null, null, null, null, null, null, null, 0, null, null, null, 0, null, 0, null, 0, 0, null, null, 0, 0, null, 0, 0, 0, null, 0, 0, 0, null, 0, null, null, null, null, 0, null, 0, null, 0, null, null, null, null, null, null, 0, 0, 0, null, null, 0, null, null, null, 0, 0, null, null, null, null, 0, null, 0, null, null, null, 0, null, 0, 0, 0, 0, 0, 0, null, 0, 0, null, null, null, 0, null, 0, null, null, 0, null, null, null, null, null, null, null, null, null, null, 0, null, 0, 0, null, null, null, null, 0, null, 0, null, null, null, null, 0, 0, null, null, 0, null, null, 0, 0, 0, 0, null, 0, null, null, 0, null, null, null, 0, null, 0, 0, 0, null, 0, 0, 0, 0, 0, null, null, null, null, null, 0, null, 0, null, 0, null, null, 0, null, null, null, null, null, null, null, null, null, 0, null, 0, 0, 0, null, null, null, null, 0, null, null, null, 0, null, null, null, null, 0, null, null, null, null, null, null, null, null, 0, null, 0, null, null, null, 0, null, null, null, null, null, 0, null, 0, 0, 0, 0, null, null, null, 0, 0, 0, null, 0, 0, 0, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, 0, null, null, null, 0, 0, null, null, null, 0, 0, null, 0, 0, 0, 0, null, null, null, 0, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, 0, 0, null, 0, 0, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, 0, 0, 0, null, 0, null, null, null, null, 0, 0, 0, null, null, null, 0, null, null, 0, 0, null, null, 0, 0, null, null, null, null, null, null, null, 0, null, 0, null, null, null, null, 0, 0, null, null, 0, 0, 0, 0, 0, null, null, 0, null, null, 0, 0, 0, 0, 0, 0, null, null, null, 0, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, 0, null, 0, null, null, 0, null, 0, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, null, 0, null, null, 0, null, null, 0, 0, null, null, null, 0, null, null, 0, 0, null, null, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 0, null, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, 0, null, 0, null, 0, null, null, null, null, 0, 0, null, null, null, null, null, 0, 0, 0, null, 0, null, null, null, 0, null, null, 0, 0, null, null, null, null, 0, null, null, null, null, null, 0, 0, null, null, null, null, null, null, 0, 0, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, 0, 0, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0});
        assertEquals(360,camera.minCameraCover(treeNode));
    }

    @Test
    public void testJustARootNode() {
        TreeNode treeNode = BinaryTree.formTree(new Integer[]{0});
        assertEquals(1, camera.minCameraCover(treeNode));
    }
}
