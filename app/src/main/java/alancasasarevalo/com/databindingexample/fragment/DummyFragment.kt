package alancasasarevalo.com.databindingexample.fragment


import alancasasarevalo.com.commons.fragments.GenericFragment
import alancasasarevalo.com.databindingexample.R

class DummyFragment : GenericFragment() {

    companion object {

        fun newInstance () : DummyFragment {
            var fragment = DummyFragment()
            return fragment
        }
    }

    override fun getLayoutResId(): Int {
        return R.layout.fragment_dummy
    }

}
