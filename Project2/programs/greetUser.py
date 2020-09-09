def greet(name: str,surname: str) -> str:
    return f"Hello {name} {surname}"

nameAndSurname = input("Enter your name and surname: ").split(' ')
print(greet(nameAndSurname[0],nameAndSurname[1]))