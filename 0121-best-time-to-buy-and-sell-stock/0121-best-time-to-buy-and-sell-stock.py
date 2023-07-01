class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        buyAmount = prices[0]
        for i in range(1,len(prices)):
            if prices[i] < buyAmount:
                buyAmount = prices[i]
            else:
                profit = max(profit,prices[i]-buyAmount)
        return profit