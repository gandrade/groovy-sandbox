def name = 'Groovy'
def template = """
	Dear Mr ${name},

	You're the winner of the lottery!

	Your sincerly,

	Dave
"""

print template

assert template.toString().contains('Groovy')
assert template.toString().contains("Groovy")


/**
 * String Summary Table
 * --------------------
 * String name				String syntax		Interpolated		Multiline		Escape character
 * Single quoted			'…​'														\
 * Triple single quoted	'''…​'''										X				\
 * Double quoted			"…​"					X									\
 * Triple double quoted	"""…​"""					X					X				\
 * slashy					/…​/					X					X				\
 * Dollar slashy			$/…/$				X					X				$
 * """
 */
