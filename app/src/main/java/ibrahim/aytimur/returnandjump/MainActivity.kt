package ibrahim.aytimur.returnandjump

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // break
        for (i in 1..5){
            if (i == 3){
              break
            }
            Toast.makeText(applicationContext,"$i",Toast.LENGTH_SHORT).show()
        }

        // continue
        for (i in 1..5){
            if (i == 3){
                continue
            }
            Toast.makeText(applicationContext,"$i",Toast.LENGTH_SHORT).show()
        }
        // label - etiket
        aytimur@for (i in 1..5){
            for (j in 1..5){
                if (j == 3){
                    break@aytimur
                }
                Toast.makeText(applicationContext,"j$j",Toast.LENGTH_SHORT).show()
            }
            Toast.makeText(applicationContext,"i$i",Toast.LENGTH_SHORT).show()
        }
    }
}
