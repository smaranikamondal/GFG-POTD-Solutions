#code here
def josephus(n, k):
    if n == 1:
        return 1
    else :
        return (josephus(n-1, k) + k-1) % n + 1
        
T = int(input())
for _ in range(T):
    n, k = map(int, input().split())
    print(josephus(n, k))
