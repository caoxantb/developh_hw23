function isMultipleBasePalindrome(num) {
    let biNum = intToBi(num);
    return isPalindrome(num) && isPalindrome(biNum);
}

function isPalindrome(num) {
    let tempNum = num;
    let reversedNum = 0;

    while (tempNum !== 0) {
        let lastDigit = tempNum % 10;
        reversedNum = reversedNum * 10 + lastDigit;
        tempNum = Math.floor(tempNum/10);
    } 

    return reversedNum === num ;
}

function intToBi(num) {
    let count = 0;
    let biNum = 0;
    
    while (num !== 0) {
        let re = num % 2; 
        if (re === 1) biNum += 10**count;
        count += 1;
        num = Math.floor(num/2);
    }

    return biNum;
}
