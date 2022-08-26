import turtle

def border():
    for i in range(0, 4):
        turtle.forward(400)
        turtle.right(90)

def blackSquare():
    turtle.begin_fill()
    for i in range(0, 4):
        turtle.forward(50)
        turtle.right(90)
    turtle.end_fill()

def fillBlackRow():
    blackSquare()
    for i in range(0, 3):
        turtle.forward(100)
        blackSquare()

turtle.speed(0)
turtle.hideturtle()
turtle.penup()
turtle.width(5)
turtle.goto(-200, 200)
turtle.pendown()

border()

y = 200
for i in range(0,4):
    turtle.penup()
    turtle.goto(-150, y)
    y -= 50
    turtle.pendown()
    fillBlackRow()
    turtle.penup()
    turtle.goto(-200, y)
    y -= 50
    turtle.pendown()
    fillBlackRow()

turtle.done()
