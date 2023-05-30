def merge(arr, p, q, r):
    #lengths of the array
    n1 = q - p + 1
    n2 = r - q

    #create arrays with lenghts
    L = [0] * (n1 + 1)
    R = [0] * (n2 + 1)

    #copy data to arrays
    for i in range(0, n1):
        L[i] = arr[p + i]
    for j in range(0, n2):
        R[j] = arr[q + j + 1]

    #sentinel values
    L[n1] = float('inf')
    R[n2] = float('inf')

    #merge
    i = 0
    j = 0
    for k in range(p, r + 1):
        if( L[i] < R[j]):
            arr[k] = L[i]
            i += 1
        else:
            arr[k] = R[j]
            j += 1


def mergeSort(arr, p, r):
    if(p < r):
        q = (p + r) // 2
        mergeSort(arr, p, q)
        mergeSort(arr, q + 1, r)
        merge(arr, p, q, r)

#main
if __name__ == "__main__":
    arr = [5, 3, 8, 6, 7, 2]
    n = len(arr)
    print(arr)
    mergeSort(arr, 0, n - 1)
    print(arr)
    
