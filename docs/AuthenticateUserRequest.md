

# AuthenticateUserRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**clientId** | **String** | The client id of the application |  |
|**clientSecret** | **String** | The client secret of the application |  |
|**grantType** | [**GrantTypeEnum**](#GrantTypeEnum) | The grant type of the application |  [optional] |
|**email** | **String** | The user&#39;s email address |  |
|**password** | **String** | The user&#39;s password |  |
|**code** | **String** | The verification code sent to the user&#39;s email address |  |
|**pendingAuthenticationToken** | **String** | The pending authentication token |  |



## Enum: GrantTypeEnum

| Name | Value |
|---- | -----|
| PASSWORD | &quot;password&quot; |



