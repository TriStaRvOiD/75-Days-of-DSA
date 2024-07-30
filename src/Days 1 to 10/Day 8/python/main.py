def is_palindrome(s):
    return s == s[::-1]

def longest_palindromes(the_string):
    the_string = the_string.lower().replace(" ", "")
    longest_pal_length = 0
    longest_palindromes_set = set()
    
    for i in range(len(the_string)):
        for j in range(i + 1, len(the_string) + 1):
            substring = the_string[i:j]
            if is_palindrome(substring):
                substring_length = len(substring)
                if substring_length > longest_pal_length:
                    longest_pal_length = substring_length
                    longest_palindromes_set = {substring}
                elif substring_length == longest_pal_length:
                    longest_palindromes_set.add(substring)
    
    return sorted(longest_palindromes_set)

the_string = "hello Racecar babb as nenonen"
result = longest_palindromes(the_string)
print("Longest palindromes:", result if result else "No palindromes found.")