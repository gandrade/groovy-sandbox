def numbers = [1,2,3]

assert numbers.size() == 3
assert numbers instanceof List


def heterogeneous = [1, "a", true]

def arrayList = [1,2,3]
assert arrayList instanceof java.util.ArrayList 

def linkedList = [1,2,3] as LinkedList
assert linkedList instanceof java.util.LinkedList

LinkedList otherLinkedList = [1,2,3]
assert otherLinkedList instanceof java.util.LinkedList


def letters = ['a', 'b', 'c', 'd']
assert letters[0] == 'a'
assert letters[1] == 'b'

assert letters[-1] == 'd'
assert letters[-2] == 'c'

letters << 'e'
letters[2] = 'C'

assert letters[4] == 'e'
assert letters[-1]== 'e'

assert letters[1,3] == ['b', 'd']
assert letters[2..4] == ['C', 'd', 'e']