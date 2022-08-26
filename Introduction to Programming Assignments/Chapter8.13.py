def prefix(s1, s2):
    short = len(min(s1, s2))
    pre = ""
    for i in range(0, short):
        if s1[i] == s2[i]:
            pre += s1[i]
        else:
            return pre
    return pre

def main():
    s1 = input("Enter string: ")
    s2 = input("Enter string: ")
    print("The longest prefix is", prefix(s1, s2))

main()