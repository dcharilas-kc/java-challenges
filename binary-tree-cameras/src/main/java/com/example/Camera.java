package com.example;

public class Camera {

    public int minCameraCover(TreeNode root) {

        int minCameras = minCamerasNeeded(root).minCameras;
        return minCameras == 0 ? 1 : minCameras;
    }

    private Result minCamerasNeeded(TreeNode node) {

        // Easiest to just handle null children here instead of checking before recursing.
        if (node == null) {
            return new Result(false, 0);
        }

        // If it's a leaf node, it's never necessary to have a camera; we can just put one
        // on its parent.
        if (node.left == null && node.right == null) {
            return new Result(false, 0);
        }

        // Traverse both children.
        Result leftResult = minCamerasNeeded(node.left);
        Result rightResult = minCamerasNeeded(node.right);

        // If neither the left nor the right child has a camera, then we'll want one on this node.
        boolean needsCamera = !leftResult.nodeHasCamera && !rightResult.nodeHasCamera;
        return new Result(needsCamera, leftResult.minCameras + rightResult.minCameras + (needsCamera ? 1 : 0));
    }

    /**
     * A record class, because our method needs to return two values (whether we put a camera on
     * the given node, and the minimum number of cameras that the tree under the given node required).
     */
    private record Result(boolean nodeHasCamera, int minCameras) {
    }
}
