#https://www.hackerrank.com/challenges/insertionsort1/problem?isFullScreen=true

def insertionSort1(n, arr):
    for i in range(1, n):
        temp = arr[i]
        j = i
        while(j > 0 and arr[j-1] > temp):
            arr[j] = arr[j - 1]
            j -= 1
        arr[j] = temp
                

def selectionSort(arr, n):
    for i in range(n):
        min = i
        for j in range(i+1, n):
            if(arr[j] < arr[min]):
                min = j
        arr[min], arr[i] = arr[i], arr[min]
        print(*arr)  


def bubbleSort(arr, n):
    for out in range(n):
        for i in range(n - out):
            if(arr[i] > arr[i+1]):
                arr[i], arr[i+1] = arr[i+1], arr[i]

def quickSort(arr, p, n):

    def partition(arr, low, high):
        x = arr[high]
        i = low - 1

        for j in range(low, high):
            if(arr[j] <= x):
                i += 1
                arr[i], arr[j] = arr[j], arr[i]
        arr[i+1], arr[high] = arr[high], arr[i+1]
        return i+1

    q = partition(arr, p, n)
    quickSort(arr, p, q-1)
    quickSort(arr, q+1, n)

if __name__ == '__main__':
    # n = int(input().strip())

    # arr = list(map(int, input().rstrip().split()))

    insertionSort1(5, [2,4, 6, 8, 3])
    print()
    selectionSort([2,4, 6, 8, 3], 5)
