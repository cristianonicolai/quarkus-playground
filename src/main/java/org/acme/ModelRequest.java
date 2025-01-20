package org.acme;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(additionalProperties = Schema.False.class)
public record ModelRequest<ModelInput_, ModelConfigurationOverrides_>(
        @Schema(nullable = true,
                name = "config",
                description = "The configuration.") @JsonProperty("config") Configuration<ModelConfigurationOverrides_> configuration,

        @Schema(required = true, description = "The model input to solve.") ModelInput_ modelInput) {

}
