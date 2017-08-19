package tw.ming.app.helloworid.myservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

public class MyService extends Service {
    private Timer timer;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        timer = new Timer();
        timer.schedule(new MyTask());
    }

    private class MyTask extends TimerTask{
        @Override
        public void run() {
            Log.i("ming","doSomething");
        }
    }
}
