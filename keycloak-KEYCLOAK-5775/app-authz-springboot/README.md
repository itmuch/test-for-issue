# Spring Boot does not honour wildcard auth-role 

In issue <https://issues.jboss.org/browse/KEYCLOAK-5775> , spring boot does not honour wildcard auth-role when using tomcat.

I use undertow, and I find that wildcard auth-role does not work, either.

Step:

1. clone this repo

2. import `app-authz-springboot/config/quickstart-realm.json` to keycloak

3. Start this repo

4. Call <http://localhost:8081> . In my opinion, this page should return OK, but only I get is a page like below:

   ```
   Whitelabel Error Page

   This application has no explicit mapping for /error, so you are seeing this as a fallback.

   Sat Dec 09 15:28:54 CST 2017
   There was an unexpected error (type=Forbidden, status=403).
   Forbidden
   ```

5. When I change 

   ```
   keycloak.securityConstraints[0].authRoles[0] = *
   ```

   to 

   ```
   keycloak.securityConstraints[0].authRoles[0] = **
   ```

   Everything turns OK.