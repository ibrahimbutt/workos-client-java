/*
 * External User Management API
 * API for managing user information
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.model.CreateUserRequest;
import org.openapitools.client.model.ListUsers200Response;
import org.openapitools.client.model.UpdateUserRequest;
import org.openapitools.client.model.User;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
@Ignore
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    
    /**
     * Create a new user
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() {
        CreateUserRequest createUserRequest = null;

        User response = api.createUser(createUserRequest);

        // TODO: test validations
    }
    
    /**
     * Get a user by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserTest() {
        String id = null;

        User response = api.getUser(id);

        // TODO: test validations
    }
    
    /**
     * Get all users
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listUsersTest() {
        Integer limit = null;
        String before = null;
        String after = null;
        String order = null;

        ListUsers200Response response = api.listUsers(limit, before, after, order);

        // TODO: test validations
    }
    
    /**
     * Update a user by ID
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateUserTest() {
        String id = null;
        UpdateUserRequest updateUserRequest = null;

        User response = api.updateUser(id, updateUserRequest);

        // TODO: test validations
    }
    
}
