def printChars(ch1, ch2, numberPerLine):
    counter = 0
    for i in range(ord(ch1), ord(ch2) + 1):
        if chr(i).isalnum():
            print(chr(i), end=" ")
            counter += 1
        if counter % numberPerLine == numberPerLine - 1:
            print()

printChars("1", "Z", 10)
