def gcd(numbers):
    t = 1
    k = 2
    while k <= int(numbers[0]) and k <= int(numbers[1]) and k <= int(numbers[2]) and k <= int(numbers[3]) and k <= int(numbers[4]):
        if int(numbers[0]) % k == 0 and int(numbers[1]) % k == 0 and int(numbers[2]) % k == 0 and int(numbers[3]) % k == 0 and int(numbers[4]) % k == 0:
            t = k
        k += 1
    return t

num = input("Enter five numbers")
lst = num.split()
print(gcd(lst))