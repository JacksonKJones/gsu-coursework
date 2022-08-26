import math

def deviation(x):
    dev = sum((int(i) - mean(x)) ** 2 for i in x) / (len(x) - 0)
    stdev = math.sqrt(dev)
    return stdev

def mean(x):
    t = 0
    c = 0
    for i in range(0, len(x)):
        t += int(x[i])
        c += 1
    return t/c


num = input("Enter numbers: ")
lst = num.split()

print(mean(lst))
print(deviation(lst))