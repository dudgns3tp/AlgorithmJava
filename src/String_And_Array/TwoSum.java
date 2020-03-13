package String_And_Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String []args) {
        int[] nums = {2, 8, 11, 21};
        int target = 10;
        TwoSum a = new TwoSum();
        int[] result = a.solve(nums, target);
        for(int i: result){
            System.out.println(i);
        }

    }

    public int[] solve(int[] nums, int target){
        Map<Integer, Integer> map =new HashMap<>();
        int[] result = new int[2];

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                int mapValue = map.get(nums[i]); // i=1일때 8, map(8,0)
                result[0] =mapValue +1;
                result[1] = i+1;
            }else{
                map.put(target-nums[i], i); // key= 10-2 = 8, i = 0
            }
        }
        return result;
    }

//        int nums[]= {2,6,10,11,13,15};
//        int target = 24;
//        boolean find = false;
//
//        for(int i=0; i<nums.length; i++){
//            for(int j=0; j<nums.length; j++){
//                if(i==j){
//                    continue; // 생략
//                }
//
//                if((nums[i]+nums[j]>target)){
//                    break;
//                }
//
//                if(nums[i]+ nums[j] == target){
//                    System.out.println(i+" , "+j);
//                    find = true;
//                    break;
//                }
//            }
//            if(find){
//                break;
//            }
//        }
//
//        if(!find){
//            System.out.println("ㄴㄴ");
//        }


}
