count = 0
while (True):
    print("\nEnter length of array. It cannot be less than 2.")
    count = int(input("Enter here: "))
    if count >= 2:
        break
    else:
        print("\nInvalid.")

nums = []

for i in range(1, count + 1):
    num = int(input(f"\nEnter integer {i}: "))
    nums.append(num)

good_pairs_count = 0

for i in range(len(nums)):
    for j in range(i + 1, len(nums)):
        if nums[i] == nums[j]:
            good_pairs_count += 1

print(f"Number of good pairs: {good_pairs_count}")