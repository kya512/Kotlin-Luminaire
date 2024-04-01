class AmpouleTube: Ampoule() {

    private fun probaPanne(): Int {
        val alea = (0..100).random() // generated random from 0 to 100 included
        return if (alea < 5) {
            -1
        } else 0
    }
    /**
     * Augmente l'intensité lumineuse de l'ampoule, on vérifie que
     * l'ampoule n'est pas en panné et que son intensité est < à 10
     */
    override fun intensifier() {
        println("Ne peux pas s'intensifier")
    }

    /**
     * Diminuer l'intensité lumineuse de l'ampoule
     */
    override fun diminuer() {
        println("Ne peux pas diminuer")
    }
}