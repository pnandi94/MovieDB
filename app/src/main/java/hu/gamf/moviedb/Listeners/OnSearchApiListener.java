package hu.gamf.moviedb.Listeners;

import hu.gamf.moviedb.Models.SearchApiResponse;

public interface OnSearchApiListener {
    void onResponse(SearchApiResponse response);
    void onError(String message);
}
