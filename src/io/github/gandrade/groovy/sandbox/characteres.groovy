char c1 = 'A'
assert c1 instanceof Character

def c2 = 'B' as char
assert c2 instanceof Character

def c3 = (char)'C'
assert c3 instanceof Character

def c4 = "A"
assert c4 instanceof String
