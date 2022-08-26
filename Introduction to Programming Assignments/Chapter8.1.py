ssn = input("Enter your Social Security Number like so: nnn-nn-nnnn")

if len(ssn) == 11:
    if ssn[0].isdigit() and ssn[1].isdigit() and ssn[2].isdigit() and ssn[3] == "-"\
            and ssn[4].isdigit() and ssn[5].isdigit() and ssn[6] == "-" and \
            ssn[7].isdigit() and ssn[8].isdigit() and ssn[9].isdigit() and ssn[10].isdigit():
        print("Valid SSN")
        quit()
    print("Invalid SSN")

else:
    print("Invalid SSN")