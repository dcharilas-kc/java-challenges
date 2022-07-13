package com.example;

public class Camera {

    public int minCameraCover(TreeNode root) {

        return minCamerasNeeded(root, false, false);
    }

    private int minCamerasNeeded(TreeNode node, boolean mustHaveCamera, boolean parentHasCamera) {

        // It's easiest to just allow traversal to the null children, and return that they require 0 cameras.
        if (node == null) {
            return 0;
        }

        // Try putting a camera at this node, even if it's not required.
        int minCameras = 1 + minCamerasNeeded(node.left, false, true) +
                             minCamerasNeeded(node.right, false, true);

        // If the camera isn't required for this node, we have other cases to try.
        if (!mustHaveCamera) {

            if (parentHasCamera) {
                // The parent of this node has a camera, so we don't require either of the children to
                // have one.
                minCameras = Math.min(minCameras,
                        minCamerasNeeded(node.left, false, false) +
                        minCamerasNeeded(node.right, false, false));
            } else {
                // The parent of this node doesn't have a camera, so either the left child or the right
                // child must have a camera, to ensure the current node is covered.
                if (node.left != null) {
                    minCameras = Math.min(minCameras,
                            minCamerasNeeded(node.left, true, false) +
                            minCamerasNeeded(node.right, false, false));
                }
                if (node.right != null) {
                    minCameras = Math.min(minCameras,
                            minCamerasNeeded(node.left, false, false) +
                            minCamerasNeeded(node.right, true, false));
                }
            }
        }

        return minCameras;
    }
}
