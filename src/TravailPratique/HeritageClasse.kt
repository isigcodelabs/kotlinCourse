package TravailPratique
open class Personne() {
    var nom1:String?=null
    var nom2:String?=null
    constructor(name1:String,name2:String):this(){
        this.nom1=name1
        this.nom2=name2
    }
    init{


    }
    open fun AfficherPerson(){

        println("je suis une personne")
        println("---Nom     : $nom1 ")
        println("---PostnNom: $nom2")
    }
}
class Pere(nbreEnfant:Int):Personne(){
    var nbreEn=nbreEnfant
    init {
        println("Je suis un pere")
    }
    override fun AfficherPerson(){
        super<Personne>.nom1="Blaise"
        super<Personne>.nom2="Ciza"
        super<Personne>.AfficherPerson()
        AfficherPere()
    }
    fun AfficherPere(){
        println("J'ai $nbreEn enfants")
    }
}
class Agent(salaireBase:Double,grade:String,affectation:String):Personne("Innoc","Ciza"){
    var monSalBase:Double=salaireBase
    var  monGrade:String=grade
    var monAffect:String=affectation
    init {
        AfficherPerson()
        println("Je suis un agent")
    }
    fun AfficherAgent(){
        println("Salaire de Base : $monSalBase")
        println("Grade           : $monGrade")
        println("Affectation     : $monAffect")
    }
}
fun main(args:Array<String>){
val Personne=Personne("Frank","Shubert")
    Personne.AfficherPerson()
   val pere=Pere(12)
    pere.AfficherPerson()
    val agent=Agent(120.5,"Ass","ISIG")
    agent.AfficherAgent()
}