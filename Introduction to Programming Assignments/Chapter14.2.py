numbers = [int(x) for x in input("Enter numbers: ").split()]

tCount = 0
tNumber = []
for i in range(0, len(numbers)):
    count = 1
    for j in range(0, len(numbers)):
        if i == j:
            continue
        elif numbers[i] == numbers[j]:
            count += 1
    if tCount == count:
        tNumber.append(numbers[i])
    elif tCount < count:
        tCount = count
        tNumber = [numbers[i]]
print(set(tNumber), "occurs", tCount, "times.")