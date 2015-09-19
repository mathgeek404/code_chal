def quicksort(leftInd,rightInd, array):
    lt = leftInd
    rt = rightInd 
    if (lt >= rt) :
        return
    # Pick pivot
    pivot = array[rt]
    pivot_index = rt
    rt = rt-1;
    # Consider left, right most element in "subarray"
    while (lt < rt):
        #Iterate until left ptr > right ptr
        if (array[lt] < pivot):
            lt = lt + 1
        elif (pivot < array[rt]):
            rt = rt - 1
        else:
            temp = array[lt]
            array[lt] = array[rt]
            array[rt] = temp
    
    if (array[rt]< pivot):
        rt = rt + 1
    array[pivot_index] = array[rt]
    array[rt] = pivot
    quicksort(leftInd,rt-1, array)
    quicksort(rt+1,rightInd, array)

for i in range(0,input()):
    input()
    candy_distr = map(int,raw_input().split(' '))
    quicksort(0,len(candy_distr)-1,candy_distr)
    steps = 0
    for i in range(0,len(candy_distr)):
        if candy
    
