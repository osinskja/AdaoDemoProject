package com.example.demo;

public class PlayerProfileManagerProxyImpl implements PlayerProfileManager {

    private PlayerProfileManager playerProfileManager;

    @Override
    public void displayPlayerProfile() {
        if(playerProfileManager == null) {
            playerProfileManager = new PlayerProfileManagerImpl();
        }
        playerProfileManager.displayPlayerProfile();
    }


}
