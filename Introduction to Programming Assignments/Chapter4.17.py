import random

p = eval(input("scissor (0), rock (1), paper (2): "))
c = random.randint(0,2)
w = 0

if (p == 0 and c == 2) or (p == 1 and c == 0) or (p == 2 and c == 1):
    w = 1
elif (p == 0 and c == 0) or (p == 1 and c == 1) or (p == 2 and c == 2):
    w = 2

if p == 0:
    p = "scissor"
elif p == 1:
    p = "rock"
elif p == 2:
    p = "paper"

if c == 0:
    c = "scissor"
elif c == 1:
    c = "rock"
elif c == 2:
    c = "paper"

if w == 0:
    print("The computer is " + c + ". You are " + p + ". You win!")
elif w == 2:
    print("The computer is " + c + ". You are " + p + " too. It is a draw.")
else:
    print("The computer is " + c + ". You are " + p + ". You lose.")
