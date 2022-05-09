package com.example.demo;

public class PlayerProfileManagerImpl implements PlayerProfileManager {

    private byte[] profilePicture;
    private String description;
    private String stats;

    public PlayerProfileManagerImpl(){
        loadPlayerProfile();
    }

    @Override
    public void displayPlayerProfile() {
        System.out.println("Displaying player's profile with " + profilePicture + " " + description + " " + stats);
    }

    private void loadPlayerProfile(){
        System.out.println("Loading profile...");
        stats = "loaded Stats";
        description = "loaded Description";
        profilePicture = new byte[4];
    }

}
