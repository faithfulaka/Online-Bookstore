# OrdersApi

All URIs are relative to *http://localhost:8080/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ordersGet**](OrdersApi.md#ordersGet) | **GET** /orders | List all orders |
| [**ordersIdBooksGet**](OrdersApi.md#ordersIdBooksGet) | **GET** /orders/{id}/books | List all books in an order |
| [**ordersIdBooksISBNDelete**](OrdersApi.md#ordersIdBooksISBNDelete) | **DELETE** /orders/{id}/books/{ISBN} | Remove a book from an existing order |
| [**ordersIdBooksISBNPost**](OrdersApi.md#ordersIdBooksISBNPost) | **POST** /orders/{id}/books/{ISBN} | Add a book to an existing order |
| [**ordersIdGet**](OrdersApi.md#ordersIdGet) | **GET** /orders/{id} | Retrieve an order by its ID |
| [**ordersIdPut**](OrdersApi.md#ordersIdPut) | **PUT** /orders/{id} | Update an existing order |
| [**ordersPost**](OrdersApi.md#ordersPost) | **POST** /orders | Create a new order |


<a name="ordersGet"></a>
# **ordersGet**
> ordersGet()

List all orders

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    try {
      apiInstance.ordersGet();
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#ordersGet");
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
| **200** | Orders found |  -  |
| **404** | No orders found |  -  |

<a name="ordersIdBooksGet"></a>
# **ordersIdBooksGet**
> ordersIdBooksGet(id)

List all books in an order

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      apiInstance.ordersIdBooksGet(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#ordersIdBooksGet");
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
| **200** | Order Found |  -  |
| **404** | No books found in the order |  -  |

<a name="ordersIdBooksISBNDelete"></a>
# **ordersIdBooksISBNDelete**
> ordersIdBooksISBNDelete(id, ISBN)

Remove a book from an existing order

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    Integer id = 56; // Integer | 
    String ISBN = "ISBN_example"; // String | 
    try {
      apiInstance.ordersIdBooksISBNDelete(id, ISBN);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#ordersIdBooksISBNDelete");
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
| **204** | Book removed from the order |  -  |
| **404** | No book was removed from this order |  -  |

<a name="ordersIdBooksISBNPost"></a>
# **ordersIdBooksISBNPost**
> ordersIdBooksISBNPost(id, ISBN, book)

Add a book to an existing order

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    Integer id = 56; // Integer | 
    String ISBN = "ISBN_example"; // String | 
    Book book = new Book(); // Book | 
    try {
      apiInstance.ordersIdBooksISBNPost(id, ISBN, book);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#ordersIdBooksISBNPost");
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
| **201** | Books added to the order |  -  |
| **404** | No book added to this order |  -  |

<a name="ordersIdGet"></a>
# **ordersIdGet**
> ordersIdGet(id)

Retrieve an order by its ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      apiInstance.ordersIdGet(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#ordersIdGet");
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
| **200** | Order found |  -  |
| **404** | Order not found |  -  |

<a name="ordersIdPut"></a>
# **ordersIdPut**
> ordersIdPut(id, order)

Update an existing order

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    Integer id = 56; // Integer | 
    Order order = new Order(); // Order | 
    try {
      apiInstance.ordersIdPut(id, order);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#ordersIdPut");
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
| **order** | [**Order**](Order.md)|  | |

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
| **200** | Order updated |  -  |
| **404** | Order not updated |  -  |

<a name="ordersPost"></a>
# **ordersPost**
> ordersPost(order)

Create a new order

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/api/v1");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    Order order = new Order(); // Order | 
    try {
      apiInstance.ordersPost(order);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#ordersPost");
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
| **order** | [**Order**](Order.md)|  | |

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
| **201** | Order made |  -  |
| **400** | Order not made |  -  |

