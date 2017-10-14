package jayway.com.lab.alphabetconfpanion

/**
 * Created by ubh on 14/10/2017.
 */
class AttendeeInfoActivity: BaseActivity() {
   override val _viewModel = AttendeeInfoViewModel()
}

class AttendeeInfoViewModel: BaseViewModel() {
   override val layoutRes = R.layout.view_attendee_info

}
