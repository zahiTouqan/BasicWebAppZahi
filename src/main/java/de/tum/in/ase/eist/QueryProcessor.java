package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "zahi";
        } else if (query.contains("plus")){ // TODO extend the program here
//            String[] queryParts = query.split(":");
//            String[] all = queryParts[1].split("%20");
//            int result = Integer.parseInt(all[3]) + Integer.parseInt(all[5]);
//            return String.valueOf(result);
            return query;
        } else if (query.contains("largest")){
            return query;
//            String[] queryParts = query.split(":");
//            String[] all = queryParts[2].split("%20");
//            List<String> arr = Arrays.asList(all);
//            List<Integer> toRemove = new ArrayList<>();
//            for (int i = 0; i < arr.size(); i++) {
//                if (Objects.equals(arr.get(i), "")) {
//                    toRemove.add(i);
//                } else if (arr.get(i).contains(",")) {
//                    arr.set(i, arr.get(i).replaceAll("[^a-zA-Z0-9]",""));
//                }
//            }
//
//            int[] nums = new int[arr.size() - 1];
//            for (int i = 1; i < arr.size(); i++) {
//                nums[i - 1] = Integer.parseInt(all[i]);
//            }
//            Arrays.sort(nums);
//            return String.valueOf(nums[nums.length - 1]);
        } else {
            return "";
        }

    }
}
