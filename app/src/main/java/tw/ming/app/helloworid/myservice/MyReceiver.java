package tw.ming.app.helloworid.myservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("ming","onReceive");
        Intent it = new Intent(context,MyService.class);
        context.startService(it);
    }
}
