'''(Display four patterns using loops) Use nested loops that display the following
patterns in four separate programs:
Pattern A Pattern B Pattern C Pattern D
1 1 2 3 4 5 6 1 1 2 3 4 5 6
1 2 1 2 3 4 5 2 1 1 2 3 4 5
1 2 3 1 2 3 4 3 2 1 1 2 3 4
1 2 3 4 1 2 3 4 3 2 1 1 2 3
1 2 3 4 5 1 2 5 4 3 2 1 1 2
1 2 3 4 5 6 1 6 5 4 3 2 1 1'''

print("Pattern A", end="")
for i in range(1, 8):
    for k in range(1, i):
        print(k, "", end="")
    print()
print()
print("Pattern B")
for i in range(0, 6):
    for k in range(1, 7 - i):
        print(k, "", end="")
    print()
print()
print("Pattern C", end="")
for i in range(1, 8):
    for j in range(0, 7 - i):
        print("  ", end="")
    for k in range(i, 1, -1):
        print(k-1, "", end="")
    print()
print()
print("Pattern D")
for i in range(0, 6):
    for k in range(1, 7 - i):
        print(k, "", end="")
    print()
