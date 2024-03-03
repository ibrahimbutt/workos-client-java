# workos-client

External User Management API

- API version: 1.0.0

- Build date: 2024-03-03T18:52:34.218849Z[Europe/London]

API for managing user information


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.madebyibrahim</groupId>
  <artifactId>workos-client</artifactId>
  <version>0.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'workos-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'workos-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.madebyibrahim:workos-client:0.1.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/workos-client-0.1.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.madebyibrahim.workosclient.*;
import com.madebyibrahim.workosclient.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.UsersApi;

public class UsersApiExample {

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

## Documentation for API Endpoints

All URIs are relative to *https://api.workos.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*UsersApi* | [**createUser**](docs/UsersApi.md#createUser) | **POST** /user_management/users | Create a new user
*UsersApi* | [**getUser**](docs/UsersApi.md#getUser) | **GET** /user_management/users/{id} | Get a user by ID
*UsersApi* | [**listUsers**](docs/UsersApi.md#listUsers) | **GET** /user_management/users | Get all users
*UsersApi* | [**updateUser**](docs/UsersApi.md#updateUser) | **PUT** /user_management/users/{id} | Update a user by ID


## Documentation for Models

 - [CreateUserRequest](docs/CreateUserRequest.md)
 - [ListUsers200Response](docs/ListUsers200Response.md)
 - [ListUsers200ResponseListMetadata](docs/ListUsers200ResponseListMetadata.md)
 - [UpdateUserRequest](docs/UpdateUserRequest.md)
 - [User](docs/User.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="BearerAuth"></a>
### BearerAuth


- **Type**: HTTP Bearer Token authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



