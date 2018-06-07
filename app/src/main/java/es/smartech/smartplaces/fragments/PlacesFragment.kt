package es.smartech.smartplaces.fragments

import android.os.Bundle
import android.support.v4.app.Fragment

class PlacesFragment : Fragment() {

    companion object {
        val ARG_PLACES = "ARG_PLACES"

        fun newInstance(places: Places): PlacesFragment {
            val fragment = PlacesFragment()
            val arguments = Bundle()

            arguments.putSerializable(ARG_PLACES, places)
            fragment.arguments = arguments

            return fragment
        }

    }
}