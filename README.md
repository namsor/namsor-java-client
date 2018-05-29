# namsor-java-client

Namsor
- API version: 1.1.0
  - Build date: 2018-05-28T09:53:22.959+02:00

<h2>[NamSor](http://www.namsor.com) SDK infers Gender and Origin from international names</h2>  

<p>NamSor specialized data mining software recognizes the <strong>gender</strong>, the <strong>linguistic or cultural origin of personal names</strong> in any alphabet / language, with fine grain and high accuracy.</p>  

## Requirements

Building the API client library requires:
1. Java 1.7+
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
  <groupId>com.namsor</groupId>
  <artifactId>namsor-java-client</artifactId>
  <version>1.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.namsor:namsor-java-client:1.1.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/namsor-java-client-1.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.namsor.*;
import com.namsor.auth.*;
import com.namsor.model.*;
import com.namsor.api.GenderApi;

import java.io.File;
import java.util.*;

public class GenderApiExample {

    public static void main(String[] args) {
        
        GenderApi apiInstance = new GenderApi();
        String firstName = "\"John\""; // String | Firstname
        String lastName = "\"Smith\""; // String | Lastname
        String xChannelSecret = "\"\""; // String | Your API Key (Secret)
        String xChannelUser = "\"\""; // String | Your API Channel (User)
        try {
            OutputNameForGender result = apiInstance.extractGender(firstName, lastName, xChannelSecret, xChannelUser);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenderApi#extractGender");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.namsor.com/onomastics/api/json*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GenderApi* | [**extractGender**](docs/GenderApi.md#extractGender) | **GET** /gender/{firstName}/{lastName} | To genderize one name
*GenderApi* | [**extractGenderLocal**](docs/GenderApi.md#extractGenderLocal) | **GET** /gender/{firstName}/{lastName}/{countryIso2} | To genderize one name, with the context of a given country ISO2
*GenderListApi* | [**extractGenderList**](docs/GenderListApi.md#extractGenderList) | **POST** /genderList | To genderize many names (up to 1000).
*OriginApi* | [**extractOrigin**](docs/OriginApi.md#extractOrigin) | **GET** /origin/{firstName}/{lastName} | To determin the origin of a name
*OriginListApi* | [**extractOriginList**](docs/OriginListApi.md#extractOriginList) | **POST** /originList | To determin the origin of many names (up to 1000)
*ParseApi* | [**parseName**](docs/ParseApi.md#parseName) | **GET** /parse/{fullName} | Parse a fullName into firstName, lastName components.
*ParseListApi* | [**parseList**](docs/ParseListApi.md#parseList) | **POST** /parseList | Parse many names (up to 1000)


## Documentation for Models

 - [ExtractGenderListOutput](docs/ExtractGenderListOutput.md)
 - [ExtractOriginListOutput](docs/ExtractOriginListOutput.md)
 - [FullNameInput](docs/FullNameInput.md)
 - [FullNameListInput](docs/FullNameListInput.md)
 - [InputName](docs/InputName.md)
 - [NamesListInput](docs/NamesListInput.md)
 - [OutputNameForGender](docs/OutputNameForGender.md)
 - [OutputNameForOrigin](docs/OutputNameForOrigin.md)
 - [OutputParsedName](docs/OutputParsedName.md)
 - [ParsedNameListOutput](docs/ParsedNameListOutput.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

contact@namsor.com

