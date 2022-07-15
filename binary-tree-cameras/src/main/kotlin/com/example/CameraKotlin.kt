package com.example

class CameraKotlin {

    fun minCameraCover(root: TreeNode?): Int {
        val rootResult = minCamerasNeeded(root)
        // If the root node ends up not covered by a camera on one of its children, we need
        // to put a camera on it.
        return rootResult.minCameras + if (rootResult.isCovered) 0 else 1
    }

    private fun minCamerasNeeded(node: TreeNode?): Result {

        // Easiest to just handle null children here instead of checking before recursing.
        if (node == null) {
            return Result(false, true, 0)
        }

        // If it's a leaf node, it's never necessary to have a camera; we can just put one
        // on its parent.
        if (node.left == null && node.right == null) {
            return Result(false, false, 0)
        }

        // Traverse both children.
        val leftResult = minCamerasNeeded(node.left)
        val rightResult = minCamerasNeeded(node.right)

        // If either the left or the right child is not yet covered, we'll need a camera on this node.
        val needsCamera = !leftResult.isCovered || !rightResult.isCovered
        val isCovered = needsCamera || leftResult.hasCamera || rightResult.hasCamera
        return Result(needsCamera, isCovered,
            leftResult.minCameras + rightResult.minCameras + if (needsCamera) 1 else 0)
    }

    /**
     * A data class, because our method needs to return three values (whether the node has a camera,
     * whether it's covered by a camera on one of its children, and the minimum number of cameras that
     * the tree under the given node required).
     */
    private data class Result(val hasCamera: Boolean, val isCovered: Boolean, val minCameras: Int)

}