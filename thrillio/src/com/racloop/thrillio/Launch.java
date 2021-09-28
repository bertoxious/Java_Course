package com.racloop.thrillio;

import com.racloop.thrillio.entities.Bookmark;
import com.racloop.thrillio.entities.User;
import com.racloop.thrillio.managers.BookmarkManager;
import com.racloop.thrillio.managers.UserManager;

public class Launch {

    private static User[] users;
    private static Bookmark[][] bookmarks;

    private static void loadData(){
        System.out.println("1. --- Loading Data -----");
        DataStore.loadData();

        users = UserManager.getInstance().getUsers();
        bookmarks = BookmarkManager.getInstance().getBookmarks();

        System.out.println(" ----- Printing Data ------ ");
        printUserData();
        printBookmarkData();
    }
    private static void printUserData(){
        for (User user : users){
            System.out.println(user);
        }
    }
    private static void printBookmarkData(){
        for (Bookmark[] bookmarklist: bookmarks){
            for (Bookmark bookmark: bookmarklist) {
                System.out.println(bookmark);
            }
        }
    }
    private static void startBookmarking(){
        System.out.println("\n ----->> Loading Data ...........");
        for (User user : users){
            View.bookmark(user, bookmarks);
        }
    }
    public static void main(String [] args){
        loadData();
        startBookmarking();
    }
}
