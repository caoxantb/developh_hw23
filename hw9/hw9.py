def roman_to_integer(str):
    int_conversion = 0
    roman_symbol = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000
    }

    for i in range(len(str) - 1):
        if  roman_symbol[str[i]] >=  roman_symbol[str[i+1]]: int_conversion += roman_symbol[str[i]]
        else: int_conversion -= roman_symbol[str[i]]

    int_conversion += roman_symbol[str[-1]]

    return int_conversion