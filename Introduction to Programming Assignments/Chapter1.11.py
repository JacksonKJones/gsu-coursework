# Gives value for current population
p = 312032486

# Gives value in seconds for frequency of births, deaths, and immigrants
b = 7
d = 13
i = 45

# Calculates Seconds in a Year
ysec = 60 * 60 * 24 * 365

# Calculates births, deaths, and immigrants per year
by = ysec // b
dy = ysec // d
iy = ysec // i

# Tells program to calculate out five years in the future
x = "iiiii"
y = 1
# Prints current population
print("This is the current population:")
print(p)
for x in x:
    # Adds population for each year passed
    p = p + by - dy + iy
    # Differentiates between singular and plural years
    if y == 1:
        print('This is the population in',y,'year:')
    else:
        print('This is the population in',y,'years:')
    # Prints population of program's perceived year
    print(p)
    # Tells program to act as though a year has passed
    y = y + 1
