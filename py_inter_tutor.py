#Python Conditions and If statements
a = 200
b = 33
if b > a:
  print("b is greater than a")
elif a == b:
  print("a and b are equal")
else:
  print("a is greater than b")

# while else loop
i = 1
while i < 6:
  print(i)
  i += 1
else:
  print("i is no longer less than 6")

# 15 nested for loops
adj = ["red", "big", "tasty"]
fruits = ["apple", "banana", "cherry"]

for x in adj:
  for y in fruits:
    print(x, y)

#16 commit - Function
def my_function():
  print("Hello from a function")

my_function()
