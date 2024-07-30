def min_repeats(a, b):
    repeat_count = -(-len(b) // len(a))  # This is equivalent to math.ceil(len(b) / len(a))
    
    repeated_a = a * repeat_count
    
    if b in repeated_a:
        return repeat_count
    
    repeated_a += a
    if b in repeated_a:
        return repeat_count + 1
    
    return -1

a = "abcd"
b = "cdabcdab"
print(min_repeats(a, b))