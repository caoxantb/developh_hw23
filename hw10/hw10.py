import math

def sum_exponential(n):
    for base in range(3, math.ceil(math.sqrt(n))):
        n_temp = n
        count = 0
        if n_temp % base == 0:
            while (n_temp > 0):
                exp = int(math.log(n_temp, base))
                n_temp -= base**exp
                count += 1
                if n_temp > base**exp: break
            if n_temp == 0: 
                return base if count == 1 else -1
    return -1