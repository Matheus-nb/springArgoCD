FROM openjdk

WORKDIR /app

COPY target/argocd-0.0.1-SNAPSHOT.jar /app/argocd.jar

ENTRYPOINT ["java", "-jar", "argocd.jar"]