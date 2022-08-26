def getNumber(uppercaseLetter):
    if uppercaseLetter.upper() == "A" or uppercaseLetter.upper() == "B" or uppercaseLetter.upper() == "C":
        return 2
    if uppercaseLetter.upper() == "D" or uppercaseLetter.upper() == "E" or uppercaseLetter.upper() == "F":
        return 3
    if uppercaseLetter.upper() == "G" or uppercaseLetter.upper() == "H" or uppercaseLetter.upper() == "I":
        return 4
    if uppercaseLetter.upper() == "J" or uppercaseLetter.upper() == "K" or uppercaseLetter.upper() == "L":
        return 5
    if uppercaseLetter.upper() == "M" or uppercaseLetter.upper() == "N" or uppercaseLetter.upper() == "O":
        return 6
    if uppercaseLetter.upper() == "P" or uppercaseLetter.upper() == "Q" or uppercaseLetter.upper() == "R" or uppercaseLetter.upper() == "S":
        return 7
    if uppercaseLetter.upper() == "T" or uppercaseLetter.upper() == "U" or uppercaseLetter.upper() == "V":
        return 8
    if uppercaseLetter.upper() == "W" or uppercaseLetter.upper() == "X" or uppercaseLetter.upper() == "Y" or uppercaseLetter.upper() == "Z":
        return 9

number = input("Enter a string:")

for i in number:
    if i.isalpha():
        print(getNumber(i), end="")
    else:
        print(i, end="")