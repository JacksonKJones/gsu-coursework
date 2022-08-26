import random

num1 = random.randint(0,99)
num2 = random.randint(0,99)
answer = eval(input("What is " + str(num1) + " + " + str(num2) + "?"))

print("Your answer is",num1+num2==answer)
