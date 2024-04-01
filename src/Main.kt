fun main() {
    val eclairage = Luminaire();
    /**
     * Cycles d'éclairage et d'extinction d'une ampoule
     */
    var nbCycles = 0;
    println("Etat du luminaire :")
    do{
        eclairage.allumer();
        while(eclairage.etat() > 0 ){
            eclairage.diminuer();
        }
        println(eclairage.toString());
        nbCycles ++;
    }while (nbCycles < 1000 && eclairage.etat() != -1);
    println("nombre de cycles "+nbCycles);
}