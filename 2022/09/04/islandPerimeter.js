const islandPerimeter = function(grid) {
    let result = 0;

    for (let i = 0; i < grid.length; i++) {
        for (let j = 0; j < grid[0].length; j++) {
            if (grid[i][j]) {
                if (i === 0 || grid[i - 1][j] === 0) {
                    result++;
                }

                if (j === 0 || grid[i][j - 1] === 0) {
                    result++;
                }

                if (i === grid.length - 1 || grid[i + 1][j] === 0) {
                    result++;
                }

                if (j === grid[0].length - 1 || grid[i][j + 1] === 0) {
                    result++;
                }
            }
        }
    }

    return result;
};

let result = islandPerimeter([[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]);
console.assert(result === 16);

result = islandPerimeter([[1]]);
console.assert(result === 4);

result = islandPerimeter([[1, 0]]);
console.assert(result === 4);
