nums = []
count = int(input("\nEnter the number of elements the array will have: "))
for i in range(1, count + 1):
    num = int(input(f"\nEnter integer {i}: "))
    nums.append(num)
ans = nums + nums
print(ans)
