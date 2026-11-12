package com.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequent {

	public static void main(String[] args) {

		int[] nums= {1,1,1,2,2,3};
		int k=2;
		Map<Integer,Integer> map = new HashMap<>();
		for(int num : nums) {
			map.put(num, map.getOrDefault(num,0)+1);
		}
		PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a)
				);
		
		pq.addAll(map.keySet());
		
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            result.add(pq.poll());
        }

        // Step 5: Print result
        System.out.println(result);

	}

}
