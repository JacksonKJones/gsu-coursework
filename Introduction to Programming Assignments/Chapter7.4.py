class Fan:
    def __init__(self, speed="SLOW", radius=5, color="blue", on=False):
        self.__SLOW = "SLOW"
        self.__MEDIUM = "MEDIUM"
        self.__FAST = "FAST"
        self.__speed = speed
        self.__on = on
        self.__radius = radius
        self.__color = color

    def getSpeed(self):
        if self.__speed == 1:
            return self.__SLOW
        elif self.__speed == 2:
            return self.__MEDIUM
        elif self.__speed == 3:
            return self.__FAST
        else:
            return self.__speed

    def setSpeed(self, speed):
        if speed == self.__SLOW or speed == 1:
            self.__speed = self.__SLOW
        elif speed == self.__MEDIUM or speed == 2:
            self.__speed = self.__MEDIUM
        elif speed == self.__FAST or speed == 3:
            self.__speed = self.__FAST

    def getOn(self):
        return self.__on

    def setOn(self, on):
        self.__on = on

    def getRadius(self):
        return self.__radius

    def setRadius(self, radius):
        self.__radius = radius

    def getColor(self):
        return self.__color

    def setColor(self, color):
        self.__color = color

fan1 = Fan()
fan2 = Fan()

fan1.setSpeed(3)
fan1.setRadius(10)
fan1.setColor("yellow")
fan1.setOn(True)

fan2.setSpeed(2)

print(fan1.getSpeed(), fan1.getRadius(), fan1.getColor(), fan1.getOn())
print(fan2.getSpeed(), fan2.getRadius(), fan2.getColor(), fan2.getOn())