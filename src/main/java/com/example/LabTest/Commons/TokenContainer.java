package com.example.LabTest.Commons;



public class TokenContainer {
    private String authToken;
    private static TokenContainer tokenContainer;
    private TokenContainer(String authToken) {
        this.authToken = authToken;
    }

    private TokenContainer() {
    }


    //Getters and setters


    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    //Singleton Bean of this class
    public static TokenContainer getInstance(){
        if(tokenContainer==null){
            tokenContainer = new TokenContainer();

        }

            return tokenContainer;

    }
}
