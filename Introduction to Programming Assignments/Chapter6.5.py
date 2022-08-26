def displaySortedNumbers(num1, num2, num3):
    print("The sorted numbers are", end=" ")
    numl = [num1, num2, num3]
    numl.sort()
    print(numl[0] , numl[1], numl[2])

num1,num2,num3 = eval(input("Enter three numbers: "))
displaySortedNumbers(num1, num2, num3)