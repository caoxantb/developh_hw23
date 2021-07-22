def divisibility(a, b):
    if b == 0: return "N/A"
    return b - a % b if a % b != 0 else 0
