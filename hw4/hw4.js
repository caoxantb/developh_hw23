function divisibility(a, b) {
    if (b === 0) return null;
    return (a % b !== 0) ? b - a % b : 0;
}
    

