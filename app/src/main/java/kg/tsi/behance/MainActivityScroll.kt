package kg.tsi.behance

import android.graphics.drawable.Icon
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivityScroll : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_scroll)

        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    .currentItem = 0
                    return@OnNavigationItemSelectedListener true
                }
                R.id.prof -> {
                    main_view_pager.currentItem = 1
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    }
}

