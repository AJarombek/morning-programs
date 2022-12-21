/**
 * https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
 * @author Andrew Jarombek
 * @since 12/20/2022
 */

const findSecondMinimumValue = function(root) {
    if (!root.left && !root.right)
        return -1;

    let values = [root.val, null];

    if (root.left)
        dfs(root.left, values);

    if (root.right)
        dfs(root.right, values);

    return values[1] ?? -1;
};

const dfs = function(root, values) {
    const val = root.val;

    if (val < values[0]) {
        values[1] = values[0];
        values[0] = val;
    } else if (val > values[0] && (values[1] === null || val < values[1])) {
        values[1] = val;
    }

    if (root.left)
        dfs(root.left, values);

    if (root.right)
        dfs(root.right, values);
}
