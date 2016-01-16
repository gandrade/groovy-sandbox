def map = [:]
map."an identifier with space and double quotes" = "ALLOWED"
map.'with-dash-signs-and-single-quotes' = "ALLOWED"

assert map."an identifier with space and double quotes" == "ALLOWED"
assert map.'with-dash-signs-and-single-quotes' == "ALLOWED"

map.'single quote'
map."double quote"
map.'''triple quote'''
map."""triple double quote"""
map./slashy string/
map.$/dollar slash string/$

