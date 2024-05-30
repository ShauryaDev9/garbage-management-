// MainActivity.kt
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.ArrayAdapter
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private lateinit var dustbinList: ArrayList<Dustbin>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)
        dustbinList = ArrayList()

        // Add some sample dustbins
        dustbinList.add(Dustbin("Dustbin 1", "Location 1", 50))
        dustbinList.add(Dustbin("Dustbin 2", "Location 2", 75))
        dustbinList.add(Dustbin("Dustbin 3", "Location 3", 25))

        val adapter = ArrayAdapter<Dustbin>(this, android.R.layout.simple_list_item_1, dustbinList)
        listView.adapter = adapter
    }
}

// Dustbin.kt
data class Dustbin(val name: String, val location: String, val fillLevel: Int)