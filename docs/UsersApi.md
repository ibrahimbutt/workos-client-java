# UsersApi

All URIs are relative to *https://api.workos.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authenticateUser**](UsersApi.md#authenticateUser) | **POST** /user_management/authenticate | Authenticate a user with a verification code |
| [**confirmEmail**](UsersApi.md#confirmEmail) | **POST** /user_management/users/{id}/email_verification/confirm | Confirm a user&#39;s email address |
| [**createUser**](UsersApi.md#createUser) | **POST** /user_management/users | Create a new user |
| [**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /user_management/users/{id} | Delete a user by ID |
| [**getUser**](UsersApi.md#getUser) | **GET** /user_management/users/{id} | Get a user by ID |
| [**listUsers**](UsersApi.md#listUsers) | **GET** /user_management/users | Get all users |
| [**sendVerificationEmail**](UsersApi.md#sendVerificationEmail) | **POST** /user_management/users/{id}/email_verification/send | Send a verification email |
| [**updateUser**](UsersApi.md#updateUser) | **PUT** /user_management/users/{id} | Update a user by ID |



## authenticateUser

> AuthenticatedUserResponse authenticateUser(authenticateUserRequest)

Authenticate a user with a verification code

### Example

```java
// Import classes:
import com.madebyibrahim.workosclient.ApiClient;
import com.madebyibrahim.workosclient.ApiException;
import com.madebyibrahim.workosclient.Configuration;
import com.madebyibrahim.workosclient.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.workos.com");

        UsersApi apiInstance = new UsersApi(defaultClient);
        AuthenticateUserRequest authenticateUserRequest = new AuthenticateUserRequest(); // AuthenticateUserRequest | 
        try {
            AuthenticatedUserResponse result = apiInstance.authenticateUser(authenticateUserRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#authenticateUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authenticateUserRequest** | [**AuthenticateUserRequest**](AuthenticateUserRequest.md)|  | |

### Return type

[**AuthenticatedUserResponse**](AuthenticatedUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User authenticated successfully |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | User not found |  -  |
| **429** | Too many requests |  -  |
| **500** | Internal server error |  -  |


## confirmEmail

> AuthenticatedUserResponse confirmEmail(id, confirmEmailRequest)

Confirm a user&#39;s email address

### Example

```java
// Import classes:
import com.madebyibrahim.workosclient.ApiClient;
import com.madebyibrahim.workosclient.ApiException;
import com.madebyibrahim.workosclient.Configuration;
import com.madebyibrahim.workosclient.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.workos.com");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String id = "id_example"; // String | 
        ConfirmEmailRequest confirmEmailRequest = new ConfirmEmailRequest(); // ConfirmEmailRequest | 
        try {
            AuthenticatedUserResponse result = apiInstance.confirmEmail(id, confirmEmailRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#confirmEmail");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **confirmEmailRequest** | [**ConfirmEmailRequest**](ConfirmEmailRequest.md)|  | |

### Return type

[**AuthenticatedUserResponse**](AuthenticatedUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Confirmed email address successfully |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | User not found |  -  |
| **429** | Too many requests |  -  |
| **500** | Internal server error |  -  |


## createUser

> User createUser(createUserRequest)

Create a new user

### Example

```java
// Import classes:
import com.madebyibrahim.workosclient.ApiClient;
import com.madebyibrahim.workosclient.ApiException;
import com.madebyibrahim.workosclient.Configuration;
import com.madebyibrahim.workosclient.auth.*;
import com.madebyibrahim.workosclient.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.workos.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        CreateUserRequest createUserRequest = new CreateUserRequest(); // CreateUserRequest | 
        try {
            User result = apiInstance.createUser(createUserRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#createUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)|  | |

### Return type

[**User**](User.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | User created successfully |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **429** | Too many requests |  -  |
| **500** | Internal server error |  -  |


## deleteUser

> deleteUser(id)

Delete a user by ID

### Example

```java
// Import classes:
import com.madebyibrahim.workosclient.ApiClient;
import com.madebyibrahim.workosclient.ApiException;
import com.madebyibrahim.workosclient.Configuration;
import com.madebyibrahim.workosclient.auth.*;
import com.madebyibrahim.workosclient.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.workos.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            apiInstance.deleteUser(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#deleteUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User deleted successfully |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | User not found |  -  |
| **429** | Too many requests |  -  |
| **500** | Internal server error |  -  |


## getUser

> User getUser(id)

Get a user by ID

### Example

```java
// Import classes:
import com.madebyibrahim.workosclient.ApiClient;
import com.madebyibrahim.workosclient.ApiException;
import com.madebyibrahim.workosclient.Configuration;
import com.madebyibrahim.workosclient.auth.*;
import com.madebyibrahim.workosclient.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.workos.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            User result = apiInstance.getUser(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**User**](User.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User found |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | User not found |  -  |
| **429** | Too many requests |  -  |
| **500** | Internal server error |  -  |


## listUsers

> ListUsers200Response listUsers(limit, before, after, order)

Get all users

### Example

```java
// Import classes:
import com.madebyibrahim.workosclient.ApiClient;
import com.madebyibrahim.workosclient.ApiException;
import com.madebyibrahim.workosclient.Configuration;
import com.madebyibrahim.workosclient.auth.*;
import com.madebyibrahim.workosclient.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.workos.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        Integer limit = 56; // Integer | The maximum number of users to return
        String before = "before_example"; // String | The user id to use as a cursor for pagination
        String after = "after_example"; // String | The user id to use as a cursor for pagination
        String order = "asc"; // String | The order to return users in
        try {
            ListUsers200Response result = apiInstance.listUsers(limit, before, after, order);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#listUsers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| The maximum number of users to return | [optional] |
| **before** | **String**| The user id to use as a cursor for pagination | [optional] |
| **after** | **String**| The user id to use as a cursor for pagination | [optional] |
| **order** | **String**| The order to return users in | [optional] [enum: asc, desc] |

### Return type

[**ListUsers200Response**](ListUsers200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of users |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **429** | Too many requests |  -  |
| **500** | Internal server error |  -  |


## sendVerificationEmail

> AuthenticatedUserResponse sendVerificationEmail(id)

Send a verification email

### Example

```java
// Import classes:
import com.madebyibrahim.workosclient.ApiClient;
import com.madebyibrahim.workosclient.ApiException;
import com.madebyibrahim.workosclient.Configuration;
import com.madebyibrahim.workosclient.auth.*;
import com.madebyibrahim.workosclient.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.workos.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            AuthenticatedUserResponse result = apiInstance.sendVerificationEmail(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#sendVerificationEmail");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |

### Return type

[**AuthenticatedUserResponse**](AuthenticatedUserResponse.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sent verification email successfully |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | User not found |  -  |
| **429** | Too many requests |  -  |
| **500** | Internal server error |  -  |


## updateUser

> User updateUser(id, updateUserRequest)

Update a user by ID

### Example

```java
// Import classes:
import com.madebyibrahim.workosclient.ApiClient;
import com.madebyibrahim.workosclient.ApiException;
import com.madebyibrahim.workosclient.Configuration;
import com.madebyibrahim.workosclient.auth.*;
import com.madebyibrahim.workosclient.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.workos.com");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String id = "id_example"; // String | 
        UpdateUserRequest updateUserRequest = new UpdateUserRequest(); // UpdateUserRequest | 
        try {
            User result = apiInstance.updateUser(id, updateUserRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#updateUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**|  | |
| **updateUserRequest** | [**UpdateUserRequest**](UpdateUserRequest.md)|  | |

### Return type

[**User**](User.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User updated successfully |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | User not found |  -  |
| **429** | Too many requests |  -  |
| **500** | Internal server error |  -  |

