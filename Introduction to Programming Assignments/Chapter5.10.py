students = eval(input("How many students are there?"))
score = eval(input("Enter Student Score"))
name = input("Enter Student Name")
hscore = score
hname = name

while students > 1:
   score = eval(input("Enter Student Score"))
   name = input("Enter Student Name")
   if score >= hscore:
       hscore = score
       hname = name
   students -= 1

print("The highest score of", hscore, "was made by", hname)