package com.bol.swaggertest

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModelProperty

data class TestResponse(
        val nonNullableString: String = "non-null",
        val nullableString: String? = null,
        @JsonProperty(required = true) val jsonPropertyRequiredString: String = "non-null",
        @ApiModelProperty(required = true) val apiModelPropertyRequired: String = "non-null"
)