count = 100
line = 0
while count <= 200:
    if count % 5 == 0 or count % 6 == 0:
        print(count, end=" ")
        line += 1
    if line == 10:
        print()
        line = 0
    count += 1