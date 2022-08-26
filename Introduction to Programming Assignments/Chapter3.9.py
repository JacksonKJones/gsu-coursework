name = input("Enter employee's name: ")
week = eval(input("Enter number of hours worked in a week: "))
pay = eval(input("Enter hourly pay rate: "))
fed = eval(input("Enter federal tax withholding rate: "))
state = eval(input("Enter state tax withholding rate: "))

gross = week * pay
fedw = gross * fed
statew = gross * state
fed = fed * 100
state = state * 100
net = gross - fedw - statew

print("Employee name:",name)
print("Hours worked:",week)
print("Pay Rate: $" + str(pay))
print("Gross Pay: $" + str(gross))
print("Deductions:")
print("  Federal Withholding (" + str(fed) + "%): $" + str(fedw))
print("  State Witholding (" + str(state) + "%): $" + str(statew))
print("Net Pay: $" + str(net))
