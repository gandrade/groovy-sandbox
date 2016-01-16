def colors = [red: '#FF0000', green: '#00FF00', blue: '#0000FF'] 

assert colors['red'] == '#FF0000' 
assert colors.green  == '#00FF00'
colors['pink'] = '#FF00FF'
colors.yellow  = '#FFFF00'

assert colors.pink == '#FF00FF'
assert colors['yellow'] == '#FFFF00'

assert colors instanceof java.util.LinkedHashMap