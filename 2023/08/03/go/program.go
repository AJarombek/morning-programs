/**
 * https://leetcode.com/problems/image-smoother/
 * Author: Andrew Jarombek
 * Date: 8/3/2023
 */

package _go

func imageSmoother(img [][]int) [][]int {
	result := make([][]int, len(img))

	for i, row := range img {
		resultRow := make([]int, len(row))

		for j, cell := range row {
			sum := cell
			count := 1

			if i > 0 {
				sum += img[i-1][j]
				count++

				if j > 0 {
					sum += img[i-1][j-1]
					count++
				}

				if j < len(row)-1 {
					sum += img[i-1][j+1]
					count++
				}
			}

			if i < len(img)-1 {
				sum += img[i+1][j]
				count++

				if j > 0 {
					sum += img[i+1][j-1]
					count++
				}

				if j < len(row)-1 {
					sum += img[i+1][j+1]
					count++
				}
			}

			if j > 0 {
				sum += img[i][j-1]
				count++
			}

			if j < len(row)-1 {
				sum += img[i][j+1]
				count++
			}

			resultRow[j] = sum / count
		}

		result[i] = resultRow
	}

	return result
}
