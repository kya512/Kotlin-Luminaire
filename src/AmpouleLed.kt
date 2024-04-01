class AmpouleLed : Ampoule(){

    private fun probaPanne(): Int {
        val alea = (0..100).random() // generated random from 0 to 100 included
        return if (alea < 1) {
            -1
        } else 0
    }

}