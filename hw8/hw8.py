def is_multiple_base_palindrome(num):
    bi_num = int_to_bi(num)
    return is_palindrome(num) and is_palindrome(bi_num)

def is_palindrome(num):
    temp_num = num
    reversed_num = 0

    while (temp_num != 0): 
        last_digit = temp_num % 10
        reversed_num = reversed_num * 10 + last_digit
        temp_num //= 10
    
    return reversed_num == num 

def int_to_bi(num):
    count = 0
    bi_num = 0

    while (num != 0):
        re = num % 2 
        if re == 1: bi_num += 10**count
        count += 1
        num //= 2
    
    return bi_num

