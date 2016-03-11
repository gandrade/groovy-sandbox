class ApiLoader {
    OrderResourceBuilder builder = new OrderResourceBuilder()
    
    def run() {
        def result = builder.build(new OrderRouter().&routeOrder)    
    }
}

class OrderResourceBuilder {
    def value = 20
    
    def build(Closure add) {
        println '----------'
        println '   DUMP   '
        println '----------'
        println add.dump()
        println '----------'
        Random rand = new Random()
        def value = rand.nextInt(11)
        
        if (value <= 5) {
            value = "Andrade"
        }        
        
        add(value)
    }
}

class OrderRouter {

    def value = 0
    OrderRouter() {
    }
    
    OrderRouter(value) {
        this.value = value
    }
    
    def routeOrder(Integer param1) {
        param1 + value
    }
    
    def routeOrder(String param2) {
        "hello world ${param2}"
    }
}

ApiLoader loader = new ApiLoader()
println loader.run()