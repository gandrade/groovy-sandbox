def name = 'Andrade'
def greeting = "Hello ${name}"

println 'greeting -> ' + greeting
println 'greeting.toString() -> ' + greeting.toString()

assert greeting.toString() == 'Hello Andrade'
assert greeting.toString() == "Hello ${name}"


def sum = "the sum of 2 and 3 equals ${ 2 + 3}"

println 'sum -> ' + sum
println 'sum.toString() -> ' + sum.toString()
assert sum.toString() == 'the sum of 2 and 3 equals 5'


def sumWithSingleQuotes = 'the sum of 2 and 3 equals ${2+3}'
println 'sumWithSingleQuotes -> ' + sumWithSingleQuotes
println sumWithSingleQuotes
println 'sumWithSingleQuotes.toString ->'  + sumWithSingleQuotes.toString()
println sumWithSingleQuotes.toString()