"# restassured-qascript"

####Create secret_keys.properties 
Create this file in the folder src/main/resources/
and add following details:
postman_username=***
postman_password=***
git_token=****
open_weather_api_key=****

(Get these API key values form the user account created in the corrosponding API)

## Set up
```shell script
mvn clean install
```

## Run Test
```shell script
mvn clean test 
```

## Run cucumber Test
```shell script
mvn clean test -Dcucumber.options="--tags @git"
```