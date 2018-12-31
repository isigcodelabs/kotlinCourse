package PasFaitEnClasse

//declaration de la classe
class Operations(){
    fun sum(n1:Int, n2:Int):Int{
        return n1+n2
    }

    fun div(n1:Int, n2:Int):Int{
        return n1/n2
    }
}

open class OperationsHerit(){

    public var MyName:String?=null
    protected var MyName2:String?=null

    fun sum(n1:Int, n2:Int):Int{
        return n1+n2
    }

    fun div(n1:Int, n2:Int):Int{
        return n1/n2
    }
}

//Heritage
class MultipleOperations(){
    fun sum(n1:Int, n2:Int):Int{
        return n1+n2
    }

    fun div(n1:Int, n2:Int):Int{
        return n1/n2
    }

    fun multi(n1:Int, n2:Int):Int{
        return n1*n2
    }

    fun sub(n1:Int, n2:Int):Int{
        return n1-n2
    }
}

class MultipleOperationsHeritage():OperationsHerit(){

    fun multi(n1:Int, n2:Int):Int{
        return n1*n2
    }

    fun sub(n1:Int, n2:Int):Int{
        return n1-n2
    }

    fun getName(){
        super.MyName
        super.MyName2
    }
}


fun main (args:Array<String>){

    var op=Operations()
    var sum=op.sum(10,15)
    println("sum : " + sum)
    var div=op.div(12,11)
    println("div : "+ div)

    //Second
    var op2=MultipleOperations()
    var sub=op2.sub(10,15)
    println("sub : " + sub)
    var mul=op2.multi(12,11)
    println("multiplication : "+ mul)

    //Using with inheritance
    var op3=MultipleOperationsHeritage()
    sum=op3.sum(10,15)
    println("sum : " + sum)
    div=op3.div(12,11)
    println("div : "+ div)



}