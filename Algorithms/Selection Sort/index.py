#Selection sort
#Time Complexity: O(n^2)

def selectionSort(arr, n):
    print(arr)

    #bigger loop to loop n times the array
    for i in range(n):
        min = i
        for j in range(i+1, n):
            if(arr[j] < arr[min]):
                min = j
        arr[min], arr[i] = arr[i], arr[min]

    print(arr)

#main
if __name__ == "__main__":
    arr = [5, 3, 8, 6, 7, 2]
    n = len(arr)
    selectionSort(arr, n)
    
    # arr1 = list (map(int, list("77 99 44 55 22 88 11 0 66 33".split(" "))))
    # n1 = len(arr1)
    # selectionSort(arr1, n1)
