import random

randomNumber = random.randint(1, 100)
guessCounter = 0

while True:
    guessCounter += 1
    guess = int(input("Təxmin etdiyin ədədi daxil edin (0 çıxış): "))
    if guess == 0:
        print("Oyundan çıxdın")
        break
    elif guess > randomNumber:
        print("Aşağı ədəd denən.\n")
        continue
    elif guess < randomNumber:
        print("Yuxarı ədəd denən.\n")
        continue
    else:
        print(f"Təbriklər! təxmin olunan ədəd: {randomNumber}")
        print(f"{guessCounter} Təxmində tapdınız")
        break

