package com.example.configurationproperties.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.nio.file.Path;

@ConfigurationProperties(prefix = "data.paths")
@ConstructorBinding
public class PathConfigProperties {
    private final Paths welcomeKit;
    private final Paths box;
    private final Paths zone;

    public PathConfigProperties(Paths welcomeKit, Paths box, Paths zone) {
        this.welcomeKit = welcomeKit;
        this.box = box;
        this.zone = zone;
    }

    public Paths getWelcomeKit() {
        return welcomeKit;
    }

    public Paths getBox() {
        return box;
    }

    public Paths getZone() {
        return zone;
    }

    public static class Paths {
        private final Path inboundPath;
        private final Path outboundPath;
        private final String filename;

        public Paths(Path inboundPath, Path outboundPath, String filename) {
            this.inboundPath = inboundPath;
            this.outboundPath = outboundPath;
            this.filename = filename;
        }

        public java.nio.file.Path getInboundPath() {
            return inboundPath;
        }

        public java.nio.file.Path getOutboundPath() {
            return outboundPath;
        }

        public String getFilename() {
            return filename;
        }
    }

}
