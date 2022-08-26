inv = eval(input("Enter investment amount: "))
ir = eval(input("Enter annual interest rate: "))
y = eval(input("Enter number of years: "))
fv = (int(100*(inv * (1 + (ir/12)) ** (y*12))))/100
print("Accumulated value is:",fv)
