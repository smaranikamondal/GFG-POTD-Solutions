#code here
def find_min_element(arr):
    min_elem = arr[0]
    for num in arr[1:]:
        if num < min_elem:
            min_elem = num
    return min_elem
    
def main():
    n = int(input())
    A = list(map(int, input().split()))
    print(find_min_element(A))
    
main()