def sum = { x,y ->
       x+y
}

def minus = {x,y, z = 0-> 
    x - y + z
}

class XYZ {
    def abc (Closure addOrder){
        addOrder(1,2)
    }
}
println sum.dump()
def x = new XYZ()

def whatToDo = minus

//println minus.dump()
println x.abc(whatToDo)