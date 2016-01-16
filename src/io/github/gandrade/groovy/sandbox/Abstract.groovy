package io.github.gandrade.groovy.sandbox

abstract class Abstract {
	
	String name
	
	abstract def abstractMethod()

	def concreteMethod() {
		println 'concrete'
	}
}
