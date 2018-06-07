package es.smartech.smartplaces.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import es.smartech.domain.Model.Places
import es.smartech.smartplaces.R

class NotificationsFragment : Fragment() {

    companion object {
        val ARG_NOTIFICATIONS = "ARG_NOTIFICATIONS"

        fun newInstance(): NotificationsFragment {
            val fragment = NotificationsFragment()

//            val arguments = Bundle()
//            arguments.putSerializable(ARG_NOTIFICATIONS, places)
//            fragment.arguments = arguments

            return fragment
        }
    }

    // private lateinit var placesList : Places
    private lateinit var fragmentView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // placesList = arguments?.getSerializable(ARG_NOTIFICATIONS) as Places
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment

        val fragmentView = inflater.inflate(R.layout.fragment_notifications, container, false)

        // Configuro Fragment con mapa de sitios


        // Configuro Fragment con lista de sitios

        return fragmentView
    }

}