function typeOfTriangle(a, b, c) {
    if (Math.abs(b-c) >= a || a >= b+c) 
        return "Không tồn tại tam giác";
    if (a === b && b === c) 
        return "Tam giác đều";
    else if ((a-b)*(b-c)*(c-a) === 0) 
        return "Tam giác cân";
    return "Tam giác thường";
}

