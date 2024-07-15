def max_subarray_sum(nums):
    max_current = nums[0]
    max_global = nums[0]
    
    for i in range(1, len(nums)):
        max_current = max(nums[i], max_current + nums[i])
        if max_current > max_global:
            max_global = max_current
    
    return max_global

nums = [1, 3, 3, 232, 54, 2, 4231, 43, 95]

print(max_subarray_sum(nums))