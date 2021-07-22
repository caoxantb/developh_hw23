def type_of_triangle(a, b, c):
    if abs(b-c) >= a or a >= b+c: 
        return "Không tồn tại tam giác"
    if a == b and b == c: 
        return "Tam giác đều"
    elif (a-b)*(b-c)*(c-a) == 0: 
        return "Tam giác cân"
    return "Tam giác thường"

