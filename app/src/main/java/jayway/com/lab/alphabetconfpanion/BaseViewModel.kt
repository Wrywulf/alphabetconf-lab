package jayway.com.lab.alphabetconfpanion

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Observer
import android.databinding.DataBindingUtil
import android.databinding.ObservableField
import android.databinding.ViewDataBinding
import android.view.LayoutInflater
import android.view.View
import me.tatarka.bindingcollectionadapter2.collections.DiffObservableList

/**
 * Created by ubh on 13/10/2017.
 */
abstract class BaseViewModel() {

   abstract val layoutRes: Int
   lateinit var view: View

   fun inflateView(inflater: LayoutInflater): View {
      val binding = DataBindingUtil.inflate<ViewDataBinding>(inflater, layoutRes, null, false)
      binding.setVariable(BR.viewModel, this)
      view = binding.root
      return view
   }

   fun onStart() {}
   fun onStop() {}
}