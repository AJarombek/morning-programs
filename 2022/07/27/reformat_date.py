"""
https://leetcode.com/problems/reformat-date/
Author: Andrew Jarombek
Date: 7/27/2022
"""

# Sick again, really frustrated with myself.  Terrible timing and was looking forward to the wedding so much.
# Barring a miracle recovery, I will have to miss it, still have bad symptoms.  Was excited to deliver the blankie too,
# now will have to make a day trip to deliver it I suppose.


def reformat_date(date: str) -> str:
    month_map = {
        'Jan': '01',
        'Feb': '02',
        'Mar': '03',
        'Apr': '04',
        'May': '05',
        'Jun': '06',
        'Jul': '07',
        'Aug': '08',
        'Sep': '09',
        'Oct': '10',
        'Nov': '11',
        'Dec': '12'
    }

    components = date.split()
    day = components[0]
    month = month_map.get(components[1])
    year = components[2]

    if day[1] >= '0' and day[1] <= '9':
        day = day[:2]
    else:
        day = '0' + day[0]

    return f"{year}-{month}-{day}"


if __name__ == '__main__':
    assert reformat_date("27th Jul 2022") == "2022-07-27"
