L=list(map(int,input('Enter the orders : ').split(' ')))# or you can get the N value and get the input using for loop
L1=[]
temp=0
for i in L:
    if i!=0:
        L1.append(i)
    else:
        temp+=1

if temp!=0:
    for i in range(temp):
        L1.append(0)
print(L1)