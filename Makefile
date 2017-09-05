build:
	gradle clean
	gradle :core:shadowJar
	mkdir -p app/build/libs
	rm -rf app/build/libs/*
	cp core/build/libs/*.jar app/build/libs
	gradle :app:shadowJar