class Solution:
    def fib(self, n: int) -> int:
        dic={}
        def fibo(n,dic):
            if n==0 or n==1:
                return n
            else:
                dic[n]=fibo(n-1,dic)+fibo(n-2,dic)
                return dic[n]
            
        return fibo(n,dic)


        
        