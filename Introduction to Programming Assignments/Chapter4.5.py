start = eval(input("Enter today's day: "))
passed = eval(input("Enter the number of days elapsed since today: "))
passed = (passed+start) % 7

if start == 0:
    start = "Sunday"
elif start == 1:
    start = "Monday"
elif start == 2:
    start = "Tuesday"
elif start == 3:
    start = "Wednesday"
elif start == 4:
    start = "Thursday"
elif start == 5:
    start = "Friday"
elif start == 6:
    start = "Saturday"

if passed == 0:
    passed = "Sunday"
elif passed == 1:
    passed = "Monday"
elif passed == 2:
    passed = "Tuesday"
elif passed == 3:
    passed = "Wednesday"
elif passed == 4:
    passed = "Thursday"
elif passed == 5:
    passed = "Friday"
elif passed == 6:
    passed = "Saturday"

print("Today is",start,"and the future day is",passed)
