def string_methods_example():
    s = "Hello, World!"

    # 1. len()
    print("Length:", len(s))  
    # Output: Length: 13

    # 2. str.upper()
    print("Uppercase:", s.upper())  
    # Output: Uppercase: HELLO, WORLD!

    # 3. str.lower()
    print("Lowercase:", s.lower())  
    # Output: Lowercase: hello, world!

    # 4. str.capitalize()
    print("Capitalize:", s.capitalize())  
    # Output: Capitalize: Hello, world!

    # 5. str.title()
    print("Title:", s.title())  
    # Output: Title: Hello, World!

    # 6. str.strip()
    s_with_spaces = "   Hello, World!   "
    print("Stripped:", s_with_spaces.strip())  
    # Output: Stripped: Hello, World!

    # 7. str.replace()
    print("Replace 'World' with 'Universe':", s.replace("World", "Universe"))  
    # Output: Replace 'World' with 'Universe': Hello, Universe!

    # 8. str.split()
    print("Split by ',':", s.split(","))  
    # Output: Split by ',': ['Hello', ' World!']

    # 9. str.join()
    words = ["Python", "is", "fun"]
    print("Join with space:", " ".join(words))  
    # Output: Join with space: Python is fun

    # 10. str.find()
    print("Find 'World':", s.find("World"))  
    # Output: Find 'World': 7

    # 11. str.count()
    print("Count 'l':", s.count("l"))  
    # Output: Count 'l': 3

    # 12. str.startswith()
    print("Starts with 'Hello':", s.startswith("Hello"))  
    # Output: Starts with 'Hello': True

    # 13. str.endswith()
    print("Ends with '!':", s.endswith("!"))  
    # Output: Ends with '!': True

    # 14. str.isdigit()
    num_str = "12345"
    print("Is digit:", num_str.isdigit())  
    # Output: Is digit: True

    # 15. str.isalpha()
    alpha_str = "Hello"
    print("Is alpha:", alpha_str.isalpha())  
    # Output: Is alpha: True

    # 16. str.isalnum()
    alnum_str = "Hello123"
    print("Is alphanumeric:", alnum_str.isalnum())  
    # Output: Is alphanumeric: True

    # 17. str.isspace()
    space_str = "   "
    print("Is space:", space_str.isspace())  
    # Output: Is space: True

    # 18. str.islower()
    lower_str = "hello"
    print("Is lowercase:", lower_str.islower())  
    # Output: Is lowercase: True

    # 19. str.isupper()
    upper_str = "HELLO"
    print("Is uppercase:", upper_str.isupper())  
    # Output: Is uppercase: True

    # 20. str.swapcase()
    mixed_str = "Hello, World!"
    print("Swapcase:", mixed_str.swapcase())  
    # Output: Swapcase: hELLO, wORLD!

    # 21. str.zfill()
    num = "42"
    print("Zero-filled:", num.zfill(5))  
    # Output: Zero-filled: 00042

    # 22. str.ljust()
    print("Left-justified:", s.ljust(20, '*'))  
    # Output: Left-justified: Hello, World!******

    # 23. str.rjust()
    print("Right-justified:", s.rjust(20, '*'))  
    # Output: Right-justified: ******Hello, World!

    # 24. str.center()
    print("Centered:", s.center(20, '*'))  
    # Output: Centered: ***Hello, World!***

    # 25. str.partition()
    print("Partition at 'World':", s.partition("World"))  
    # Output: Partition at 'World': ('Hello, ', 'World', '!')

    # 26. str.rpartition()
    s_rpartition = "Hello, World, Hello!"
    print("Rpartition at 'Hello':", s_rpartition.rpartition("Hello"))  
    # Output: Rpartition at 'Hello': ('Hello, World, ', 'Hello', '!')

    # 27. str.splitlines()
    multiline_str = "Hello\nWorld\nPython"
    print("Splitlines:", multiline_str.splitlines())  
    # Output: Splitlines: ['Hello', 'World', 'Python']

    # 28. str.expandtabs()
    tabbed_str = "Hello\tWorld"
    print("Expand tabs:", tabbed_str.expandtabs(4))  
    # Output: Expand tabs: Hello   World

    # 29. str.format()
    print("Formatted string:", "Hello, {}!".format("World"))  
    # Output: Formatted string: Hello, World!

    # 30. str.format_map()
    data = {"name": "John", "age": 30}
    print("Formatted with map:", "Name: {name}, Age: {age}".format_map(data))  
    # Output: Formatted with map: Name: John, Age: 30

    # 31. str.casefold()
    casefold_str = "Hello"
    print("Casefold:", casefold_str.casefold())  
    # Output: Casefold: hello

    # 32. str.lstrip()
    s_lstrip = "   Hello, World!"
    print("Lstrip:", s_lstrip.lstrip())  
    # Output: Lstrip: Hello, World!

    # 33. str.rstrip()
    s_rstrip = "Hello, World!   "
    print("Rstrip:", s_rstrip.rstrip())  
    # Output: Rstrip: Hello, World!

    # 34. str.removeprefix()
    prefix_str = "HelloWorld"
    print("Remove prefix:", prefix_str.removeprefix("Hello"))  
    # Output: Remove prefix: World

    # 35. str.removesuffix()
    suffix_str = "HelloWorld"
    print("Remove suffix:", suffix_str.removesuffix("World"))  
    # Output: Remove suffix: Hello


string_methods_example()
