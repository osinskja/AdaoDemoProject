package com.example.demo;

public class Runner {
    public static void main(String[] args) {
        PlayerProfileManager playerProfileManager = new PlayerProfileManagerProxyImpl();
        playerProfileManager.displayPlayerProfile();
        playerProfileManager.displayPlayerProfile();
        PlayerProfileManager playerProfileManagerRefreshed = new PlayerProfileManagerProxyImpl();
        playerProfileManagerRefreshed.displayPlayerProfile();

    }
}
