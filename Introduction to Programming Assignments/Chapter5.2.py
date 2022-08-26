import random,time

start = int(time.time())
count = 0
correct = 0
while count < 10:
    num1,num2 = random.randint(1,15),random.randint(1,15)
    ans = eval(input("What is " + str(num1) + "+" + str(num2)))
    if num1 + num2 == ans:
        correct += 1
    count += 1
end = int(time.time())
testtime = end - start
print("You got",correct,"correct in",testtime,"seconds")