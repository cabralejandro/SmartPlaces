package es.smartech.domain.Model

import java.io.Serializable

data class Place (val id: Int = 0,
                 val name: String = "",
                 val description: String = "",
                 val latitide: Float = 0f,
                 val longitude: Float = 0f,
                 val imgage: String = "",
                 val opening_hours: String = "",
                 val address: String = "") : Mapeable {

    override fun get_Name(): String {
        return name
    }

    override fun get_Address(): String {
        return address
    }

    override fun get_Houres(): String {
        return opening_hours
    }

    override fun get_Description(): String {
        return description
    }

    override fun get_Latitude(): Float {
        return latitide
    }

    override fun get_Longitude(): Float {
        return longitude
    }

    override fun get_Image(): String {
        return imgage
    }


}

class Places (val placesList: ArrayList<Place>): Aggregate<Place> {

    override fun count(): Int {
        return placesList.count()
    }

    override fun all(): List<Place> {
        return placesList
    }

    override fun get(position: Int): Place {
        return placesList[position]
    }

    override fun add(element: Place) {
        placesList.add(element)
    }
}

