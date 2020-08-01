def exercise1(some_string):
    if any(c.isalnum() for c in some_string):
        print(True)
    else:
        print(False)

    if any(c.isalpha() for c in some_string):
        print(True)
    else:
        print(False)

    if any(c.isdigit() for c in some_string):
        print(True)
    else:
        print(False)

    if any(c.islower() for c in some_string):
        print(True)
    else:
        print(False)

    if any(c.isupper() for c in some_string):
        print(True)
    else:
        print(False)


if __name__ == '__main__':
    s = input()
    exercise1(s)