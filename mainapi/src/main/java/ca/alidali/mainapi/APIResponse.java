package ca.alidali.mainapi;

public interface APIResponse {

    void onSuccess(Object result, int status);
    void onFailure(Object result, int status);
}
