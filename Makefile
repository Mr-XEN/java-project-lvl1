.DEFAULT_GOAL := build-run

setup:
	./gradlew wrapper --gradle-version 7.1.1

clean:
	./gradlew clean

build: clean
	./gradlew build

install: clean
	./gradlew install

run-dist:
	./build/install/app/bin/app

lint:
	./gradlew checkstyleMain

check-updates:
	./gradlew dependencyUpdates
