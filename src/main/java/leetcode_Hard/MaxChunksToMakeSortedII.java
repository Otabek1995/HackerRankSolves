package leetcode_Hard;

/*768 This question is the same as "Max Chunks to Make Sorted" except the
integers of the given array are not necessarily distinct, the input array could
be up to length 2000, and the elements could be up to 10**8. Given an array arr
of integers (not necessarily distinct), we split the array into some number of
"chunks" (partitions), and individually sort each chunk.  After concatenating
them, the result equals the sorted array. What is the most number of chunks we
could have made?
Input: arr = [5,4,3,2,1]		Output: 1
Splitting into two or more chunks will not return the required result. For
example, splitting into [5, 4], [3, 2, 1] will result in [4, 5, 1, 2, 3],
which isn't sorted.
Input: arr = [2,1,3,4,4]		Output: 4
We can split into two chunks, such as [2, 1], [3, 4, 4]. However, splitting
into [2, 1], [3], [4], [4] is the highest number of chunks possible			 */

public class MaxChunksToMakeSortedII {
	public int maxChunksToSorted(int[] arr) {

		int n = arr.length;
		int[] maxOfLeft = new int[n];
		int[] minOfRight = new int[n];

		maxOfLeft[0] = arr[0];

		for (int i = 1; i < n; i++) {
			maxOfLeft[i] = Math.max(maxOfLeft[i - 1], arr[i]);
		}

		minOfRight[n - 1] = arr[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			minOfRight[i] = Math.min(minOfRight[i + 1], arr[i]);
		}

		int res = 0;

		for (int i = 0; i < n - 1; i++) {

			if (maxOfLeft[i] <= minOfRight[i + 1])
				res++;
		}
		return res + 1;
	}
}
