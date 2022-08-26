import random

def printMatrix(n):
    for k in range(0, n):
        for i in range(0, n):
            print(random.randint(0,1), end=" ")
        print()

n = eval(input("Enter n: "))
printMatrix(n)