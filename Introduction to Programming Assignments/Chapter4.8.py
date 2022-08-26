num = str(input("Enter a 3-digit number "))

x = num[0]
y = num[1]
z = num[2]

a = min(x,y,z)
c = max(x,y,z)
b = (int(x)+int(y)+int(z))-int(a)-int(c)

print("Here are the numbers in increasing order:",a,b,c)
