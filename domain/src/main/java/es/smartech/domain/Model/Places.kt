package es.smartech.domain.Model

data class Place(val id: String,
                 val name: String,
                 val decription: String = "",
                 val address: String = "",
                 val postal: String = "",
                 val latitude: Float = 0f,
                 val longitude: Float = 0f,
                 val email: String = "",
                 val ranking: Int = 0,
                 val image: String = "",
                 val capacity: Int = 0,
                 val openHoures:, String = "",
                 val tournamentsUpcoming: List<Tournament>? = null,
                 val tournamentsWon: List<Tournament>? = null,
                 val gamesPlayed: Games? = null,
                 val gamesPlaying: Games?= null,
                 val gamesUpcoming: Games? = null,
                 val gamesWon: Games? = null) {

}