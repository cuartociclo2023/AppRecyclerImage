package pe.edu.idat.apprecyclerimage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import pe.edu.idat.apprecyclerimage.databinding.ActivityMainBinding
import pe.edu.idat.apprecyclerimage.databinding.ItemAndroidBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvandroid.layoutManager = LinearLayoutManager(applicationContext)
            //LinearLayoutManager(applicationContext, LinearLayoutManager.HORIZONTAL, false)
            //GridLayoutManager(applicationContext, 2, GridLayoutManager.HORIZONTAL, false)
        val adapter = AndroidAdapter(listaAndroid(), applicationContext)
        binding.rvandroid.adapter = adapter
    }
    fun listaAndroid(): List<Android>{
        var lista = ArrayList<Android>()
        lista.add(Android("Apple Pie", "1.0", R.drawable.image1))
        lista.add(Android("Petit Four", "1.1", R.drawable.image2))
        lista.add(Android("Cupcake", "1.5", R.drawable.image3))
        lista.add(Android("Donut", "1.6", R.drawable.image4))
        lista.add(Android("Eclair", "2.0 - 2.1", R.drawable.image5))
        lista.add(Android("Froyo", "2.2 - 2.2.3", R.drawable.image6))
        lista.add(Android("Gingerbread", "2.3", R.drawable.image7))
        lista.add(Android("Honeycomb", "3.0", R.drawable.image8))
        lista.add(Android("Jelly Bean", "4.1", R.drawable.image9))
        lista.add(Android("Marshmallow", "6.0", R.drawable.image10))
        return lista
    }
}