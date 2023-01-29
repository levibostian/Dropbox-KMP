SHELL = /bin/sh

buildjs:
	./gradlew jsMainClasses

# publishes kotlin modules to maven local for you to import in your KMP project.
# not what you want if you, for example, want to generate a JS file and import that into npm project.
publishMavenLocal:
	./gradlew publishToMavenLocal

openapi-gen-client:
	openapi-generator generate --input-spec dropbox-openapi-spec.yml --generator-name kotlin --library=multiplatform --package-name earth.levi.dropbox --model-name-suffix "Model"