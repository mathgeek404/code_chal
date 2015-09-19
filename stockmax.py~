#Assumptions: Always buy if future has better value
# Sell if future is not better
# Sell all or save all, no partial selling

inputs = []
for _ in range(0,input()):
    inputs.append((input(), map(int,raw_input().split(' '))))
for v in inputs:
    prices = v[1]
    max_prices =list(prices)
    for i in reversed(range(0,len(prices)-1)):
        max_prices[i] = max(prices[i],max_prices[i+1])
    
    profit = 0
    shares = 0
    for i in range(0,len(prices)):
        if (max_prices[i] > prices[i]):
            shares += 1
            profit -= prices[i]
        else:
            profit += shares * prices[i]
            shares = 0
    print(profit)
