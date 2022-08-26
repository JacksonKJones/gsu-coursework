def reverse(number):
    number = str(number)
    number = number[::-1]
    return number

number = eval(input("Enter a number: "))
print(reverse(number))