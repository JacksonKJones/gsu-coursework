def locateLargest(a):
    location = [0, 0]
    largest = a[0][0]
    for i in range(0, len(a)):
        for j in range(0, len(a[i])):
            if largest < a[i][j]:
                largest = a[i][j]
                location = [i, j]
    print("The location of the largest element is at", location)




matrix = []
tRows = eval(input("Enter number of rows in list: "))
for i in range(tRows):
    rows = input("Enter a row: ")
    elem = rows.split()
    line = [eval(x) for x in elem]
    matrix.append(line)

locateLargest(matrix)