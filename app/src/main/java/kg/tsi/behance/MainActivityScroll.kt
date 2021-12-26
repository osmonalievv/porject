package kg.tsi.behance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kg.tsi.behance.fragment.NotificationsFragment
import kg.tsi.behance.fragment.TvFragment
import kg.tsi.behance.fragment.categoryFragment
import kg.tsi.behance.fragment.profileFragment

    private val dashboardFragment = profileFragment()
    private val settingsFragment = TvFragment()
    private val notification = NotificationsFragment()
    private val category = categoryFragment()

class MainActivityScroll : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_scroll)
        replaceFragment(settingsFragment)

        val bottom = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottom.setOnNavigationItemReselectedListener {
            when (it.itemId){
                R.id.prof->replaceFragment(dashboardFragment)
                R.id.tralation->replaceFragment(settingsFragment)
                R.id.notifications->replaceFragment(notification)
                R.id.search ->  replaceFragment(category)




        }
            true
        }



            }
private fun replaceFragment(fragment: Fragment){
    if (fragment !=null){
        val transaction= supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment, fragment)
        transaction.commit()


    }


        }

    }


