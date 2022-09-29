package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class MainTest {

    PermissionManager permissionManager;

    HashMap<PermissionLevel, String> permissions = new HashMap<>();

    @BeforeEach
    void setUp() {
        permissionManager = new PermissionManager();
        permissions.put(PermissionLevel.ADMIN, "ADMIN");
        permissions.put(PermissionLevel.USER, "USER");
        permissions.put(PermissionLevel.DEVELOPER, "DEVELOPER");
    }

    @Test
    void testGetCurrentLevel() {
        for (PermissionLevel permissionLevel: permissions.keySet()){
            permissionManager.set(permissionLevel);
            assertEquals(permissions.get(permissionLevel), permissionManager.getCurrentLevel());
        }
    }
}