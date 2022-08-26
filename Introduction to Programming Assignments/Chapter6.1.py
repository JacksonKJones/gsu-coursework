def getPentagonalNumber(n):
    return int((3 * n * n - n)/2)

for i in range(1, 100, 10):
    for k in range(i, i + 10):
        print(getPentagonalNumber(k), end=" ")
    print()