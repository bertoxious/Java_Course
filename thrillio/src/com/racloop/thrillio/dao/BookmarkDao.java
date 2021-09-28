package com.racloop.thrillio.dao;

import com.racloop.thrillio.DataStore;
import com.racloop.thrillio.entities.Bookmark;
import com.racloop.thrillio.entities.UserBookmark;

public class BookmarkDao {
    public Bookmark[][] getBookmarks(){
        return DataStore.getBookmarks();
    }
    public void saveUserBookmark(UserBookmark userBookmark){
        DataStore.add(userBookmark);
    }
}
