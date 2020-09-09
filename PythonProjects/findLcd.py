import math
# verilen ededlerin EKOB -nu tapan proqram
def gcd(elements: list) -> int:
    result = 0
    for element in elements:
        result = math.gcd(result, element)
        if result == 1:
            return 1
    return result

def lcd(a: int, b: int) -> int:
    return  int((a * b)/math.gcd(a, b))

def LCD(elements: list) -> int:
    result = elements[0]
    for index in range(1,len(elements)):
        result = lcd(result, elements[index])
    return result

my_list = [11,19,7]
print(LCD(my_list))
