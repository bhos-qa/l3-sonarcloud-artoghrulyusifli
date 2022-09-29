package org.example;

enum PermissionLevel{
    ADMIN, DEVELOPER, USER
}

class PermissionManager {
    private PermissionLevel mCurrentlevel = PermissionLevel.USER;

    public PermissionLevel set(PermissionLevel level){
        this.mCurrentlevel = level;
        return this.mCurrentlevel;
    }

    public String getCurrentLevel() {
        return switch (this.mCurrentlevel) {
            case USER -> "USER";
            case DEVELOPER -> "DEVELOPER";
            case ADMIN -> "ADMIN";
        };
    }
}