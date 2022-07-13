package com.example;

public class Camera {

    public int minCameraCover(TreeNode root) {

        return minCamerasNeeded(root).minCameras;
    }

    private Result minCamerasNeeded(TreeNode node) {

        if (node == null) {
            return new Result(false, 0);
        }

        if (node.left == null && node.right == null) {
            return new Result(false, 0);
        }

        Result leftResult = minCamerasNeeded(node.left);
        Result rightResult = minCamerasNeeded(node.right);

        boolean needsCamera = !leftResult.nodeHasCamera && !rightResult.nodeHasCamera;
        return new Result(needsCamera, leftResult.minCameras + rightResult.minCameras + (needsCamera ? 1 : 0));
    }

    private record Result(boolean nodeHasCamera, int minCameras) {
    }
}
