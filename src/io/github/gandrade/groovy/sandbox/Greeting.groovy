package io.github.gandrade.groovy.sandbox

class SystemGreeter implements Greeter {
	void greet(String name) {
		print "Hello $name"
	}
}

def greeter = new SystemGreeter()
greeter.greet("andrade")
