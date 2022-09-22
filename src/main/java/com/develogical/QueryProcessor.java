package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("name")) {
            return "SZ-Team";
        }
        else if (query.toLowerCase().contains("secret")) {
            return "This is a secret message! The password is admin";
        }
        else if (query.toLowerCase().contains("plus")) {
            String[] parts = query.split(" ");
            
            String result = Integer.toString(Integer.parseInt(parts[2]) + Integer.parseInt(parts[4]));
            System.out.println(result);
            return result;
        }
        // what is 1 plus 1
        // else if (query.toLowerCase().contains("largest")) {
        //     String[] parts = query.split("%20");
        //     return Integer.toString(Integer.parseInt(parts[]) + Integer.parseInt(parts[4]));
        // }
        // which of the following numbers is the largest: 375, 51
        
        return "";
    }
}
