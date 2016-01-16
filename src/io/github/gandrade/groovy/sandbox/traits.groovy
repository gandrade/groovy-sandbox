package io.github.gandrade.groovy.sandbox

trait SpeakingDuck {
	String speak() {
		quack()
	}
}

class Duck implements SpeakingDuck {
	String methodMissing2(String name, args) {
		"${name.capitalize()}!"
	}
}

def d = new Duck();
println d.speak();
