import sys


def largest_sum_in_window(arr: list, k: int):
    n = len(arr)
    largest = sys.float_info.min
    for i in range(0, n - k + 1):
        window_sum = 0
        for j in range(0, k):
            window_sum = window_sum + arr[i + j]
        if window_sum > largest:
            largest = window_sum
    return largest


def largest_sum(arr: list):
    if len(arr) == 0:
        return 0

    largest = sys.float_info.min
    for window in range(1, len(arr)):
        window_sum = largest_sum_in_window(arr, window)
        if window_sum > largest:
            largest = window_sum
    return largest


if __name__ == '__main__':
    print(largest_sum([-4, 2, -5, 1, 2, 3, 6, -5, 1]))
