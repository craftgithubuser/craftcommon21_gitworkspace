#mathematical expression as string

a = ("b/c*d")

b=4.2
c=0
d=10

print(type(a))

#mathematical expression as they are

b=4.2
c=2
d=10
z=0

a = (b/c*d)

print(a)

#error handling mathematical expression, Z instead of c, h insead of a

try:
    h = (b/z*d)
    print(h)
except ZeroDivisionError:
    print("z cannot be zero, it is undefined error")
finally:
    print("check answer again to make sure")
    
#user input equations

num1 = int(input("Enter First Number: "))
num2 = int(input("Enter Second Number: "))
num3 = int(input("Enter Second Number: "))

z = num1/num2*2 + num3

print(z)






    
