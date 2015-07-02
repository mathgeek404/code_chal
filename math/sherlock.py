import math
from decimal import *

data = raw_input().split(' ')
L = float(data[0])
S_a = float(data[1])
S_b = float(data[2])

v = abs(S_a-S_b)

for _ in range(0,input()):
    A = float(input())
    print Decimal(math.sqrt(2))*Decimal(L-math.sqrt(A))/Decimal(v)
