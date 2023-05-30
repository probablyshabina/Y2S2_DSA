
def binarySearch(A, min, max, key):
    if( max < min):
        return -1
    else:
        mid = (max + min ) // 2
        if(A[mid] < key):
            return binarySearch(A, mid + 1 , max, key)
        if(A[mid] > key):
            return binarySearch(A, min, mid - 1 , key)
        if(A[mid] == key):
            return mid

#main
if __name__ == "__main__":
    arr = [2, 3, 5, 6, 7, 8]
    print(arr)
    n = len(arr)
    print(binarySearch(arr, 0, n - 1, 7))
    