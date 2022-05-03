# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.5/maven-plugin/reference/html/#build-image)
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.6.5/reference/htmlsingle/#boot-features-security)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.5/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

 spring:
  security:
   oauth2:
     client:
       registration:
         github:
           clientId: xxx
           clientSecret: xxx
         google:
          clientId: xx
          clientSecret: xx
         facebook:
          clientId: xx
          clientSecret: xx
          accessTokenUri: https://graph.facebook.com/oauth/access_token
          userAuthorizationUri: https://www.facebook.com/dialog/oauth
          tokenName: oauth_token
          authenticationScheme: query
          clientAuthenticationScheme: form
     resource:
       userInfoUri: https://graph.facebook.com/me
            
 
       
       Steps for setting up google client id and secret in gmail application.
       https://youtu.be/xH6hAW3EqLk
       
       Steps for setting up google client id and secret in github application.
       https://youtu.be/R9lxXQcy-nM  
       
       AWS
       S3 buckets
       
       client id
       cient secreit
       buckert  ame
       


