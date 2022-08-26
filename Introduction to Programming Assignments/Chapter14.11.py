filename = input("Enter a filename: ").strip()
file = open(filename, "r")

vowels = set("aeiouAEIOU")
consonants = set("bcdfghjklmnpqrstvwxyzBCDFQHJKLMNPQRSTVWXYZ")

cv = 0
cc = 0
for i in file.read():
    if i in vowels:
        cv += 1
    elif i in consonants:
        cc += 1
print("There are", cv, "vowels and", cc, "consonants")