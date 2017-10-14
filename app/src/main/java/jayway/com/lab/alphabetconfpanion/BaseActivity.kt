package jayway.com.lab.alphabetconfpanion

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater

/**
 * Created by ubh on 13/10/2017.
 */
abstract class BaseActivity : AppCompatActivity() {

   abstract val _viewModel: BaseViewModel

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)

      setContentView(_viewModel.inflateView(LayoutInflater.from(this)))
   }

   override fun onStart() {
      super.onStart()

      _viewModel.onStart()
   }

   override fun onStop() {
      super.onStop()

      _viewModel.onStop()
   }
}