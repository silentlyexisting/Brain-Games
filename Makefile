setup:
	gradle wrapper --gradle-version 7.2

install:
	./gradlew clean install
	
run-dist: 
	./build/install/app/bin/app

check-updates: 
	./gradlew dependencyUpdates
	
lint:
	./gradlew checkstyleMain
	
build:
	./gradlew clean build
