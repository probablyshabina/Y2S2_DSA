#Insertion Sort

def insertionSort(arr, n):
    print(arr)

    for i in range(1, n):
        temp = arr[i]
        j = i
        while(j > 0 and arr[j-1] > temp):
            arr[j] = arr[j-1]
            j -= 1
        arr[j] = temp

    print(arr)

#main
if __name__ == "__main__":
    arr = [5, 3, 8, 6, 7, 2]
    n = len(arr)
    insertionSort(arr, n)
    
    arr1 = list (map(int, list("77 99 44 55 22 88 11 0 66 33".split(" "))))
    n1 = len(arr1)
    insertionSort(arr1, n1)
