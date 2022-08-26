class Account:
    def __init__(self, id = 0, balance = 100, annualInterestRate = 0):
        self.__id = id
        self.__balance = balance
        self.__annualInterestRate = annualInterestRate / 100

    def getID(self):
        return self.__id

    def setID(self, id):
        self.__id = id

    def getBalance(self):
        return self.__balance

    def setBalance(self, balance):
        self.__balance = balance

    def getAnnualInterestRate(self):
        return self.__annualInterestRate

    def setAnnualInterestRate(self, annualInterestRate):
        self.__annualInterestRate = annualInterestRate / 100

    def getMonthlyInterestRate(self):
        return self.__annualInterestRate / 12

    def getMonthlyInterest(self):
        return (self.__annualInterestRate / 12) * self.__balance

    def withdraw(self, withdraw):
        self.__balance -= withdraw

    def deposit(self, deposit):
        self.__balance += deposit

account = Account(1122, 20000, 4.5)

account.withdraw(2500)
account.deposit(3000)

print(account.getID())
print(account.getBalance())
print(account.getMonthlyInterestRate())
print(account.getMonthlyInterest())