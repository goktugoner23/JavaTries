//https://leetcode.com/problems/combination-sum-ii/*/
/*Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.
Each number in candidates may only be used once in the combination.
Note: The solution set must not contain duplicate combinations.

Example 1:
Input: candidates = [10,1,2,7,6,1,5], target = 8
Output:
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]
Example 2:
Input: candidates = [2,5,2,1,2], target = 5
Output:
[
[1,2,2],
[5]
]

Constraints:
1 <= candidates.length <= 100
1 <= candidates[i] <= 50
1 <= target <= 30*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class CombinationSumII {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int targetTemp = target;
        Arrays.sort(candidates);
        for(int i = 0; i < candidates.length; i++){
            if(i > 0 && candidates[i] == candidates[i-1]){
                continue;
            }
            List<Integer> elements = new ArrayList<>();
            if(candidates[i] <= targetTemp - candidates[i]){
                elements.add(candidates[i]);
                targetTemp -= candidates[i];
            }
            for(int j = i; j < candidates.length; j ++){
                if(candidates[j] == targetTemp){
                    elements.add(candidates[j]);
                    targetTemp -= candidates[j];
                    list.add(elements);
                    targetTemp = target;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        System.out.println(combinationSum2(candidates, 8));
    }
}
