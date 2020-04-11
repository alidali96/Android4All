package ca.alidali.mainapi;

import com.android.volley.VolleyError;

/**
 * All Classes that uses MainAPI <strong>must</strong> implements this interface
 *
 * @author Ali Dali
 * @version 1.0
 * @since 22-02-2020
 */
public interface APIResponse {
    void onSuccess(Object json, int status, int request);
    void onFailure(VolleyError error, int status, int request);
}
