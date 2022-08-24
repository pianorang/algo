package programmers;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
* 폰켄몬
* */
public class Ponkenmon {
    public static void main(String[] args) throws Exception {
        int solution = solution(new int[]{3, 1, 2, 3});
        System.out.println(solution);

    }
    public static int solution(int[] nums) throws Exception {
        int limit = nums.length / 2;

        int[] ints = Arrays.stream(nums).distinct().toArray();

        if (ints.length >= limit){
            return limit;
        }
        else{
            return ints.length;
        }
    }

    public int likeSolution(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
    }
}
