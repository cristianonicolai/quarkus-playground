package org.acme;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(additionalProperties = Schema.False.class)
public record Configuration(
        @Schema(nullable = true, description = "The run configuration.") RunConfiguration run) {

}
