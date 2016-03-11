class Email {
        
    def static send(Closure closure) {
        Email email = new Email()
        // The delegate of a closure is an object that is used to resolve references that cannot be resolved within the body of the closure itself
        closure.delegate = email
        
        // Then the code inside the closure will only be executed when you call the closure, which can be done by using the variable as if it was a regular method:
        closure()
       
        email.send()
    }
    
    def from(String s) {
       println s
    }
    
    def to (String s) {
       println s
    }
    
    def send() {
        println 'send'
    }
}

Email.send { from 'teste' 
             to 'teste2'
           }