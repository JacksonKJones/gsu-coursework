num = input("Enter Integers between 1 and 100")
lst = num.split()
lst.sort()
save = False

for i in range(0, len(lst)):
    if lst[i] == save:
        continue
    save = lst[i]
    count = 0
    for j in range(0, len(lst)):
        if lst[i] == lst[j]:
            count += 1
    if count > 1:
        print(lst[i], "occurs", count, "times")
    else:
        print(lst[i], "occurs", count, "time")