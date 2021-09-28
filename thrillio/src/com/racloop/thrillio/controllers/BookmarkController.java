package com.racloop.thrillio.controllers;

import com.racloop.thrillio.entities.Bookmark;
import com.racloop.thrillio.entities.User;
import com.racloop.thrillio.managers.BookmarkManager;

public class BookmarkController {
    private static BookmarkController instance = new BookmarkController();
    private BookmarkController(){}
    public static BookmarkController getInstance(){
        return instance;
    }
    public void saveUserBookmark(User user, Bookmark bookmark){
        BookmarkManager.getInstance().saveUserBookmark(user,bookmark);
    }
}
