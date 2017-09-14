# Springfox Kotlin Test

Sample Spring Boot + SpringFox + Kotlin + jackson-module-kotlin test.

This project shows that using jackson-module-kotlin 2.9.x automatically marks non-nullable fields in Kotlin data classes as required in the Swagger spec (by automatically annotating those fields with `@JsonProperty(required = true)`).

Run it:

    $ ./gradlew bootRun

## How to check

Then visit the Swagger UI, click the Test Controller and then the `GET /test` endpoint.
Click the Model link to view the `TestResponse` model. You should see that the `nonNullableString` field
is not marked as optional, because the field is non-nullable in the response data class.

When jackson-module-kotlin is not present or older than 2.9.0 then non-nullable fields will not be marked as required. In that case you can add either `@JsonProperty(required = true)` or `@ApiModelProperty(required = true)` to the field to define it as required in the Swagger spec.

## Links

* GitHub issue: https://github.com/springfox/springfox/issues/2027
* Swagger UI: http://localhost:8080/swagger-ui.html
* Swagger spec: http://localhost:8080/v2/api-docs
* Test endpoint: Endpoint: http://localhost:8080/test
