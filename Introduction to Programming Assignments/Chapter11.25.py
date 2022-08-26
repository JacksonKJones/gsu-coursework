def isMarkovMatrix(m):
    t = 0
    for i in range(0, len(m)):
        c = 0
        for j in range(0, len(m[i])):
            c += float(m[j][i])
            if c == 1:
                t += 1
    if t == 3:
        print("It is a Markov Matrix")
    else:
        print("It is not a Markov Matrix")

r1 = input("Enter row 1")
r2 = input("Enter row 2")
r3 = input("Enter row 3")

lst = [r1.split(), r2.split(), r3.split()]
isMarkovMatrix(lst)