#code here
def smallest_subarray_with_sum_at_least_s(n, s, arr):
    min_len = float('inf')
    current_sum = 0
    left = 0

    for right in range(n):
        current_sum += arr[right]

        while current_sum >= s:
            min_len = min(min_len, right - left + 1)
            current_sum -= arr[left]
            left += 1

    return min_len if min_len != float('inf') else -1

# Main driver
T = int(input())
for _ in range(T):
    n, s = map(int, input().split())
    arr = list(map(int, input().split()))
    result = smallest_subarray_with_sum_at_least_s(n, s, arr)
    print(result)
