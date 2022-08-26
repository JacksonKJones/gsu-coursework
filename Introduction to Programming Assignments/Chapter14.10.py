import random

capitals = {'Alabama': 'Montgomery', 'Alaska': 'Juneau', 'Arizona':'Phoenix'}

states = list(capitals.keys())
score = 0
for i in range(3):
    qstate = random.choice(states)
    qcapital = capitals[qstate]
    print("What is the capital of", end=" ")
    answer = input(qstate)
    if answer.title() == qcapital:
        score += 1
        print("Correct!")
    else:
        print("Incorrect. The capital of", qstate, "is", qcapital)
print("Total correct is", score)
