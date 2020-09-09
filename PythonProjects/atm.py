print("""\n\n************************

Bankomata xoşgəldiniz.

Seçimlər:

1. Balansın yoxlanılması
2. Balans artırma
3. Pul çəkmək

Çıxmaq üçün 'q' daxil edin.
************************
""")
amountofMoney = 1000

while True:
    process = input("Seçim edin: ")
    if process == 'q':
        print("Əməliyyat sonlandırıldı.")
        break
    elif process == '1':
        print(f"Balansınızda {amountofMoney} AZN vəsait var.")
    elif process == '2':
        addCash = int(input("Artırılacaq məbləği qeyd edin: "))
        amountofMoney += addCash
        print(f"Balansınız {addCash} AZN artırıldı.\n")
    elif process == '3':
        subtractCash = int(input("Çıxılacaq məbləği qeyd edin: "))
        if subtractCash > amountofMoney:
            print("Balansda yetəri qədər məbləğ yoxdu.\n")
            continue
        amountofMoney-=subtractCash
        print(f"Balansınızdan {subtractCash} AZN çıxıldı.\n")
    else:
        print("Doğru olmayan seçim!")
