package app.com.newshub.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.content.Loader;
import android.util.Log;

import com.example.android.newshub.R;

import java.util.List;

import app.com.newshub.News;
import app.com.newshub.NewsLoader;
import app.com.newshub.NewsPreferences;

/**
 * The SocietyFragment is a {@link BaseArticlesFragment} subclass that
 * reuses methods of the parent class by passing the specific type of article to be fetched.
 */
public class SocietyFragment extends BaseArticlesFragment {

    private static final String LOG_TAG = SocietyFragment.class.getName();

    @NonNull
    @Override
    public Loader<List<News>> onCreateLoader(int i, Bundle bundle) {
        String societyUrl = NewsPreferences.getPreferredUrl(getContext(), getString(R.string.society));
        Log.e(LOG_TAG, societyUrl);

        // Create a new loader for the given URL
        return new NewsLoader(getActivity(), societyUrl);
    }
}
