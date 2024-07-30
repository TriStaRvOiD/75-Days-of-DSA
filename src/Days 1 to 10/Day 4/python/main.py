def generate_pascals_triangle(rows):
    triangle = []

    for row_num in range(rows):
        row = [1] * (row_num + 1)
        for j in range(1, row_num):
            row[j] = triangle[row_num - 1][j - 1] + triangle[row_num - 1][j]
        triangle.append(row)

    return triangle

def print_pascals_triangle(triangle):
    for row in triangle:
        print(' '.join(map(str, row)).center(2 * len(triangle) - 1))

rows = int(input("Enter number of rows: "))
triangle = generate_pascals_triangle(rows)
print_pascals_triangle(triangle)