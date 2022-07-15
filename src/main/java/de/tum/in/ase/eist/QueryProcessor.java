package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

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
        } else if (query.contains("plus")){ // TODO extend the programm here
            String[] queryParts = query.split(":");
            String[] all = queryParts[1].split("%20");
            int result = Integer.parseInt(all[2]) + Integer.parseInt(all[4]);
            return result;
        } else if (query.contains("largest")){
            String[] queryParts = query.split(":");
            String[] all = queryParts[1].split("%20");
            int[] nums = new int[all.length];
            for (int i = 0; i < all.length; i++) {
                nums[i] = Integer.parseInt(all[i]);
            }
            Arrays.sort(nums);
            return nums[nums.length - 1];
        } else {
            return ""
        }
    }
}
