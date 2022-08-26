def addMatrix(a, b):
    c = []
    for i in range(0, 9):
        c.append(a[i] + b[i])
    return c


ma = [int(x) for x in input("Enter matrix1: ").split()]
mb = [int(x) for x in input("Enter matrix2: ").split()]
mc = addMatrix(ma, mb)

ca = 0
cb = 0
cc = 0
print("The matrices are added as follows: ")
for i in range(0, 3):
    for j in range(0, 3):
        print(ma[j + ca], end=" ")
    if i == 1:
        print("+ ", end="")
    else:
        print("  ", end="")
    for k in range(0, 3):
        print(mb[k + cb], end=" ")
    if i == 1:
        print("= ", end="")
    else:
        print("  ", end="")
    for l in range(0, 3):
        print(mc[l + cc], end=" ")
    print()
    ca += 3
    cb += 3
    cc += 3