import turtle

r = eval(input("Enter the radius of the rings: "))
lx = r * -2.1
ly = r * 1.05

def circ():
    turtle.pendown()
    turtle.circle(r)
    turtle.penup()

turtle.width(5)
turtle.penup()
turtle.goto(lx,0)
turtle.color("blue")
circ()
turtle.goto(lx / 2,0 - ly)
turtle.color("yellow")
circ()
turtle.goto(0,0)
turtle.color("black")
circ()
turtle.goto((lx / 2) * -1,0 - ly)
turtle.color("green")
circ()
turtle.goto(lx * -1,0)
turtle.color("red")
circ()
turtle.done()
