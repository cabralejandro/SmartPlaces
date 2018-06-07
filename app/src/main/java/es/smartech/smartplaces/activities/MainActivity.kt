package es.smartech.smartplaces.activities

import android.content.Context
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.AttributeSet
import android.view.View
import es.smartech.domain.Model.Place
import es.smartech.domain.Model.Places
import es.smartech.smartplaces.R
import es.smartech.smartplaces.fragments.GameFragment
import es.smartech.smartplaces.fragments.NotificationsFragment
import es.smartech.smartplaces.fragments.PlacesFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val placesList = Places(placesList = ArrayList<Place>())
    val placesFragment = PlacesFragment.newInstance(placesList)
    val gameFragment = GameFragment.newInstance()
    val notificationsFragment = NotificationsFragment.newInstance()

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_places -> {
                openFragment(placesFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_game -> {
                openFragment(gameFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                openFragment(notificationsFragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        openFragment(placesFragment)
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}
