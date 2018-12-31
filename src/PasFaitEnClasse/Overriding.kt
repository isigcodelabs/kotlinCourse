package PasFaitEnClasse

//declaration de la classe
open class OperationsHerit1(){

    public var MyName:String?=null
    protected var MyName2:String?=null

    open fun sum(n1:Int, n2:Int):Int{
        return n1+n2
    }

    fun div(n1:Int, n2:Int):Int{
        return n1/n2
    }
}

//Heritage
class MultipleOperationsHeritage1():OperationsHerit1(){

    /*
    on va essayer de redefinir la methode sum

    pour cela on devra definir cette methode sum de la super class en tant que OPEN car des methodes juste avec fun sont final
    et ne peuvent etre redefini.

    puis on va utiliser le mot override devant la fonction dans la classe fille
     */

    var t:Int?= null


    override fun sum(n1:Int, n2:Int):Int{
        //utilisation de la variable locale
        this.t=23
        return (n1+n2)*23
    }

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

    //Using with inheritance
    var op3=MultipleOperationsHeritage()
    //pour la classe redefinit ca nous donnera une reponse differente
    sum=op3.sum(10,15)
    println("sum : " + sum)
    div=op3.div(12,11)
    println("div : "+ div)





}