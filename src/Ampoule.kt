open class Ampoule : Eclairage {

    var nom :String =""
    var etat : Int = 0
    var pourcentagePanne : Int = 0

    constructor()
    constructor(nom :String, etat : Int , pourcentagePanne : Int ){
        this.nom = nom
        this.etat = etat
        this.pourcentagePanne = pourcentagePanne
    }
    
    private fun probaPanne(): Int {
        val alea = (0..100).random() // generated random from 0 to 100 included
        return if (alea < pourcentagePanne) {
            -1
        } else 0
    }

    override fun allumer() {
        if (this.etat != -1 && this.probaPanne() != -1) {
            this.etat = 10;
        } else {
            this.etat = -1;
        }
    }
    override fun eteindre() {
        if (this.etat != -1) {
            this.etat = 0;
        }
    }

    override fun intensifier() {
        if ( this.etat < 10) {
            this.etat++;
        }
    }
    override fun diminuer() {
        if ( this.etat > 0) {
            this.etat--;
        }
    }
    override fun etat(): Int = this.etat

    override fun toString(): String {
        return this.javaClass.name + " : " + this.etat
    }
}
