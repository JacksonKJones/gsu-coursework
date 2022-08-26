weight = eval(input("Enter weight in pounds: "))
feet = eval(input("Enter feet: "))
inches = eval(input("Enter inches: "))
inches = inches + feet * 12
bmi = (weight / (inches ** 2)) * 703

print("BMI is",bmi)
print("You are")
if bmi < 18.5:
    print("Underweight")
elif bmi < 25:
    print("Normal")
elif bmi < 30:
    print("Overweight")
else:
    print("Obese")
