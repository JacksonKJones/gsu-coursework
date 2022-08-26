genome = input("Enter a genome string")
rec = False
start = -1
for i in range(0, len(genome) - 2):
    tri = genome[i:i+3]
    if tri == "ATG":
        start = i + 3
    elif (tri == "TAG" or tri == "TAA" or tri == "TGA") and start != -1:
        gene = genome[start:i]
        if len(gene) % 3 == 0:
            rec = True
            print(gene)
            start = -1
if rec == False:
    print("No genes")

