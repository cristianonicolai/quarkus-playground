package org.acme;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.util.Set;

@Schema(additionalProperties = Schema.False.class)
public record RunConfiguration(
        @Schema(nullable = true,
                description = "Optional name") @Size(
                min = 0, max = 255) String name,
        @Schema(nullable = true,
                description = "Optional maximum number.",
                minimum = "1", defaultValue = "1") @Positive Integer maxThreadCount,
        @JsonInclude(JsonInclude.Include.NON_NULL) @Schema(
                description = "Optional tags.") @Size(max = 100) Set<String> tags) {

}
