#Quick Sort

def partition(arr, p, r):
    x = arr[r]
    i = p - 1

    for j in range(p, r):
        if (arr[j] <= x):
            i = i + 1
            (arr[i], arr[j]) = (arr[j], arr[i])
    
    (arr[i + 1], arr[r]) = (arr[r], arr[i +1])

    q = i + 1
    return q


def quickSort(arr, p, r):
    if(p < r):
        q = partition(arr, p, r)
        quickSort(arr, p, q - 1)
        quickSort(arr, q + 1, r)



#main
if __name__ == "__main__":
    arr = [5, 3, 8, 6, 7, 2]
    n = len(arr)
    quickSort(arr, 0, n - 1)
    print(arr)
    
    # arr1 = list (map(int, list("77 99 44 55 22 88 11 0 66 33".split(" "))))
    # n1 = len(arr1)
    # quickSort(arr1, n1)