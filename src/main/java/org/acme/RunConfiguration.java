package org.acme;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import java.util.Set;

public record RunConfiguration(
        @Schema(nullable = true,
                description = "Optional name") String name,
        @Schema(nullable = true,
                description = "Optional maximum number.",
                minimum = "1", defaultValue = "1") Integer maxThreadCount,
        @JsonInclude(JsonInclude.Include.NON_NULL) @Schema(
                description = "Optional tags.") Set<String> tags) {

}
