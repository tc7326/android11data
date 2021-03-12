package info.itloser.utils.android11data

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //打开 文件 App
        btn_open.setOnClickListener {

            //打开某个app 参考 https://blog.csdn.net/mlj1668956679/article/details/51983238/
            val packageName = "com.google.android.documentsui";
            val activityName = "com.android.documentsui.files.FilesActivity";

            val intent = Intent()
            intent.setClassName(packageName, activityName)
            startActivity(intent)

        }


    }

    /**
     * 创建菜单
     */
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    /**
     * 菜单按钮
     */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.reward) {
            showRewardDialog()
        }

        return super.onOptionsItemSelected(item)
    }

    private fun showRewardDialog() {
        val builder = AlertDialog.Builder(this)
        builder.setView(R.layout.dialog_reward)
        builder.create().show()


    }
}