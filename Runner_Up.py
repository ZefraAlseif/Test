## Find the Runner Up Score
def new_func(arr):
    arr_max = -100
    arr_second = -100
    for i in arr:
        if i > arr_max: #and i != arr_max and i != arr_second:
            arr_second = arr_max
            arr_max = i
        elif i < arr_max and i >= arr_second:
            arr_second = i
    return arr_second

if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    result = new_func(arr)
    print(result)

__name__ = '__main__'