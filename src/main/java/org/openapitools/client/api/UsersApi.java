package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CreateUserRequest;
import org.openapitools.client.model.ListUsers200Response;
import org.openapitools.client.model.UpdateUserRequest;
import org.openapitools.client.model.User;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-03T15:32:47.282696Z[Europe/London]")
public class UsersApi {
    private ApiClient apiClient;

    public UsersApi() {
        this(new ApiClient());
    }

    public UsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new user
     * 
     * <p><b>200</b> - User created successfully
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>429</b> - Too many requests
     * <p><b>500</b> - Internal server error
     * @param createUserRequest  (required)
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User createUser(CreateUserRequest createUserRequest) throws RestClientException {
        return createUserWithHttpInfo(createUserRequest).getBody();
    }

    /**
     * Create a new user
     * 
     * <p><b>200</b> - User created successfully
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>429</b> - Too many requests
     * <p><b>500</b> - Internal server error
     * @param createUserRequest  (required)
     * @return ResponseEntity&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<User> createUserWithHttpInfo(CreateUserRequest createUserRequest) throws RestClientException {
        Object localVarPostBody = createUserRequest;
        
        // verify the required parameter 'createUserRequest' is set
        if (createUserRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createUserRequest' when calling createUser");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BearerAuth" };

        ParameterizedTypeReference<User> localReturnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI("/user_management/users", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a user by ID
     * 
     * <p><b>200</b> - User found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - User not found
     * <p><b>429</b> - Too many requests
     * <p><b>500</b> - Internal server error
     * @param id  (required)
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User getUser(String id) throws RestClientException {
        return getUserWithHttpInfo(id).getBody();
    }

    /**
     * Get a user by ID
     * 
     * <p><b>200</b> - User found
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - User not found
     * <p><b>429</b> - Too many requests
     * <p><b>500</b> - Internal server error
     * @param id  (required)
     * @return ResponseEntity&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<User> getUserWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BearerAuth" };

        ParameterizedTypeReference<User> localReturnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI("/user_management/users/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all users
     * 
     * <p><b>200</b> - A list of users
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>429</b> - Too many requests
     * <p><b>500</b> - Internal server error
     * @param limit The maximum number of users to return (optional)
     * @param before The user id to use as a cursor for pagination (optional)
     * @param after The user id to use as a cursor for pagination (optional)
     * @param order The order to return users in (optional)
     * @return ListUsers200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListUsers200Response listUsers(Integer limit, String before, String after, String order) throws RestClientException {
        return listUsersWithHttpInfo(limit, before, after, order).getBody();
    }

    /**
     * Get all users
     * 
     * <p><b>200</b> - A list of users
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>429</b> - Too many requests
     * <p><b>500</b> - Internal server error
     * @param limit The maximum number of users to return (optional)
     * @param before The user id to use as a cursor for pagination (optional)
     * @param after The user id to use as a cursor for pagination (optional)
     * @param order The order to return users in (optional)
     * @return ResponseEntity&lt;ListUsers200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListUsers200Response> listUsersWithHttpInfo(Integer limit, String before, String after, String order) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "before", before));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "after", after));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BearerAuth" };

        ParameterizedTypeReference<ListUsers200Response> localReturnType = new ParameterizedTypeReference<ListUsers200Response>() {};
        return apiClient.invokeAPI("/user_management/users", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a user by ID
     * 
     * <p><b>200</b> - User updated successfully
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - User not found
     * <p><b>429</b> - Too many requests
     * <p><b>500</b> - Internal server error
     * @param id  (required)
     * @param updateUserRequest  (required)
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User updateUser(String id, UpdateUserRequest updateUserRequest) throws RestClientException {
        return updateUserWithHttpInfo(id, updateUserRequest).getBody();
    }

    /**
     * Update a user by ID
     * 
     * <p><b>200</b> - User updated successfully
     * <p><b>400</b> - Bad request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - User not found
     * <p><b>429</b> - Too many requests
     * <p><b>500</b> - Internal server error
     * @param id  (required)
     * @param updateUserRequest  (required)
     * @return ResponseEntity&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<User> updateUserWithHttpInfo(String id, UpdateUserRequest updateUserRequest) throws RestClientException {
        Object localVarPostBody = updateUserRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateUser");
        }
        
        // verify the required parameter 'updateUserRequest' is set
        if (updateUserRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateUserRequest' when calling updateUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BearerAuth" };

        ParameterizedTypeReference<User> localReturnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI("/user_management/users/{id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
