# Diet
1. What is the proposed name for your Web application?
   ---Diet
2. Who is the target audience for your Web application?
   ---People want to lose weight or keep a diet.
3. What problem is it intended to solve for the target audience?
   ---People who want to keep in good shape probalby get in to hard condition to choose something to eat, because some food may contains much more calorie than one can imagine which will ruin the whole diet plan or the whole day's working-out. Furthermore, some have monotonous dishes like vegetables and fruits just in case of intake much calorie. I'll provide calorie inventory of all kinds of food and recommand abundant healthy, low-calorie dishes that they can choose from.

## Build status
[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-ninazhang935.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-ninazhang935)

## Changelog

[Changelog](CHANGELOG.md) 

## Web Site

[Diet](https://vast-lowlands-52494.herokuapp.com/)


## Key Features

TODO : Please list key features of your project.

* Key Feature 1
* Key Feature 2
* Key Feature N

## Project Details

### Landing Page

TODO : please provide a description of your landing page inluding a screen shot ![](https://.../image.JPG)

### User Input Form

TODO : please provide a description of at least 1 user input form including a screen shot ![](https://.../image.jpg)

## API

TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    POST photos/:id/tags

#### Parameters

- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.

#### Response

A JSON or XMLobject containing the PhotoID and list of tags accepted.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.
