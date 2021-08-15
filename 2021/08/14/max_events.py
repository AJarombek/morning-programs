"""
Author: Andrew Jarombek
Date: 8/14/2021
"""


def max_events(arrival, duration):
    if len(arrival) == 0:
        return 0

    companies = list(zip(arrival, duration))
    companies.sort(key=lambda a: a[0])

    max_events = 1
    time, current_company_duration = companies[0]

    index = 1

    while index < len(companies):
        new_time = companies[index][0]

        current_company_duration -= new_time - time
        time = new_time

        arrived_company_duration = companies[index][1]

        if current_company_duration <= 0:
            max_events += 1

        index += 1

        while index < len(companies) and time == companies[index][0]:
            if companies[index][1] < arrived_company_duration:
                arrived_company_duration = companies[index][1]

            index += 1

        if arrived_company_duration < current_company_duration or current_company_duration <= 0:
            current_company_duration = arrived_company_duration

    return max_events


if __name__ == '__main__':
    print(max_events(
        [978, 409, 229, 934, 299, 982, 636, 14, 866, 815, 64, 537, 426, 670, 116, 95, 630],
        [502, 518, 196, 106, 405, 452, 299, 189, 124, 506, 883, 753, 567, 717, 338, 439, 145]
    ))
