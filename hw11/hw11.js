function calculatePi(n) {
    let pointInsideCirc = 0;
    let pointInsideSqr = 0;

    for (let _ = 0; _ < n; _++) {
        let x = Math.random();
        let y = Math.random();
        let distToO = Math.pow(x, 2) + Math.pow(y, 2);
        if (distToO <= 1)
            pointInsideCirc++;
        pointInsideSqr++;

    }

    return 4*pointInsideCirc/pointInsideSqr;
}