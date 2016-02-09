package y2k.mssngr;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = new Intent(Intent.ACTION_VIEW,
				Uri.parse("facebook:/chat"));
		try {
			startActivity(intent);
		} catch (ActivityNotFoundException e) {
			Toast toast = Toast.makeText(this, R.string.error, Toast.LENGTH_SHORT);
			toast.show();
		}
		finish();
	}
}