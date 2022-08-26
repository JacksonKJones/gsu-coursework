# Imports tool for drawing the rectangle
import turtle

# Gives value to width and height and calculates area
w = 4.5
h = 7.9
a = w * h

# Draws the rectangle using the provided lengths
x = "ii"
for x in x:
    turtle.forward(w)
    turtle.right(90)
    turtle.forward(h)
    turtle.right(90)

# Displays the calculated area
turtle.penup()
turtle.goto(0,60)
turtle.write('The area of this rectangle is:')
turtle.goto(0,50)
turtle.write(a)
turtle.done()
