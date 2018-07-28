package jarek.sampledeviceadmin

import android.app.admin.DevicePolicyManager
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun lock(view: View) {
        val mDPM = getSystemService(Context.DEVICE_POLICY_SERVICE) as DevicePolicyManager;
        mDPM.lockNow()
    }
}
