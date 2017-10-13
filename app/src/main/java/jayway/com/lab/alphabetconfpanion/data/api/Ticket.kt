package jayway.com.lab.alphabetconfpanion.data.api

/**
 * Created by ubh on 13/10/2017.
 */
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Ticket {

   @SerializedName("description")
   @Expose
   var description: String? = null
   @SerializedName("id")
   @Expose
   var id: String? = null
   @SerializedName("price")
   @Expose
   var price: String? = null
   @SerializedName("title")
   @Expose
   var title: String? = null

}