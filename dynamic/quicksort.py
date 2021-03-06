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
    print(array)

raw_input()
array = map(int,raw_input().split(' '))
quicksort(0,len(array)-1,array)
