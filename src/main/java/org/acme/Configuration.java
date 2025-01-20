package org.acme;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(additionalProperties = Schema.False.class)
public record Configuration<ModelConfigurationOverrides_>(
        @Schema(nullable = true, description = "The run configuration.") RunConfiguration run,
        @Schema(nullable = true,
                description = "The configuration") ModelConfig<ModelConfigurationOverrides_> model) {

}
