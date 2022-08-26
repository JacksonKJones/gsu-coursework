def format(number, width):
    number = str(number)
    fill = width - len(number)
    return "0" * fill + number

number = eval(input("Enter an integer: "))
width = eval(input("Enter the width: "))
print("The formatted number is", format(number, width))