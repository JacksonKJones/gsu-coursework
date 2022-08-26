# Imports tool for drawing the circle
import turtle

# Gives value to radius and calculates area and perimeter
cx,cy = eval(input("Enter the co-ordinates of the center of the circle: "))
r = eval(input("Enter the radius of the circle: "))
a = r ** 2 * 3.14

# Draws the circle using the provided radius
turtle.penup()
turtle.goto(cx,cy)
turtle.write(a)
turtle.goto(cx,cy-r)
turtle.pendown()
turtle.circle(r)
turtle.done()
