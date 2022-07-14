package com.example;

public class Camera {

    public int minCameraCover(TreeNode root) {

        Result rootResult = minCamerasNeeded(root);
        // If the root node ends up not covered by a camera on one of its children, we need
        // to put a camera on it.
        return rootResult.minCameras + (rootResult.isCovered ? 0 : 1);
    }

    private Result minCamerasNeeded(TreeNode node) {

        // Easiest to just handle null children here instead of checking before recursing.
        if (node == null) {
            return new Result(false, true,0);
        }

        // If it's a leaf node, it's never necessary to have a camera; we can just put one
        // on its parent.
        if (node.left == null && node.right == null) {
            return new Result(false, false, 0);
        }

        // Traverse both children.
        Result leftResult = minCamerasNeeded(node.left);
        Result rightResult = minCamerasNeeded(node.right);

        // If either the left or the right child is not yet covered, we'll need a camera on this node.
        boolean needsCamera = !leftResult.isCovered || !rightResult.isCovered;
        boolean isCovered = needsCamera || leftResult.hasCamera || rightResult.hasCamera;
        return new Result(needsCamera, isCovered, leftResult.minCameras + rightResult.minCameras + (needsCamera ? 1 : 0));
    }

    /**
     * A record class, because our method needs to return three values (whether the node has a camera,
     * whether it's covered by a camera on one of its children, and the minimum number of cameras that
     * the tree under the given node required).
     */
    private record Result(boolean hasCamera, boolean isCovered, int minCameras) {
    }
}
