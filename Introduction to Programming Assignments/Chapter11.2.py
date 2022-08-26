def sumMajorDiagonal(m):
    total = 0
    for i in range(0, len(m)):
        total += int(m[i][i])
    return total
l1 = input("Enter a 4-by-4 matrix row for row 1:")
l2 = input("Enter a 4-by-4 matrix row for row 2:")
l3 = input("Enter a 4-by-4 matrix row for row 3:")
l4 = input("Enter a 4-by-4 matrix row for row 4:")

lst = [l1.split(), l2.split(), l3.split(), l4.split()]
print(sumMajorDiagonal(lst))