# Bubble Sort Algorithm


def bubbleSort(arr, n):
    print(arr)

    #bigger loop to loop n times the array
    for i in range(n):
        #loops to sort from 0 to n-1
        #n-i-1 because the last element is already sorted
        for j in range(n-i):
            if(arr[j] > arr[j+1]):
                #swap
                arr[j], arr[j+1] = arr[j+1], arr[j]

    print(arr)

#main
if __name__ == "__main__":
    arr = [5, 3, 8, 6, 7, 2]
    n = len(arr)
    bubbleSort(arr, n - 1)
    
    arr1 = list (map(int, list("77 99 44 55 22 88 11 0 66 33".split(" "))))
    n1 = len(arr1)
    bubbleSort(arr1, n1 - 1)