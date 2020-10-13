#A number N is a Sastry Number if N concatenated with N + 1 gives
#a perfect square. 
#Examples: 
#Input: N = 183 
#Output: Yes 
#Explanation: 183 + 184 = 183184 = 4282
#Input: N = 28 
#Output: No 
import math 
def isPerfectSquare(x):
    sr = math.sqrt(x) 
    return ((sr - int(sr)) == 0) 
def isSastry(n): 
    conc = str(n) + str(n + 1) 
    Num = int(conc) 
    return isPerfectSquare(Num) 
N = int(input("Enter a number: "))
if (isSastry(N)): 
    print(str(N)+" is Sastry Number") 
else: 
    print(str(N)+" is not a Sastry Number") 
  
