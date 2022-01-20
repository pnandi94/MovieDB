package hu.gamf.moviedb.Listeners;

import hu.gamf.moviedb.Models.DetailApiResponse;

public interface OnDetailsApiListener {
    void onResponse(DetailApiResponse response);
    void onError(String message);
}
