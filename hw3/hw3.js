function countDigits(num) {
    let count = 0;

    do {
        count++;
        num = Math.floor(num/10);
        console.log(num)
    } while(num !== 0);

    return count;
}

