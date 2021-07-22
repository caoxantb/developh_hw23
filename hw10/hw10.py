import math

def sum_exponential(n):
    for base in range(3, math.ceil(math.sqrt(n))):
        n_temp = n
        if n_temp % base == 0:
            while (n_temp > 0):
                exp = int(math.log(n_temp, base))
                n_temp -= base**exp
                if n_temp > base**exp: break
            if n_temp == 0: return base
    return -1