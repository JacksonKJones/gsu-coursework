def count(s, ch):
    count = 0
    for i in s:
        if ch == i:
            count += 1
    return count

word = input("Enter string: ")
letter = input("Enter character: ")
print(count(word, letter))

