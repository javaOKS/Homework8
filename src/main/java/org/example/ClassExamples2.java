package org.example;
public class ClassExamples2 {
    public int maxProfit(int [] prices){
        int maxprofit = 0;
        int current = 0;
        while(current < prices.length-1){
            if(prices[current] < prices[current+1]){
                int index = current+1;
                while (index < prices.length){
                    if(maxprofit < (prices[index] - prices[current])){
                        maxprofit = prices[index] - prices[current];
                    }
                    index++;
                }
            }
           current++;
        }
        return maxprofit;
    }

}
