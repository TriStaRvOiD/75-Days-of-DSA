def shuffle_list(the_list):
    n = len(nums) // 2
    result = []
    
    for i in range(n):
        result.append(nums[i])
        result.append(nums[i + n])
    
    return result

nums = []
while (True):
    print("\nEnter number of elements the array will have. It must be at least 4, and an even number.")
    count = int(input("Enter here: "))
    if count >= 4 and count % 2 == 0:
        break
    else:
        print("\nInvalid.")

for i in range(1, count + 1):
    num = int(input(f"\nEnter integer {i}: "))
    nums.append(num)

print(shuffle_list(nums))
