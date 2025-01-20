package org.acme;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(additionalProperties = Schema.False.class)
public record ModelConfig<ModelConfigurationOverrides_>(
        @Schema(nullable = true,
                description = "The configuration.") ModelConfigurationOverrides_ overrides) {
}
