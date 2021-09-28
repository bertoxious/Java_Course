package com.racloop.thrillio;

import com.racloop.thrillio.controllers.BookmarkController;
import com.racloop.thrillio.entities.Bookmark;
import com.racloop.thrillio.entities.User;

public class View {
    public static void bookmark(User user, Bookmark[][] bookmarks){
        System.out.println("\n"+ user.getEmail()+ " is bookmarking ");
        for (int i=0; i< 5; i++){
            int typeOffset = (int) (Math.random() * 3);
            int bookmarkOffset = (int) (Math.random() * 5);

            Bookmark bookmark = bookmarks[typeOffset][bookmarkOffset];

            BookmarkController.getInstance().saveUserBookmark(user, bookmark);
            System.out.println(bookmark);
        }
    }
}
