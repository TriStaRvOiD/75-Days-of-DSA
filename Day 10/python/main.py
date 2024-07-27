def anagramCheck(first, second):
    if len(first) != len(second):
        return False
    
    first_dict, second_dict = {}, {}
    for element in first:
        first_dict[element] = first_dict.get(element, 0) + 1
    for element in second:
        second_dict[element] = second_dict.get(element, 0) + 1
    
    return first_dict == second_dict

s = "anagram"
t = "nagaram"
result = anagramCheck(s, t)
if result:
    print("yes")
else:
    print("no")

s = "anagra"
t = "nagaram"
result = anagramCheck(s, t)
if result:
    print("yes")
else:
    print("no")