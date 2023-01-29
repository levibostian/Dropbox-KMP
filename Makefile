SHELL = /bin/sh

buildjs:
	./gradlew jsMainClasses

# publishes kotlin modules to maven local for you to import in your KMP project.
# not what you want if you, for example, want to generate a JS file and import that into npm project.
publishMavenLocal:
	./gradlew publishToMavenLocal

openapi-gen-client:
	openapi-generator generate --input-spec https://gist.githubusercontent.com/levibostian/86248f2dfdb7601ec378bb77b0d45e34/raw/142e78a76b2d0193e99f9b388ca83c23d154d45d/foo.yaml --generator-name kotlin --library=multiplatform --package-name earth.levi.dropbox --output shared --model-name-suffix "Model"