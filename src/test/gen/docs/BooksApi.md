# BooksApi

All URIs are relative to *http://localhost:8080/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**booksGet**](BooksApi.md#booksGet) | **GET** /books | List all books |
| [**booksISBNAuthorsGet**](BooksApi.md#booksISBNAuthorsGet) | **GET** /books/{ISBN}/authors | List all authors of a book |
| [**booksISBNDelete**](BooksApi.md#booksISBNDelete) | **DELETE** /books/{ISBN} | Delete a book |
| [**booksISBNGet**](BooksApi.md#booksISBNGet) | **GET** /books/{ISBN} | Retrieve a book by ISBN |
| [**booksISBNOrdersGet**](BooksApi.md#booksISBNOrdersGet) | **GET** /books/{ISBN}/orders | List all orders containing a specific book |
| [**booksISBNPut**](BooksApi.md#booksISBNPut) | **PUT** /books/{ISBN} | Update an existing book |
| [**booksPost**](BooksApi.md#booksPost) | **POST** /books | Create a new book |


<a name="booksGet"></a>
# **booksGet**
> booksGet()

List all books

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    BooksApi apiInstance = new BooksApi(defaultClient);
    try {
      apiInstance.booksGet();
    } catch (ApiException e) {
      System.err.println("Exception when calling BooksApi#booksGet");
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
| **200** | Books Found |  -  |
| **404** | No books found |  -  |

<a name="booksISBNAuthorsGet"></a>
# **booksISBNAuthorsGet**
> booksISBNAuthorsGet(ISBN)

List all authors of a book

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    BooksApi apiInstance = new BooksApi(defaultClient);
    String ISBN = "ISBN_example"; // String | 
    try {
      apiInstance.booksISBNAuthorsGet(ISBN);
    } catch (ApiException e) {
      System.err.println("Exception when calling BooksApi#booksISBNAuthorsGet");
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
| **ISBN** | **String**|  | |

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
| **200** | All authors of the Book |  -  |
| **404** | No Authors of this Book are listed |  -  |

<a name="booksISBNDelete"></a>
# **booksISBNDelete**
> booksISBNDelete(ISBN)

Delete a book

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    BooksApi apiInstance = new BooksApi(defaultClient);
    String ISBN = "ISBN_example"; // String | 
    try {
      apiInstance.booksISBNDelete(ISBN);
    } catch (ApiException e) {
      System.err.println("Exception when calling BooksApi#booksISBNDelete");
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
| **ISBN** | **String**|  | |

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
| **204** | Book deleted |  -  |
| **404** | Book not deleted |  -  |

<a name="booksISBNGet"></a>
# **booksISBNGet**
> booksISBNGet(ISBN)

Retrieve a book by ISBN

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    BooksApi apiInstance = new BooksApi(defaultClient);
    String ISBN = "ISBN_example"; // String | 
    try {
      apiInstance.booksISBNGet(ISBN);
    } catch (ApiException e) {
      System.err.println("Exception when calling BooksApi#booksISBNGet");
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
| **ISBN** | **String**|  | |

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
| **200** | Book found |  -  |
| **404** | Book not found |  -  |

<a name="booksISBNOrdersGet"></a>
# **booksISBNOrdersGet**
> booksISBNOrdersGet(ISBN)

List all orders containing a specific book

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    BooksApi apiInstance = new BooksApi(defaultClient);
    String ISBN = "ISBN_example"; // String | 
    try {
      apiInstance.booksISBNOrdersGet(ISBN);
    } catch (ApiException e) {
      System.err.println("Exception when calling BooksApi#booksISBNOrdersGet");
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
| **ISBN** | **String**|  | |

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
| **200** | All orders with the book |  -  |
| **404** | There are no orders with this book |  -  |

<a name="booksISBNPut"></a>
# **booksISBNPut**
> booksISBNPut(ISBN, book)

Update an existing book

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    BooksApi apiInstance = new BooksApi(defaultClient);
    String ISBN = "ISBN_example"; // String | 
    Book book = new Book(); // Book | 
    try {
      apiInstance.booksISBNPut(ISBN, book);
    } catch (ApiException e) {
      System.err.println("Exception when calling BooksApi#booksISBNPut");
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
| **ISBN** | **String**|  | |
| **book** | [**Book**](Book.md)|  | |

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
| **200** | Book updated |  -  |
| **404** | Book not updated |  -  |

<a name="booksPost"></a>
# **booksPost**
> booksPost(book)

Create a new book

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    BooksApi apiInstance = new BooksApi(defaultClient);
    Book book = new Book(); // Book | 
    try {
      apiInstance.booksPost(book);
    } catch (ApiException e) {
      System.err.println("Exception when calling BooksApi#booksPost");
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
| **book** | [**Book**](Book.md)|  | |

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
| **201** | Book created |  -  |
| **400** | Book not created |  -  |

