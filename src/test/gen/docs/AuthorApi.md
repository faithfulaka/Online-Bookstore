# AuthorApi

All URIs are relative to *http://localhost:8080/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authorsGet**](AuthorApi.md#authorsGet) | **GET** /authors | List all authors |
| [**authorsIdBooksGet**](AuthorApi.md#authorsIdBooksGet) | **GET** /authors/{id}/books | List all books written by a specific author |
| [**authorsIdDelete**](AuthorApi.md#authorsIdDelete) | **DELETE** /authors/{id} | Delete an author |
| [**authorsIdGet**](AuthorApi.md#authorsIdGet) | **GET** /authors/{id} | Retrieve an author by their ID |
| [**authorsIdPut**](AuthorApi.md#authorsIdPut) | **PUT** /authors/{id} | Update an existing author |
| [**authorsPost**](AuthorApi.md#authorsPost) | **POST** /authors | Create a new author |


<a name="authorsGet"></a>
# **authorsGet**
> authorsGet()

List all authors

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    AuthorApi apiInstance = new AuthorApi(defaultClient);
    try {
      apiInstance.authorsGet();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorApi#authorsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Authors found |  -  |
| **404** | No authors found |  -  |

<a name="authorsIdBooksGet"></a>
# **authorsIdBooksGet**
> authorsIdBooksGet(id)

List all books written by a specific author

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    AuthorApi apiInstance = new AuthorApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      apiInstance.authorsIdBooksGet(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorApi#authorsIdBooksGet");
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
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Books found by author |  -  |
| **404** | Books by author not Found |  -  |

<a name="authorsIdDelete"></a>
# **authorsIdDelete**
> authorsIdDelete(id)

Delete an author

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    AuthorApi apiInstance = new AuthorApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      apiInstance.authorsIdDelete(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorApi#authorsIdDelete");
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
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Author deleted |  -  |
| **404** | Author not deleted |  -  |

<a name="authorsIdGet"></a>
# **authorsIdGet**
> authorsIdGet(id)

Retrieve an author by their ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    AuthorApi apiInstance = new AuthorApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      apiInstance.authorsIdGet(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorApi#authorsIdGet");
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
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Author found |  -  |
| **404** | Author not found |  -  |

<a name="authorsIdPut"></a>
# **authorsIdPut**
> authorsIdPut(id, author)

Update an existing author

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    AuthorApi apiInstance = new AuthorApi(defaultClient);
    Integer id = 56; // Integer | 
    Author author = new Author(); // Author | 
    try {
      apiInstance.authorsIdPut(id, author);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorApi#authorsIdPut");
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
| **id** | **Integer**|  | |
| **author** | [**Author**](Author.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Author updated |  -  |
| **404** | Author not updated |  -  |

<a name="authorsPost"></a>
# **authorsPost**
> authorsPost(author)

Create a new author

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    AuthorApi apiInstance = new AuthorApi(defaultClient);
    Author author = new Author(); // Author | 
    try {
      apiInstance.authorsPost(author);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthorApi#authorsPost");
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
| **author** | [**Author**](Author.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Author created |  -  |
| **409** | Author not created |  -  |

