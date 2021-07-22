function sumExponential(n) {
    for (let base = 3; base < Math.ceil(Math.sqrt(n)); base++) {
        let nTemp = n;
        if (nTemp % base === 0) {
            while (nTemp > 0) {
                let exp = Math.floor(Math.log(nTemp)/Math.log(base));
                nTemp -= base**exp;
                if (nTemp > base**exp) break;
            }
            if (nTemp === 0) return base;
        }
    }
    return -1;
}
