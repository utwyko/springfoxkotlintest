# Springfox Kotlin Test

Sample Spring Boot + SpringFox + Kotlin test.

Inferring whether a response property is optional based on Kotlin nullability is not working.

## Reproduce

    $ ./gradlew bootRun

Then visit the Swagger UI, click the Test Controller and then the `GET /test` endpoint.
Click the Model link to view the `TestResponse` model. You'll see that the `nonNullableString` field
is marked as optional, even though the field is non-nullable in the response data class.

It seems that adding either `@JsonProperty(required = true)` or `@ApiModelProperty(required = true)`
does mark fields as required in the Swagger spec.

(In a propject we can't publicly share only `@ApiModelProperty(required = true)` works, which is another mystery.)

## Links

* GitHub issue: https://github.com/springfox/springfox/issues/2027
* Swagger UI: http://localhost:8080/swagger-ui.html
* Swagger spec: http://localhost:8080/v2/api-docs
* Test endpoint: Endpoint: http://localhost:8080/test