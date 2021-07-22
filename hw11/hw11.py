import random

def calculate_pi(n):
    point_inside_circ = 0
    point_inside_sqr = 0

    for _ in range(n):
        x = random.uniform(0, 1)
        y = random.uniform(0, 1)
        dist_to_o = x**2 + y**2
        if dist_to_o <= 1:  
            point_inside_circ += 1
        point_inside_sqr += 1

    return 4 * point_inside_circ/point_inside_sqr