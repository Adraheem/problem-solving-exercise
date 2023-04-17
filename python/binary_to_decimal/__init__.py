def convert_to_decimal(binary_number: str):
    decimal = 0
    length = len(binary_number)
    for i in range(length - 1, -1, -1):
        decimal = decimal + (int(binary_number[i]) * (2 ** (length - i - 1)))
    return decimal


if __name__ == '__main__':
    binary = input("Enter binary number: ")
    print(convert_to_decimal(binary))
