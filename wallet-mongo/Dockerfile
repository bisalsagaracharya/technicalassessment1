FROM openjdk:17
EXPOSE 8090
ADD target/wallet-mongo.jar wallet-mongo.jar
ENTRYPOINT ["java","-jar","wallet-mongo.jar"] 