function romanToInteger(str) {
    let intConversion = 0;
    let romanSymbol = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000
    };

    for (let i = 0; i < str.length - 1; i++) {
        if (romanSymbol[str[i]] >= romanSymbol[str[i+1]]) intConversion += romanSymbol[str[i]];
        else intConversion -= romanSymbol[str[i]];
    }

    intConversion += romanSymbol[str[str.length - 1]];

    return intConversion
}



