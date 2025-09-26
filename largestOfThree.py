def find(num1, num2, num3):
    l = num1
    if num2 > l:
        l = num2
    if num3 > l:
        l = num3
    return l

num1 = float(input("Enter the first number: "))
num2 = float(input("Enter the second number: "))
num3 = float(input("Enter the third number: "))

largest_number = find(num1, num2, num3)

print("The largest number among", num1, ",", num2, "and", num3, "is:", largest_number)
