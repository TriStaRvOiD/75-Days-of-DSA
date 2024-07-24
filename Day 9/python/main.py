def longest_common_prefix(strs):
    if not strs:
        return ""

    shortest_str = min(strs, key=len)

    for i, char in enumerate(shortest_str):
        for other in strs:
            if other[i] != char:
                return shortest_str[:i]

    return shortest_str

strings = ["flower", "flow", "flight"]
print(longest_common_prefix(strings))

strings = ["rad", "racecar", "car"]
print(longest_common_prefix(strings))