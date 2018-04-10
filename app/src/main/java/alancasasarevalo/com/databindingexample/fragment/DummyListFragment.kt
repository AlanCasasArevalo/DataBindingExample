package alancasasarevalo.com.databindingexample.fragment


import alancasasarevalo.com.commons.databinding.DataBindingRecyclerAdapter
import alancasasarevalo.com.commons.fragments.BaseListFragment
import alancasasarevalo.com.databindingexample.BR
import alancasasarevalo.com.databindingexample.model.DummyModel
import alancasasarevalo.com.databindingexample.R
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.View


/**
 * A simple [Fragment] subclass.
 */
class DummyListFragment : BaseListFragment() {

    companion object {

        fun newInstance () : DummyListFragment {
            var fragment = DummyListFragment()
            return fragment
        }
    }

    override fun getAdapter(): RecyclerView.Adapter<*> {
        val adapter = DataBindingRecyclerAdapter<DummyModel>(BR.person, R.layout.item_to_show)
        return adapter
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (listAdapter as DataBindingRecyclerAdapter<DummyModel>).items.addAll(getDummyShops())
        listAdapter.notifyDataSetChanged()

    }

    fun getDummyShops(): ArrayList<DummyModel> {

        var dummyArrayActivityToDo = ArrayList<DummyModel>()

        (0..9).forEach { i ->
            val dummyActivityToDo = DummyModel(
                    "Nombre $i",
                    "Apellido $i",
                    i
            )

            dummyArrayActivityToDo.add(dummyActivityToDo)
        }

        return dummyArrayActivityToDo

    }

}// Required empty public constructor
