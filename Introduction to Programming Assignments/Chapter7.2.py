class Stock:
    def __init__(self, symbol, name, previousClosingPrice, currentPrice):
        self.__symbol = symbol
        self.__name = name
        self.__previousClosingPrice = previousClosingPrice
        self.__currentPrice = currentPrice

    def getName(self):
        return self.__name

    def getSymbol(self):
        return self.__symbol

    def getPreviousClosingPrice(self):
        return self.__previousClosingPrice

    def setPreviousClosingPrice(self, previousClosingPrice):
        self.__previousClosingPrice = previousClosingPrice

    def getCurrentPrice(self):
        return self.__currentPrice

    def setCurrentPrice(self, currentPrice):
        self.__currentPrice = currentPrice

    def getChangePercent(self):
        return int((self.__currentPrice - self.__previousClosingPrice)*10000)/100

stock = Stock("INTC", "Intel Corporation", 20.5, 20.35)
