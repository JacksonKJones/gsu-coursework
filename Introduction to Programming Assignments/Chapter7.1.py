class Rectangle:
    def __init__(self, width = 1, height = 2):
        self.width = width
        self.height = height

    def getArea(self):
        return self.width * self.height

    def getPerimeter(self):
        return self.width * 2 + self.height * 2

rect1 = Rectangle(4, 40)
rect2 = Rectangle(3.5, 35.7)

print(rect1.width)
print(rect1.height)
print(rect1.getArea())
print(rect1.getPerimeter())
print(rect2.width)
print(rect2.height)
print(rect2.getArea())
print(rect2.getPerimeter())