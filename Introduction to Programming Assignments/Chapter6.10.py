def isPrime(number):
    divisor = 2
    while divisor <= number / 2:
        if number % divisor == 0:
            return False
        divisor += 1
    return True

count = 2
total = 0
while count < 10000:
    if isPrime(count):
        total += 1
    count += 1

print("There are", total, "prime numbers below 10,000")
