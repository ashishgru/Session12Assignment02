package ashishrpa.session12assignmet02;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by WINDOWS 8.1 on 11/1/2016.
 */

public class SimpleAdditionFragment extends Fragment {
    TextView textView;
    View rootView;
    MainActivity activity = (MainActivity) getActivity();
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            /** Inflating the layout for this fragment **/
            rootView = inflater.inflate(R.layout.simple_addition_fragment, container, false);

            return rootView;
        }
}
