package jarek.sampledeviceadmin

import android.app.admin.DeviceAdminReceiver
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class SampleAdminReceiver : DeviceAdminReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        println("broadcast receiving $context and $intent")
    }

    override fun onEnabled(context: Context?, intent: Intent?) {
        println("broadcast enabling $context and $intent")
        super.onEnabled(context, intent)
    }
}
