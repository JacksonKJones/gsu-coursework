import turtle

def drawChessboard(startx, endx, starty, endy):
    def border():
        for i in range(0, 2):
            turtle.forward(endx - startx)
            turtle.right(90)
            turtle.forward(endy - starty)
            turtle.right(90)

    def blackSquare():
        turtle.begin_fill()
        for i in range(0, 2):
            turtle.forward((endx - startx)/8)
            turtle.right(90)
            turtle.forward((endy - starty)/8)
            turtle.right(90)
        turtle.end_fill()

    def fillBlackRow():
        blackSquare()
        for i in range(0, 3):
            turtle.forward((endx - startx)/4)
            blackSquare()

    turtle.speed(0)
    turtle.hideturtle()
    turtle.penup()
    turtle.width(1)
    turtle.goto(startx, starty)
    turtle.pendown()

    border()

    up = starty
    for i in range(0, 4):
        turtle.penup()
        turtle.goto(startx + (endx - startx)/8, up)
        up -= (endy - starty)/8
        turtle.pendown()
        fillBlackRow()
        turtle.penup()
        turtle.goto(startx, up)
        up -= (endy - starty)/8
        turtle.pendown()
        fillBlackRow()


drawChessboard(-250, -50, 250, 50)
drawChessboard(50, 250, -50, -250)
turtle.done()