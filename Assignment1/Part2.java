package Assignment1;

import java.util.List;
import java.util.ArrayList;

public class Part2 {

    public static ArrayList<ArrayList<Integer>> pairsThatEqualSum(List<Integer> inputArray, Integer targetSum ) {

        ArrayList<ArrayList<Integer>> pairsThatEqlSum = new ArrayList<ArrayList<Integer>>();  

        for (int one =0 ; one<inputArray.size(); one++) {
            int uno = inputArray.get(one);
            for(int two=one+1; two<inputArray.size(); two++) {
                int dos = inputArray.get(two);
                System.out.println(uno + " " + dos);
                    if(uno + dos == targetSum)
                    {   
                        ArrayList<Integer> pair = new ArrayList<Integer>();
                        pair.add(uno);
                        pair.add(dos);
                        pairsThatEqlSum.add(pair);
                    }
                }
            }

        return pairsThatEqlSum;
    }
    public static void main(String[] args) {
        List<Integer> inputArray = new ArrayList<Integer>();
        inputArray.add(1);
        inputArray.add(2);
        inputArray.add(3);
        inputArray.add(4);
        inputArray.add(5);
        Integer targetSum = 5;
        ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
        results = pairsThatEqualSum(inputArray, targetSum);
        System.out.println(results);
    }

}