# Imports tool for drawing the circle
import turtle

# Gives value to radius and calculates area and perimeter
r = 5.5
a = r * r * 3.14
p = 2 * r * 3.14

# Draws the circle using the provided radius
turtle.circle(r)

# Displays the calculated area and perimeter
turtle.penup()
turtle.goto(0, 80)
turtle.write('The area of this circle is:')
turtle.goto(0, 70)
turtle.write(a)
turtle.goto(0, 60)
turtle.write('The perimeter of this circle is:')
turtle.goto(0, 50)
turtle.write(p)
turtle.done()
