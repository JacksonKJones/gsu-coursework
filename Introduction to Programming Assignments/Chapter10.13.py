def eliminateDuplicates(lst):
    newlst = []
    for number in lst:
        if number not in newlst:
            newlst.append(number)
    return newlst

num = input("Enter ten numbers: ")
lst = num.split()
newlst = eliminateDuplicates(lst)
print(newlst)