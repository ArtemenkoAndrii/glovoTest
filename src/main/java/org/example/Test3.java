package org.example;

import java.util.ArrayList;
import java.util.List;

public class Test3 {



    public static List<Integer> test(List<Integer> value) {
        List<Integer> subArray = new ArrayList<>();

        for(int i=0; i<value.size(); i++) {
            int sum = 0;

            for (int j=i+1; j< value.size(); j++) {
                sum=sum+value.get(j);
                subArray.add(value.get(j));
                if (sum==0) {
                    return subArray;
                }
            }
            subArray.clear();
        }
        return subArray;
    }


}
