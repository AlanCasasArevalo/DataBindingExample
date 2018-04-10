package alancasasarevalo.com.databindingexample.activity

import alancasasarevalo.com.databindingexample.fragment.DummyFragment
import alancasasarevalo.com.databindingexample.fragment.DummyListFragment
import alancasasarevalo.com.databindingexample.R
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if (supportFragmentManager.findFragmentById(R.id.activity_up_base_fragment) == null || supportFragmentManager.findFragmentById(R.id.activity_down_list_fragment) == null){

            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.activity_up_base_fragment, DummyFragment.newInstance())
                    .add(R.id.activity_down_list_fragment, DummyListFragment.newInstance())
                    .commit()
        }

    }
}
